package es.opileak.hashcode.model;

import java.awt.geom.Point2D;
import java.util.List;

public class Drone {

	Point2D			position;
	List<Product>	lstProduct;
	Integer			turno;

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

}
