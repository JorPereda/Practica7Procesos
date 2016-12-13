import Dominio.Usuario;
import Dominio.UsuariosDAO;
import Interfaces.IRegistro;
import Interfaces.IUsuarios;

public class GestionUsuarios implements IUsuarios, IRegistro {

	UsuariosDAO usu = new UsuariosDAO();
	
	public boolean registraUsuario(Usuario u) {
		if(usu.creaUsuario(u).equals(null)){
			return false;
		}else{
			return true;
		}
	}

	public Usuario getUsuario(String nombre) {
		return usu.usuario(nombre);
	}

}
