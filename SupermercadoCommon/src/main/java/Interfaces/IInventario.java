package Interfaces;
import Dominio.*;

public interface IInventario {
	boolean addArticulo(Usuario user);
	boolean removeArticulo(int id);
	boolean updateArticulo(Usuario user);
	Articulo getArticulo(int id);
}
