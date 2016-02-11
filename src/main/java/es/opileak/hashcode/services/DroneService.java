package es.opileak.hashcode.services;

import es.opileak.hashcode.model.Candidate;
import es.opileak.hashcode.model.Drone;

public class DroneService {

	Drone[]		droneforId;
	int			turnosRestantes;

	final int	maxTurn;
	final int	maxPayload;
	final int	maxDroneNumber;

	public DroneService(int maxDroneNumber, int maxTurn, int maxPayload) {
		super();
		this.maxTurn = maxTurn;
		this.maxPayload = maxPayload;
		this.maxDroneNumber = maxDroneNumber;

		turnosRestantes = maxTurn * maxDroneNumber;

		droneforId = new Drone[maxDroneNumber];
		for (int i = 0; i < droneforId.length; i++) {
			droneforId[i] = new Drone();
		}

	}

	/**
	 * hay algun dron con tiempo disponible.
	 * @return
	 */
	public boolean hasAvailable() {

		return false;
	}

	public void update(Candidate operationCandidate) {
		// TODO Auto-generated method stub

	}

}
