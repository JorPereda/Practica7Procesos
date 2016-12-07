package Dominio;

import java.util.List;

import Interfaces.IArticulosDAO;

public class ArticulosDAO implements IArticulosDAO {
	
	private List<Articulo> listaArticulos; 
	
	public Articulo getArticulo(int id) {
		for(int i=0; i<listaArticulos.size(); i++){
			Articulo art=listaArticulos.get(i);
			if(art.getId()==id){
				return art;
			}
		}
		return null;
	}

	public Articulo getArticuloNombre(String nombre) {
		for(int i=0; i<listaArticulos.size(); i++){
			Articulo art=listaArticulos.get(i);
			if(art.getNombre()==nombre){
				return art;
			}
		}
		return null;
	}

	public Articulo creaArticulo(Articulo art) {
		// TODO Auto-generated method stub
		return null;
	}

	public Articulo actualizaArticulo(Articulo nuevoArticulo) {
		for(int i=0; i<listaArticulos.size(); i++){
			Articulo art=listaArticulos.get(i);
			if(art.getId()==nuevoArticulo.getId()){
				listaArticulos.remove(i);
				listaArticulos.add(nuevoArticulo);
				return nuevoArticulo;
			}
		}
		return null;
	}

	public Articulo eliminaArticulo(Articulo art) {
		for(int i=0; i<listaArticulos.size(); i++){
			Articulo a=listaArticulos.get(i);
			if(a.getId()==art.getId()){
				listaArticulos.remove(i);
				return a;
			}
		}
		return null;
	}

	public List<Articulo> listaArticulo() {
		return listaArticulos;
	}

}
