package es.opileak.hashcode.model;

import es.opileak.hashcode.services.DroneService;
import es.opileak.hashcode.services.OrderService;
import es.opileak.hashcode.services.WarehouseService;

public class ProblemState {

	DroneService		droneService;
	OrderService		orderService;
	WarehouseService	warehouseService;

	public ProblemState(DroneService droneService, OrderService orderService, WarehouseService warehouseService) {
		super();
		this.droneService = droneService;
		this.orderService = orderService;
		this.warehouseService = warehouseService;
	}

	/**
	 * Si todos los drones han legado su turno maximo o
	 * hemos entregado todas las ordenes 
	 */
	public boolean isSolved() {
		return !droneService.hasAvailable() || !orderService.hasAvailable();
	}

	public void apply(Candidate operationCandidate) {
		droneService.update(operationCandidate);
		orderService.update(operationCandidate);
		warehouseService.update(operationCandidate);
	}

}
