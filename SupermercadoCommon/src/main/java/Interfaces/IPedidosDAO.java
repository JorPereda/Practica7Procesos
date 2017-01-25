package Interfaces;

import java.util.List;

import javax.ejb.Remote;

import Dominio.Pedido;

@Remote
public interface IPedidosDAO {
	
	Pedido getPedido(int p);
	Pedido creaPedido(Pedido ped);
	Pedido actualizaPedido(Pedido nuevoPedido);
	Pedido eliminaPedido(Pedido ped);
	List<Pedido> listaPedidos();
	boolean confirmaPedido(Pedido ped);

}
