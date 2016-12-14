package negocio;
import javax.ejb.EJB;
import javax.ejb.Stateless;

import Dominio.Pedido;
import Interfaces.IGestionPedidos;

@Stateless
public class GestionPedidos implements IGestionPedidos {

	@EJB
	public IGestionPedidos pedidos;
	
	public GestionPedidos(){
		
	}
	
	public Pedido procesarPedido() {
		return pedidos.procesarPedido();
	}

	public Pedido entregarPedido(int id) {
		return pedidos.entregarPedido(id);
	}

	public Pedido getPedido(int id) {
		return pedidos.getPedido(id);
	}

}
