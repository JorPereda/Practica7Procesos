package Dominio;

import java.util.List;

public class Pedido {
	
	private static int idPedido;
	private List<Articulo> articulos;
	
	public Pedido(){
		super();
	}
	
	public Pedido(List<Articulo> articulos) {
		super();
		idPedido = Pedido.idPedido++;
		this.articulos = articulos;
	}

	public int getIdPedido() {
		return idPedido;
	}

	public List<Articulo> getArticulos() {
		return articulos;
	}

	public void setArticulos(List<Articulo> articulos) {
		this.articulos = articulos;
	}
	

}
