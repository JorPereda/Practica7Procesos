package Dominio;

import java.io.Serializable;

import javax.persistence.*;

@Entity
public class Articulo implements Serializable{
	
	@Id
	@GeneratedValue
	private int idArticulo;

	private String nombre;
	private double precio;
	private int stock;
	
	public Articulo() {
		super();
	}

	public Articulo(String nombre, double precio, int stock) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.stock = stock;
	}

	public int getId() {
		return idArticulo;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
	
	

}
