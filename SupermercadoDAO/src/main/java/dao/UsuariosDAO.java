package dao;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import Dominio.Usuario;
import Interfaces.IUsuariosDAO;

public class UsuariosDAO implements IUsuariosDAO {

	@PersistenceContext(unitName="UsuariosPU")	
	public EntityManager em;
	
	public Usuario creaUsuario(Usuario user) {
		
		return null;
	}

	public Usuario usuario(String usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	public Usuario actualizaUsuario(Usuario nuevoUsuario) {
		// TODO Auto-generated method stub
		return null;
	}

	public Usuario eliminaUsuario(String usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Usuario> listaUsuarios() {
		// TODO Auto-generated method stub
		return null;
	}

}
