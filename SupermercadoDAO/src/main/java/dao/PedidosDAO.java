package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import Dominio.Articulo;
import Dominio.Pedido;
import Interfaces.IPedidosDAO;

public class PedidosDAO implements IPedidosDAO {

	@PersistenceContext(unitName="PedidosPU")	
	private EntityManager em;
	
	public Pedido getPedido(int p) {
		return em.find(Pedido.class, p);
	}

	public Pedido creaPedido(Pedido ped) {
		if(em.find(Pedido.class, ped.getIdPedido()) == null){
			em.persist(ped);
			return ped;
		}else{
			return null;
		}
	}

	public Pedido actualizaPedido(Pedido nuevoPedido) {
		Query q = em.createQuery("UPDATE Pedido SET idPedido = nuevoPedido.getIdPedido(), "
				+ "estado = nuevoPedido.getEstado, lista = nuevoPedido.getListaCompra "
				+ "WHERE idPeido = nuevoPedido.getIdPedido()");
		q.executeUpdate();
		return nuevoPedido;
	}

	public Pedido eliminaPedido(Pedido ped) {
		em.remove(ped);
		return ped;
	}

	public List<Pedido> listaPedidos() {
		Query q = em.createQuery("SELECT idPedido FROM Pedido");
		return q.getResultList();
	}

	
}
