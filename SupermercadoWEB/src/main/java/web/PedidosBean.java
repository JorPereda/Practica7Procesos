package web;



//import java.io.IOException;

import javax.ejb.EJB;
import javax.faces.bean.SessionScoped;
import javax.inject.Named;

import Dominio.Articulo;
import Dominio.Pedido;
import Dominio.Usuario;
import Interfaces.IInventario;
import Interfaces.IRealizarPedido;
import Interfaces.IUsuarios;

@Named
@SessionScoped
public class PedidosBean {
	
	@EJB
	private IRealizarPedido miPedido;
	@EJB
	private IUsuarios usuarios;
	@EJB
	private IInventario articulos;
	
	private String user;
	private Articulo articulo;
	private Pedido pedido;
	private int cantidad;
	private double precio;
	
	/**
	 * Login del cliente
	 * @return pagina articulos.xhtml (exito), pagina error.xhtml (fallo)
	 */
	public String login(){
		Usuario u = usuarios.getUsuario(user);
		if(u!=null){
			pedido = new Pedido();
			return "articulos.xhtml";
		}else{
			return "error.xhmtl";
		}
	}

	/**
	 * Añade producto al carro para seleccionar su cantidad
	 * @return pagina carrito.xhtml
	 */
	public String muestraCarrito(int id) {
		articulo = articulos.getArticulo(id);
		return "carrito.xhtml";
	}

	/**
	 * Añade el producto con la cantidad seleccionada a la cesta final
	 * @return pagina cestafinal.xhtml
	 */
	public String addCarrito(){
		miPedido.asignaArticulo(pedido, articulo, cantidad);
		return "cestafinal.xhtml";
	}
	
	/**
	 * Confirma la compra de todos los articulos
	 * @return
	 */
	public String confirmarCarro(){
		miPedido.confirmaPedido(pedido);
		System.out.println(pedido.getIdPedido());
		return "login.xhtml";
	}


	public String getUser() {
		return user;
	}


	public void setUser(String user) {
		this.user = user;
	}


	public Articulo getArticulo() {
		return articulo;
	}


	public void setArticulo(Articulo articulo) {
		this.articulo = articulo;
	}


	public int getCantidad() {
		return cantidad;
	}


	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	

}
