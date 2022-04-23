package com.sda.advanced.solution.zad10;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Point2DTest {

	@Test
	void shouldMove() {
		Point2D point2D = new Point2D(1.0, 1.0);
		MoveDirection moveDirection = new MoveDirection(1, 2);

		point2D.move(moveDirection);

		assertEquals(2.0, point2D.getX());
		assertEquals(3.0, point2D.getY());

	}
}