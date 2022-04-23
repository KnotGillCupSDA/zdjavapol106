package com.sda.advanced.solution.zad11;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CircleTest {

	@Test
	void shouldResizeRadius() {
		Point2D center = new Point2D(0.0, 0.0);
		Point2D point = new Point2D(1.0, 0.0);
		Circle circle = new Circle(center, point);

		circle.resize(2);

		assertEquals(2, circle.getRadius());

	}
}