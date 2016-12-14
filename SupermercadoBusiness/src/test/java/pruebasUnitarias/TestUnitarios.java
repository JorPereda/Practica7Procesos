package pruebasUnitarias;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import Interfaces.IArticulosDAO;
import Interfaces.IPedidosDAO;
import Interfaces.IUsuariosDAO;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestUnitarios {
	
	private static IPedidosDAO		pedidosDAO		= 	mock(IPedidosDAO.class);
	
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
