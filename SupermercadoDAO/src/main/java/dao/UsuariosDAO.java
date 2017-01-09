package dao;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import Dominio.Usuario;
import Interfaces.IUsuariosDAO;

public class UsuariosDAO implements IUsuariosDAO {

	@PersistenceContext(unitName="UsuariosPU")	
	private EntityManager em;
	
	public Usuario creaUsuario(Usuario user) {
		if(em.find(Usuario.class, user.getDni()) == null){
			em.persist(user);
			return user;
		}else{
			return null;
		}
	}

	public Usuario usuario(String usuario) {
		return em.find(Usuario.class, usuario);
	}

	public Usuario actualizaUsuario(Usuario nuevoUsuario) {
		Query q = em.createQuery("UPDATE Usuario SET id = nuevoUsuario.getId(), "
				+ "nombre = nuevoUsuario.getNombre(), dni = nuevoUsuario.getDni, "
				+ "direccion = nuevoUsuario.getDireccion()"
				+ "WHERE id = nuevoUsuario.getId()");
		q.executeUpdate();
		return nuevoUsuario;
	}

	public Usuario eliminaUsuario(Usuario usuario) {
		em.remove(usuario);
		return usuario;
	}

	public List<Usuario> listaUsuarios() {
		Query q = em.createQuery("SELECT dni FROM Usuario");
		return q.getResultList();
	}

}
