package es.opileak.hashcode.model;

import java.awt.geom.Point2D;
import java.util.Map;

public class Warehouse {
	public Warehouse(Point2D position, Map<Product, Integer> productsQuantity) {
		super();
		this.position = position;
		this.productsQuantity = productsQuantity;
	}

	private Point2D					position;
	private Map<Product, Integer>	productsQuantity;

	public Point2D getPosition() {
		return position;
	}

	public void setPosition(Point2D position) {
		this.position = position;
	}

	public Map<Product, Integer> getProductsQuantity() {
		return productsQuantity;
	}

	public void setProductsQuantity(Map<Product, Integer> productsQuantity) {
		this.productsQuantity = productsQuantity;
	}

	@Override
	public String toString() {
		return "Warehouse [position=" + position + ", productsQuantity=" + productsQuantity + "]";
	}
}
