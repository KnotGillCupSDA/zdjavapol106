package com.sda.advanced.solution.zad10;

public class Circle implements Movable {

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

	@Override
	public void move(MoveDirection moveDirection) {
		//move center
		center.move(moveDirection);
		//center.setX(center.getX() + moveDirection.getX());
		//center.setY(center.getY() + moveDirection.getY());

		//move point
		point.move(moveDirection);
		//point.setX(point.getX() + moveDirection.getX());
		//point.setY(point.getY() + moveDirection.getY());
	}

}
