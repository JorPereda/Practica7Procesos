package Interfaces;
import Dominio.Pedido;

import javax.ejb.Remote;

import Dominio.Articulo;

@Remote
public interface IRealizarPedido {
	boolean realizarPedido(String dni);
	boolean asignaArticulo(Pedido p,Articulo a,int cantidad);
	int confirmaPedido(Pedido p);
}
