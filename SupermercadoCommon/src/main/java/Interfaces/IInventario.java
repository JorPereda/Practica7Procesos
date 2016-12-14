package Interfaces;
import javax.ejb.Remote;

import Dominio.*;

@Remote
public interface IInventario {
	boolean addArticulo(Articulo art);
	boolean removeArticulo(int id);
	boolean updateArticulo(Articulo art);
	Articulo getArticulo(int id);
}
