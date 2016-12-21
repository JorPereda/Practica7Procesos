package Dominio;

import java.io.Serializable;

import javax.persistence.*;

@Entity
public class LineaPedido implements Serializable{

	@Id
	@GeneratedValue
	private int idLineaPedido;
	@OneToOne
	@JoinColumn(name="ArticuloFK")
	private Articulo articulo;
	private int cantidad;

	public LineaPedido() {
		super();
	}

	public Articulo getArticulo() {
		return articulo;
	}

	public void setArticulo(Articulo articulo) {
		this.articulo = articulo;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public int getIdLineaPedido() {
		return idLineaPedido;
	}


	
}
