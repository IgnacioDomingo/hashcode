package es.opileak.hashcode.model;

import java.awt.geom.Point2D;

public class Order {

	private int					id;
	private Point2D				clientPosition;
	private ProductsQuantity	productsQuantity;

	public Point2D getPosition() {
		return clientPosition;
	}

	public void setPosition(Point2D position) {
		this.clientPosition = position;
	}

	@Override
	public String toString() {
		return "Order [position=" + clientPosition + ", productsQuantity=" + productsQuantity + "]";
	}

	public int getId() {
		return id;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		if (id != other.id)
			return false;
		return true;
	}

	private class ProductsQuantity {

	}

}
