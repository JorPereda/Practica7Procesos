package dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import Dominio.Usuario;
import Interfaces.IUsuariosDAO;

@Stateless
public class UsuariosDAO implements IUsuariosDAO {

	@PersistenceContext(unitName="UsuariosPU")
	public EntityManager em;	//Si esta privado no funciona el test
	

	public boolean creaUsuario(Usuario user) {
		if(user.getNombre()!=null){
			em.persist(user);
			return true;
		}else{
			return false;
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
