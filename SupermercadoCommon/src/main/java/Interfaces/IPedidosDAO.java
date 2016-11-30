package Interfaces;

import java.util.List;

import Dominio.Pedido;

public interface IPedidosDAO {
	
	Pedido getPedido(int p);
	Pedido creaPedido(Pedido ped);
	Pedido actualizaPedido(Pedido nuevoPedido);
	Pedido eliminaPedido(Pedido ped);
	List<Pedido> listaPedidos();

}
