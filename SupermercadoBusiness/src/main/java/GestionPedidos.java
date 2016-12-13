import Dominio.Pedido;
import Dominio.PedidosDAO;
import Interfaces.IGestionPedidos;

public class GestionPedidos implements IGestionPedidos {

	PedidosDAO ped = new PedidosDAO();
	
	public Pedido procesarPedido() {
		Pedido p1 = ped.listaPedidos().get(0);
		p1.setEstado("Procesado");
		return p1;
	}

	public Pedido entregarPedido(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Pedido getPedido(int id) {
		return ped.getPedido(id);
	}

}
