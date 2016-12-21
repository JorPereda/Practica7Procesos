package Dominio;

import java.io.Serializable;

import javax.persistence.*;

@Entity
public class Usuario implements Serializable{

	private String nombre;
	@Id
	@GeneratedValue
	private int id;
	private String dni;
	private String direccion;
	
	public Usuario(){
		super();
	}
	
	public Usuario(String nombre, String dni, String direccion) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.direccion = direccion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	
}
