package web;

import javax.annotation.PostConstruct;

//import java.io.IOException;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import Dominio.Articulo;
import Dominio.Pedido;
import Dominio.Usuario;
import Interfaces.IRealizarPedido;
import Interfaces.IUsuarios;

@Named
@SessionScoped
public class PedidosBean {
	
	@EJB
	private IRealizarPedido miPedido;
	@EJB
	private IUsuarios usuarios;
	
	private String user;
	private Articulo articulo;
	private int cantidad;
	private double precio;
	
	/**
	 * Login del cliente
	 * @return
	 */
	public String login(){
		Usuario u = usuarios.getUsuario(user);
		if(u!=null){
			return "articulos.xhtml";
		}else{
			return "error.xhmtl";
		}
	}

	/**
	 * Añade producto al carro para seleccionar su cantidad
	 * @return
	 */
	public String muestraCarrito() {
		
		return "carrito.xhtml";
	}

	/**
	 * Añadde el producto con la cantidad seleccionada a la cesta final
	 * @return
	 */
	public String addCarrito(){
		return "cestafinal.xhtml";
	}
	
	/**
	 * Confirma la compra de todos los articulos
	 * @return
	 */
	public String confirmarCarro(){
		return ".xhtml";
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
