package Interfaces;
import java.util.List;

import javax.ejb.Remote;

import Dominio.Usuario;

@Remote
public interface IUsuariosDAO {
	
	Usuario creaUsuario(Usuario user);
	Usuario usuario(String usuario);
	Usuario actualizaUsuario(Usuario nuevoUsuario);
	Usuario eliminaUsuario(Usuario usuario);
	List<Usuario> listaUsuarios();

}
