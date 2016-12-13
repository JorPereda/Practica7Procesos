package Dominio;

public class Articulo {
	
	private static int idArticulo = 1;

	private String nombre;
	private double precio;
	private int stock;
	
	public Articulo() {
		super();
	}

	public Articulo(String nombre, double precio, int stock) {
		super();
		idArticulo = Articulo.idArticulo++;
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
