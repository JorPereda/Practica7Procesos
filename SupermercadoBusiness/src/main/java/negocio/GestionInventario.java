package negocio;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import Dominio.Articulo;
import Interfaces.IArticulosDAO;
import Interfaces.IInventario;

@Stateless
public class GestionInventario implements IInventario{

	@EJB
	public IArticulosDAO inventario;

	public GestionInventario(){
		
	}

	public boolean removeArticulo(Articulo art) {
		if((inventario.eliminaArticulo(art))!=null){
			return true;
		}
		else{
			return false;
		}
	}

	public Articulo getArticulo(int id) {
		return inventario.getArticulo(id);
	}

	public boolean addArticulo(Articulo art) {
		if((inventario.creaArticulo(art))!=null){
			return true;
		}
		else{
			return false;
		}
		
	}

	public boolean updateArticulo(Articulo art) {
		if((inventario.actualizaArticulo(art))!=null){
			return true;
		}
		else{
			return false;
		}
	}

	public List<Articulo> listArticulos() {
		return inventario.listaArticulo();
	}
	
}
