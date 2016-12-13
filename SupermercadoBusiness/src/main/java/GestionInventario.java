import Dominio.Articulo;
import Dominio.ArticulosDAO;
import Dominio.Usuario;
import Interfaces.IInventario;

public class GestionInventario implements IInventario{

	ArticulosDAO art = new ArticulosDAO();
	
	public boolean addArticulo(Usuario user) {
		return true;
	}

	public boolean removeArticulo(int id) {
		Articulo arti=art.getArticulo(id);
		if((art.eliminaArticulo(arti)).equals(null)){
			return false;
		}
		return true;
	}

	public boolean updateArticulo(Usuario user) {
		return true;
	}

	public Articulo getArticulo(int id) {
		return art.getArticulo(id);
	}

	
	
}
