package pruebasIntegracionNegocio;

import static org.junit.Assert.*;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import javax.ejb.embeddable.EJBContainer;
import org.junit.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import Dominio.Usuario;
import Interfaces.IRegistro;
import Interfaces.IUsuarios;
import negocio.GestionUsuarios;

public class GestionUsuariosIT {
	
	private static EJBContainer ec;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
