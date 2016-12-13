package Interfaces;

import javax.ejb.Remote;

import Dominio.Usuario;

@Remote
public interface IRegistro {
	boolean registraUsuario(Usuario u);
}
