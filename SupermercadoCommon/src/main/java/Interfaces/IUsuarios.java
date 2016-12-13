package Interfaces;
import javax.ejb.Remote;

import Dominio.Usuario;

@Remote
public interface IUsuarios {
	Usuario getUsuario(String nombre);
}
