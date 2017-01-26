package Interfaces;
import java.util.List;

import javax.ejb.Remote;

import Dominio.*;

@Remote
public interface IInventario {
	boolean addArticulo(Articulo art);
	boolean removeArticulo(Articulo art);
	boolean updateArticulo(Articulo art);
	Articulo getArticulo(int id);
	Articulo getArticuloNombre(String nombre);
	List<Articulo> listArticulos();
}
