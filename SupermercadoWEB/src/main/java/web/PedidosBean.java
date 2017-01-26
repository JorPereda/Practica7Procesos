package web;



import java.io.Serializable;
import java.util.List;

//import java.io.IOException;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import Dominio.Articulo;
import Dominio.Pedido;
import Dominio.Usuario;
import Interfaces.IInventario;
import Interfaces.IRealizarPedido;
import Interfaces.IUsuarios;

@Named
@SessionScoped
public class PedidosBean implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@EJB
	private IRealizarPedido miPedido;
	@EJB
	private IUsuarios usuarios;
	@EJB
	private IInventario articulos;
	
	private String user;
	private String articulo;
	private Pedido pedido;
	private List<Articulo> listaArticulos;
	private int cantidad;
	private double precio;
	
	/**
	 * Login del cliente
	 * @return pagina articulos.xhtml (exito), pagina error.xhtml (fallo)
	 */
	public String login(){
		Usuario u = usuarios.getUsuario(user);
		listaArticulos = articulos.listArticulos();
		if(u!=null){
			pedido = new Pedido();
			return "articulos.xhtml";
		}else{
			return "error.xhmtl";
		}
	}

	public List<Articulo> getListaArticulos() {
		return listaArticulos;
	}

	public void setListaArticulos(List<Articulo> listaArticulos) {
		this.listaArticulos = listaArticulos;
	}

	/**
	 * Añade producto al carro para seleccionar su cantidad
	 * @return pagina carrito.xhtml
	 */
	public String muestraCarrito(int id) {
		articulo = articulos.getArticulo(id).getNombre();
		return "carrito.xhtml";
	}

	/**
	 * Añade el producto con la cantidad seleccionada a la cesta final
	 * @return pagina cestafinal.xhtml
	 */
	public String addCarrito(int cant){
		Articulo art = articulos.getArticuloNombre(articulo);
		art.setStock(cantidad + cant);
		cantidad = cant;
		precio = art.getPrecio()*cantidad;
		miPedido.asignaArticulo(pedido, art, cant);
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


	public String getArticulo() {
		return articulo;
	}


	public void setArticulo(String articulo) {
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
