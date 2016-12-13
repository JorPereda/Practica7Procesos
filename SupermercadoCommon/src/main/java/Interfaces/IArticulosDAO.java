package Interfaces;

import java.util.List;

import javax.ejb.Remote;

import Dominio.Articulo;

@Remote
public interface IArticulosDAO {
	
	Articulo getArticulo(int id);
	Articulo getArticuloNombre(String nombre);
	Articulo creaArticulo(Articulo art);
	Articulo actualizaArticulo(Articulo nuevoArticulo);
	Articulo eliminaArticulo(Articulo art);
	List<Articulo> listaArticulo();

}
