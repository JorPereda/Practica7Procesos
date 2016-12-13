package Interfaces;
import java.util.List;

import Dominio.Usuario;

public interface IUsuariosDAO {
	
	Usuario creaUsuario(Usuario user);
	Usuario usuario(String usuario);
	Usuario actualizaUsuario(Usuario nuevoUsuario);
	Usuario eliminaUsuario(String usuario);
	List<Usuario> listaUsuarios();

}
