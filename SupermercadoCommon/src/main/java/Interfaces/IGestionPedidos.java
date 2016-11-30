package Interfaces;
import Dominio.*;

public interface IGestionPedidos {
	Pedido procesarPedido();
	Pedido entregarPedido(int id);
	Pedido getPedido(int id);
}
