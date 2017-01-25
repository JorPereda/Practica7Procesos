package dao;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import Dominio.Usuario;
import Interfaces.IUsuariosDAO;

public class UsuariosDAO implements IUsuariosDAO {

	@PersistenceContext(unitName="UsuariosPU")	
	public EntityManager em;
	
	public Usuario creaUsuario(Usuario user) {
		if(user.getNombre()!=null){
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
		em.merge(nuevoUsuario);
		return nuevoUsuario;
	}

	public Usuario eliminaUsuario(Usuario usuario) {
		em.remove(usuario);
		return usuario;
	}

	public List<Usuario> listaUsuarios() {
		Query q = em.createQuery("SELECT a FROM Usuario a");
		return q.getResultList();
	}

}
