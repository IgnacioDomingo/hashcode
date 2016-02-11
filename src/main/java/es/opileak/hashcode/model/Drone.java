package es.opileak.hashcode.model;

import java.awt.Point;
import java.awt.geom.Point2D;

public class Drone {

	Point2D	actualPosition;
	Integer	turno;

	public Drone() {
		super();
		this.actualPosition = new Point(0, 0);
		this.turno = 0;
	}

	public Point2D getPosition() {
		return actualPosition;
	}

	public void setPosition(Point2D position) {
		this.actualPosition = position;
	}

	public Integer getTurno() {
		return turno;
	}

	public void setTurno(Integer turno) {
		this.turno = turno;
	}

	@Override
	public String toString() {
		return "Drone [position=" + actualPosition + ", turno=" + turno + "]";
	}

	public void applyCommand(Command command) {
		turno += command.getTurnConsumed();

		if (command.getEndPosition() != null) {
			actualPosition = command.getEndPosition();
		}
	}

}
