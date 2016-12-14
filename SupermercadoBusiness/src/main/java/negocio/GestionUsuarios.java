package negocio;
import javax.ejb.EJB;
import javax.ejb.Stateless;

import Dominio.Usuario;
import Interfaces.IRegistro;
import Interfaces.IUsuarios;

@Stateless
public class GestionUsuarios implements IUsuarios, IRegistro {

	@EJB
	public IUsuarios usu;
	
	@EJB
	public IRegistro reg;
	
	public GestionUsuarios(){
		
	}
	
	public boolean registraUsuario(Usuario u) {
		return reg.registraUsuario(u);
	}

	public Usuario getUsuario(String nombre) {
		return usu.getUsuario(nombre);
	}

}
