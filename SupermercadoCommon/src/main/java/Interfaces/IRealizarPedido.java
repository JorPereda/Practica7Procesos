package Interfaces;
import Dominio.Pedido;
import Dominio.Articulo;

public interface IRealizarPedido {
	boolean realizarPedido(String dni);
	boolean asignaArticulo(Pedido p,Articulo a,int cantidad);
	int confirmaPedido(Pedido p);
}
