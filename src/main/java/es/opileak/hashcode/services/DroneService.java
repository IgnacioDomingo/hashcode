package es.opileak.hashcode.services;

import es.opileak.hashcode.model.Candidate;

public class DroneService {

	final int	maxTurn;
	final int	maxPayload;
	final int	maxDroneNumber;

	public DroneService(int maxDroneNumber, int maxTurn, int maxPayload) {
		super();
		this.maxTurn = maxTurn;
		this.maxPayload = maxPayload;
		this.maxDroneNumber = maxDroneNumber;

	}

	public boolean hasAvailable() {
		// TODO Auto-generated method stub
		return false;
	}

	public void update(Candidate operationCandidate) {
		// TODO Auto-generated method stub

	}

}
