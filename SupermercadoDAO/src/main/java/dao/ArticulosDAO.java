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

	@PersistenceContext(unitName="SupermercadoPU")
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
		if(art.getNombre()!=null){
			em.persist(art);
			return art;
		}else{
			return null;
		}
	}

	
	public Articulo actualizaArticulo(Articulo nuevoArticulo) {
		em.merge(nuevoArticulo);
		return nuevoArticulo;
	}

	public Articulo eliminaArticulo(Articulo art) {
		em.remove(em.merge(art));
		return art;	
	}

	public List<Articulo> listaArticulo() {
		Query q = em.createQuery("SELECT a FROM Articulo a");
		return q.getResultList();
	}
	
}
