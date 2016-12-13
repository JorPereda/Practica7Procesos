package Dominio;

import java.util.List;

import Interfaces.IPedidosDAO;

public class PedidosDAO implements IPedidosDAO {

	private List<Pedido> listaPedidos;
	
	public Pedido getPedido(int p) {
		for(int i=0; i<listaPedidos.size(); i++){
			Pedido ped=listaPedidos.get(i);
			if(ped.getIdPedido()==p){
				return ped;
			}
		}
		return null;
	}

	public Pedido creaPedido(Pedido ped) {
		listaPedidos.add(ped);
		return ped;
	}

	public Pedido actualizaPedido(Pedido nuevoPedido) {
		for(int i=0; i<listaPedidos.size(); i++){
			Pedido p=listaPedidos.get(i);
			if(p.getIdPedido()==nuevoPedido.getIdPedido()){
				listaPedidos.remove(i);
				listaPedidos.add(nuevoPedido);
				return nuevoPedido;
			}
		}
		return null;
	}

	public Pedido eliminaPedido(Pedido ped) {
		for(int i=0;i<listaPedidos.size();i++){
			if(listaPedidos.get(i).equals(ped)){
				listaPedidos.remove(i);
				return listaPedidos.get(i);
			}
		}
		return null;
	}

	public List<Pedido> listaPedidos() {
		return listaPedidos;
	}

}
