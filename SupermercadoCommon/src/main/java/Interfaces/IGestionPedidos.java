package Interfaces;
import javax.ejb.Remote;

import Dominio.*;

@Remote
public interface IGestionPedidos {
	Pedido procesarPedido(Pedido p);
	Pedido entregarPedido(int id);
	Pedido getPedido(int id);
}
