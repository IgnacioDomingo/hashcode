package es.opileak.hashcode.services;

import es.opileak.hashcode.model.Candidate;
import es.opileak.hashcode.model.Command;
import es.opileak.hashcode.model.Drone;

public class DroneService {

	Drone[]		droneforId;
	int			turnosTotalesRestantes;

	final int	maxTurn;
	final int	maxPayload;
	final int	maxDroneNumber;

	public DroneService(int maxDroneNumber, int maxTurn, int maxPayload) {
		super();
		this.maxTurn = maxTurn;
		this.maxPayload = maxPayload;
		this.maxDroneNumber = maxDroneNumber;

		turnosTotalesRestantes = maxTurn * maxDroneNumber;

		droneforId = new Drone[maxDroneNumber];
		for (int i = 0; i < droneforId.length; i++) {
			droneforId[i] = new Drone();
		}

	}

	public boolean hasAvailable() {
		return turnosTotalesRestantes > 0;
	}

	public void update(Candidate operationCandidate) {
		for (Command command : operationCandidate.getLstCommands()) {
			Drone drone = droneforId[command.getDroneId()];
			drone.consumeTurn(command.getTurnConsumed());
			turnosTotalesRestantes -= command.getTurnConsumed();
		}

	}

}
