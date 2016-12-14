package negocio;
import javax.ejb.EJB;
import javax.ejb.Stateless;

import Dominio.Articulo;
import Interfaces.IInventario;

@Stateless
public class GestionInventario implements IInventario{

	@EJB
	public IInventario inventario;

	public GestionInventario(){
		
	}

	public boolean removeArticulo(int id) {
		return inventario.removeArticulo(id);
	}

	public Articulo getArticulo(int id) {
		return inventario.getArticulo(id);
	}

	public boolean addArticulo(Articulo art) {
		return inventario.addArticulo(art);
	}

	public boolean updateArticulo(Articulo art) {
		return inventario.updateArticulo(art);
	}

	
	
}
