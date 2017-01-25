package negocio;
import javax.ejb.EJB;
import javax.ejb.Stateless;

import Dominio.Articulo;
import Dominio.Pedido;
import Interfaces.IArticulosDAO;
import Interfaces.IGestionPedidos;
import Interfaces.IPedidosDAO;
import Interfaces.IRealizarPedido;

@Stateless
public class GestionPedidos implements IGestionPedidos, IRealizarPedido {

	@EJB
	public IPedidosDAO pedidos;
	@EJB
	public IArticulosDAO articulos;
	
	public GestionPedidos(){
		
	}

	public boolean realizarPedido(Pedido ped) {
		if((pedidos.creaPedido(ped))!=null){
			return true;
		}
		else{
			return false;
		}
		
	}

	public boolean asignaArticulo(Pedido p, Articulo a, int cantidad) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean confirmaPedido(Pedido p) {
		return pedidos.confirmaPedido(p);
		
	}

	//Revisar
	public Pedido procesarPedido(Pedido p) {
		return pedidos.getPedido(p.getIdPedido());
	}

	//Revisar
	public Pedido entregarPedido(int id) {
		return pedidos.getPedido(id);
	}

	public Pedido getPedido(int id) {
		return pedidos.getPedido(id);
	}

}
