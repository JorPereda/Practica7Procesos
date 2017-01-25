package pruebasUnitarias;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import Dominio.Usuario;
import Interfaces.IRegistro;
import Interfaces.IUsuarios;
import Interfaces.IUsuariosDAO;
import negocio.GestionUsuarios;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class GestionUsuariosTEST{
	
	private static IUsuariosDAO		usuariosI;
	private static IRegistro		registroI;
	private static Usuario u;
	private static GestionUsuarios gU;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		usuariosI		= 	mock(IUsuariosDAO.class);
		registroI		=	mock(IRegistro.class);
		u = new Usuario("Pepe","1234567M","Calle del sol");
		gU = new GestionUsuarios();
		// Programar para que se utilice el mock correspondiente para "usu" y "reg"
		gU.usu = usuariosI;
		//gU.reg = registroI;
	}

	@Test
	public void test() {
		// Programar el valor a devolver en caso de invocacion del metodo getUsuario("Pepe")
		when(gU.getUsuario("Pepe")).thenReturn(u);
		// Programar el valor a devolver en caso de invocacion del metodo registraUsuario(u)
		when(gU.registraUsuario(u)).thenReturn(true);
		// Invocar los metodos de la clase Gestion Usuarios con los valores adecuados
		gU.getUsuario("Pepe");
		gU.registraUsuario(u);
		// Comprobar que los valores devueltos después de la invocación de cada metodo es el esperado
		assertTrue(gU.getUsuario("Pepe").equals(u));
		assertTrue(gU.registraUsuario(u)==true);
	}

}
