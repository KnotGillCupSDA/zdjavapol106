package com.sda.advanced.solution.zad11;

public class Main {

	public static void main(String[] args) {
		Point2D center = new Point2D(0, 0);
		Point2D point = new Point2D(1, 0);
		Circle circle = new Circle(center, point);

		System.out.println("center: "+ center + ", point: "+ point);
		System.out.println("circle: "+ circle);

		System.out.println("radius: " + circle.getRadius());
		System.out.println("perimeter: " + circle.getPerimeter());
		System.out.println("area: " + circle.getArea());

		circle.resize(2.0);
		System.out.println("resized:");
		System.out.println("center: "+ center + ", point: "+ point);
		System.out.println("circle: "+ circle);

		System.out.println("radius: " + circle.getRadius());
		System.out.println("perimeter: " + circle.getPerimeter());
		System.out.println("area: " + circle.getArea());

		circle.move(new MoveDirection(5, 3));
		System.out.println("moved:");
		System.out.println("center: "+ center + ", point: "+ point);
		System.out.println("circle: "+ circle);


	}
}
