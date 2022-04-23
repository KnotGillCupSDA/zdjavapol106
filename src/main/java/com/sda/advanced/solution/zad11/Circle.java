package com.sda.advanced.solution.zad11;

public class Circle implements Movable, Resizable {

	private final Point2D center;
	private double radius;

	public Circle(Point2D center, Point2D point) {
		this.center = new Point2D(center.getX(), center.getY());
		this.radius = calculateRadius(point);
	}

	private double calculateRadius(Point2D point) {
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
	}

	@Override
	public void resize(double resizeFactor) {
		radius *= resizeFactor;
	}

	@Override
	public String toString() {
		return "Circle{" +
				"center=" + center +
				", radius=" + radius +
				'}';
	}
}
