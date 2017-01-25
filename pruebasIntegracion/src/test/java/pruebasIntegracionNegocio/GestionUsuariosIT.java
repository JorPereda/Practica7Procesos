package pruebasIntegracionNegocio;

import static org.junit.Assert.*;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import javax.ejb.embeddable.EJBContainer;
import org.junit.*;

import Dominio.Usuario;
import Interfaces.IRegistro;
import Interfaces.IUsuarios;
import negocio.GestionUsuarios;

public class GestionUsuariosIT {
	
	private static EJBContainer ec;
	private static GestionUsuarios gu;
	private static Usuario u;

	@BeforeClass
	public static void initContainer() throws Exception {
		u = new Usuario("Jairo Noruego","9847581N","Calle del Sol, Santander");
		//Creamos el contenedor embebido, por defecto, inicializa todos los EJB que estén en el classpath del cliente
        ec = EJBContainer.createEJBContainer();
     // Desde Maven
        gu = (GestionUsuarios) ec.getContext().lookup("java:global/ejb-app/SupermercadoBusiness-0_0_1-SNAPSHOT/GestionUsuarios");
	}
	
    @AfterClass
    public static void closeContainer() throws Exception {
        //Cerramos el contenedor
        if (ec != null) {
            ec.close();
        }
    }

	@Test
	public void test() {
		assertTrue(gu.registraUsuario(u)==true);
		assertTrue(gu.getUsuario("Jairo Noruego").equals(u));
	}

}
