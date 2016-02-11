package es.opileak.hashcode.model;

import java.awt.Point;
import java.awt.geom.Point2D;
import java.util.LinkedList;
import java.util.List;

public class Drone {

	Point2D			position;
	List<Product>	lstProduct;
	Integer			turno;

	public Drone() {
		super();
		this.position = new Point(0, 0);
		this.lstProduct = new LinkedList<>();
		this.turno = 0;
	}

	public Point2D getPosition() {
		return position;
	}

	public void setPosition(Point2D position) {
		this.position = position;
	}

	public List<Product> getLstProduct() {
		return lstProduct;
	}

	public void setLstProduct(List<Product> lstProduct) {
		this.lstProduct = lstProduct;
	}

	public Integer getTurno() {
		return turno;
	}

	public void setTurno(Integer turno) {
		this.turno = turno;
	}

	@Override
	public String toString() {
		return "Drone [position=" + position + ", lstProduct=" + lstProduct + ", turno=" + turno + "]";
	}

}
