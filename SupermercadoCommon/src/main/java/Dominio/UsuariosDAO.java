package Dominio;
import java.util.List;

import Interfaces.IUsuariosDAO;

public class UsuariosDAO implements IUsuariosDAO {

	private List<Usuario> listaUsuarios;
	
	public Usuario creaUsuario(Usuario user) {
		listaUsuarios.add(user);
		return user;
	}

	public Usuario usuario(String usuario) {
		for(int i=0;i<listaUsuarios.size();i++){
			if(listaUsuarios.get(i).getNombre()==usuario){
				return listaUsuarios.get(i);
			}
		}
		return null;
	}

	public Usuario actualizaUsuario(Usuario nuevoUsuario) {
		for(int i=0;i<listaUsuarios.size();i++){
			if(listaUsuarios.get(i).getDni()==nuevoUsuario.getDni()){
				listaUsuarios.remove(i);
				listaUsuarios.add(nuevoUsuario);
				return nuevoUsuario;
			}
		}
		return null;
	}

	public Usuario eliminaUsuario(String usuario) {
		for(int i=0;i<listaUsuarios.size();i++){
			if(listaUsuarios.get(i).getNombre()==usuario){
				listaUsuarios.remove(i);
				return listaUsuarios.get(i);
			}
		}
		return null;
	}

	public List<Usuario> listaUsuarios() {
		return listaUsuarios;
	}

}
