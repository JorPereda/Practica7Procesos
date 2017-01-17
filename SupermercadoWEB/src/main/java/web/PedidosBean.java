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
import Interfaces.IRealizarPedido;

@Named
@SessionScoped
public class PedidosBean {
	
	@EJB
	private IRealizarPedido miPedido;
	
	public String realizarPedido(String dni){
		
	}


	public String asignaArticulo(Pedido ped, Articulo art, int cantidad) {

	}


	public String confirmarPedido(Pedido ped){

	}


}
