package es.opileak.hashcode.services;

import java.util.List;

import es.opileak.hashcode.model.Candidate;
import es.opileak.hashcode.model.Order;

public class OrderService {

	List<Order>	listOrder;
	int			orderRestantes;

	public OrderService(List<Order> listOrder) {
		super();
		this.listOrder = listOrder;
	}

	public boolean hasAvailable() {
		return orderRestantes == 0;
	}

	public void update(Candidate operationCandidate) {
		listOrder.remove(operationCandidate.getOrder());
		orderRestantes--;
	}

}
