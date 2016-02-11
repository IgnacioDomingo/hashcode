package es.opileak.hashcode.util;

import java.awt.geom.Point2D;

public class DistanceUtil {
	public static int calculateDistance(Point2D from, Point2D to) {
		double distR = Math.abs(from.getY() - to.getY());
		double distC = Math.abs(from.getX() - to.getX());

		double sum = Math.pow(distR, 2) + Math.pow(distC, 2);

		return (int) Math.round(Math.sqrt(sum));
	}

}
