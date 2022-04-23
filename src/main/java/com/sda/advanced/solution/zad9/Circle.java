package com.sda.advanced.solution.zad9;

public class Circle {

	private final Point2D center;
	private final Point2D point;

	private final double radius;

	public Circle(Point2D center, Point2D point) {
		this.center = center;
		this.point = point;
		this.radius = calculateRadius();
	}

	private double calculateRadius() {
		System.out.println("Calculating radius");
		double poweredDifferenceBetweenTwoXCoordinates = Math.pow((center.getX()
				- point.getX()), 2);
		double poweredDifferenceBetweenTwoYCoordinates = Math.pow((center.getY()
				- point.getY()), 2);

		return Math.sqrt(poweredDifferenceBetweenTwoXCoordinates + poweredDifferenceBetweenTwoYCoordinates);
	}

	public double getRadius() {
		return radius;
	}

	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}

	public double getArea() {
		//return Math.PI * getRadius() * getRadius();
		return Math.PI * Math.pow(radius, 2);
	}

}
