package dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

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
		// TODO Auto-generated method stub
		return null;
	}

	public Articulo creaArticulo(Articulo art) {
		if(em.find(Articulo.class, art.getId())){
			
		}
	}

	public Articulo actualizaArticulo(Articulo nuevoArticulo) {
		// TODO Auto-generated method stub
		return null;
	}

	public Articulo eliminaArticulo(Articulo art) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Articulo> listaArticulo() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
