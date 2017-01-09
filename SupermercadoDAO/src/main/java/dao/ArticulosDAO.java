package dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import Dominio.Articulo;
import Interfaces.IArticulosDAO;

@Stateless
public class ArticulosDAO implements IArticulosDAO {

	@PersistenceContext(unitName="ArticulosPU")	//PU=PersistenceUnit
	private EntityManager em;
	
	public Articulo getArticulo(int id) {
		return em.find(Articulo.class, id);
	}

	public Articulo getArticuloNombre(String nombre) {
		Query q = em.createQuery("SELECT a FROM Articulo a WHERE a.nombre = :nom");
		q.setParameter("nom", nombre);
		Articulo articulo = (Articulo) q.getSingleResult();
		return articulo;
	}

	public Articulo creaArticulo(Articulo art) {
		if(em.find(Articulo.class, art.getNombre()) == null){
			em.persist(art);
			return art;
		}else{
			return null;
		}
	}

	public Articulo actualizaArticulo(Articulo nuevoArticulo) {
		Query q = em.createQuery("UPDATE Articulo SET nombre = nuevoArticulo.getNombre(), "
				+ "precio = nuevoArticulo.getPrecio(), stock = nuevoArticulo.getStock() "
				+ "WHERE idArticulo = nuevoArticulo.getId()");
		q.executeUpdate();
		return nuevoArticulo;
	}

	public Articulo eliminaArticulo(Articulo art) {
		em.remove(art);
		return art;	
	}

	public List<Articulo> listaArticulo() {
		Query q = em.createQuery("SELECT nombre FROM Articulo");
		return q.getResultList();
	}
	
}
