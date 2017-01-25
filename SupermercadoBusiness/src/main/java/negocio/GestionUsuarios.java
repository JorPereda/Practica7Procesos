package negocio;
import javax.ejb.EJB;
import javax.ejb.Stateless;

import Dominio.Usuario;
import Interfaces.IRegistro;
import Interfaces.IUsuarios;
import Interfaces.IUsuariosDAO;

@Stateless
public class GestionUsuarios implements IUsuarios, IRegistro {

	@EJB
	public IUsuariosDAO usu;
	
	
	public GestionUsuarios(){
		
	}


	public boolean registraUsuario(Usuario u) {
		if((usu.creaUsuario(u))!=null){
			return true;
		}
		else{
			return false;
		}
	}


	public Usuario getUsuario(String nombre) {
		return usu.usuario(nombre);
	}


}
