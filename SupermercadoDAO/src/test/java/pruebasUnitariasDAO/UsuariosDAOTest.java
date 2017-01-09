package pruebasUnitariasDAO;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import javax.persistence.EntityManager;

import org.junit.BeforeClass;
import org.junit.Test;

import Dominio.Usuario;
import dao.UsuariosDAO;

public class UsuariosDAOTest {
	private static UsuariosDAO uDAO;
	private static Usuario u;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		uDAO = new UsuariosDAO();
		uDAO.em = mock(EntityManager.class);
		// mock sobre el Entity Manager
		u = new Usuario("Pepe","1234567M","Calle del sol");

	}


	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
