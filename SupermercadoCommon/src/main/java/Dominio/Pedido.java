package Dominio;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

@Entity
public class Pedido implements Serializable{
	
	@Id
	@GeneratedValue
	private int idPedido;
	private String estado;
	@OneToMany
	@JoinTable(name="PedidoLineaPedido",
			   joinColumns=@JoinColumn(name="idPedFK"),
			   inverseJoinColumns=@JoinColumn(name="idLineaFK"))
	private List<LineaPedido> listaCompra;
	
	public Pedido(){
		super();
	}
	
	public Pedido(List<LineaPedido> articulos) {
		super();
		this.listaCompra = articulos;
	}

	public int getIdPedido() {
		return idPedido;
	}

	
	public List<LineaPedido> getListaCompra() {
		return listaCompra;
	}

	public void setListaCompra(List<LineaPedido> listaCompra) {
		this.listaCompra = listaCompra;
	}

	public String getEstado() {
		return estado;
	}

	//Estado1 = Sin procesar
	//Estado2 = Procesado
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
	

}
