package Interfaces;
import Dominio.Pedido;

import javax.ejb.Remote;

import Dominio.Articulo;

@Remote
public interface IRealizarPedido {
	boolean realizarPedido(Pedido ped);
	boolean asignaArticulo(Pedido p,Articulo a,int cantidad);
	boolean confirmaPedido(Pedido p);
}
