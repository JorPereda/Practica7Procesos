package Dominio;

import java.util.List;

public class Pedido {
	
	private int idPedido;
	private List<Articulo> articulos;
	
	public Pedido(){
		super();
	}
	
	public Pedido(int idPedido, List<Articulo> articulos) {
		super();
		this.idPedido = idPedido;
		this.articulos = articulos;
	}

	public int getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}

	public List<Articulo> getArticulos() {
		return articulos;
	}

	public void setArticulos(List<Articulo> articulos) {
		this.articulos = articulos;
	}
	

}
