package es.opileak.hashcode.model;

import java.awt.geom.Point2D;
import java.util.List;

public class Command {

	Point2D			posicion;
	Order			orden;
	List<Command>	lstCommand;

	public Point2D getPosicion() {
		return posicion;
	}

	public void setPosicion(Point2D posicion) {
		this.posicion = posicion;
	}

	public Order getOrden() {
		return orden;
	}

	public void setOrden(Order orden) {
		this.orden = orden;
	}

	public List<Command> getLstCommand() {
		return lstCommand;
	}

	public void setLstCommand(List<Command> lstCommand) {
		this.lstCommand = lstCommand;
	}

}
