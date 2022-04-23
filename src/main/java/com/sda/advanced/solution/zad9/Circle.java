package com.sda.advanced.solution.zad9;

public class Circle {

	private final Point2D center;
	private final Point2D point;

	public Circle(Point2D center, Point2D point) {
		this.center = center;
		this.point = point;
	}

	public double getRadius() {
		double poweredDifferenceBetweenTwoXCoordinates = Math.pow((center.getX()
				- point.getX()),2);
		double poweredDifferenceBetweenTwoYCoordinates = Math.pow((center.getY()
				- point.getY()),2);

		return Math.sqrt(poweredDifferenceBetweenTwoXCoordinates + poweredDifferenceBetweenTwoYCoordinates);
	}

	public double getPerimeter() {
		return 0.0;
	}

	public double getArea() {
		return 0.0;
	}

}
