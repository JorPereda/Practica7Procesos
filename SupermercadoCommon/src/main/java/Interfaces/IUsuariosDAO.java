package Interfaces;
import java.util.List;

import javax.ejb.Remote;

import Dominio.Usuario;

@Remote
public interface IUsuariosDAO {
	
	boolean creaUsuario(Usuario user);
	Usuario usuario(int id);
	Usuario usuarioPorNombre(String user);
	Usuario actualizaUsuario(Usuario nuevoUsuario);
	Usuario eliminaUsuario(Usuario usuario);
	List<Usuario> listaUsuarios();

}
