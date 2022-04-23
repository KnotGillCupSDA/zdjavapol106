package com.sda.advanced.solution.zad10;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CircleTest {
	@Test
	void shouldNotChangeRadiusWhenMoving() {
		Circle circle = new Circle(new Point2D(0.0, 0.0), new Point2D(1.0, 0.0));
		double radius = circle.getRadius();

		MoveDirection moveDirection = new MoveDirection(1, 2);
		circle.move(moveDirection);

		assertEquals(radius, circle.getRadius());
	}

	@Test
	void shouldMove() {
		Point2D center = new Point2D(0.0, 0.0);
		Point2D point = new Point2D(1.0, 0.0);

		Circle circle = new Circle(center, point);
		MoveDirection moveDirection = new MoveDirection(1, 2);
		circle.move(moveDirection);

		assertEquals(center.getX(), 1);
		assertEquals(center.getY(), 2);
		assertEquals(point.getX(), 2);
		assertEquals(point.getY(), 2);

	}
}