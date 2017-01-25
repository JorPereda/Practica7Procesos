package dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import Dominio.Pedido;
import Interfaces.IPedidosDAO;

@Stateless
public class PedidosDAO implements IPedidosDAO {

	@PersistenceContext(unitName="PedidosPU")	
	private EntityManager em;
	
	public Pedido getPedido(int p) {
		return em.find(Pedido.class, p);
	}

	public Pedido creaPedido(Pedido ped) {
		if(ped.getIdPedido()!=0){
			em.persist(ped);
			return ped;
		}else{
			return null;
		}
	}

	public Pedido actualizaPedido(Pedido nuevoPedido) {
		em.merge(nuevoPedido);
		return nuevoPedido;
	}

	public Pedido eliminaPedido(Pedido ped) {
		em.remove(em.merge(ped));
		return ped;
	}

	public List<Pedido> listaPedidos() {
		Query q = em.createQuery("SELECT a FROM Pedido a");
		return q.getResultList();
	}

	public boolean confirmaPedido(Pedido ped) {
		Query q = em.createQuery("SELECT p FROM Pedido p WHERE p.estado = :est");
		if((q.setParameter("est", "Procesado"))!=null){
			return true;
		}
		else{
			return false;
		}
		
		
	}

	
}
