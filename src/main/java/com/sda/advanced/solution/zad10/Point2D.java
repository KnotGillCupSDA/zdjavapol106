package com.sda.advanced.solution.zad10;

public class Point2D implements Movable {

	private double x;
	private double y;

	public Point2D(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	@Override
	public void move(MoveDirection moveDirection) {
		this.setX(this.getX() + moveDirection.getX());
		this.setY(this.getY() + moveDirection.getY());
		//x += moveDirection.getX();
		//y += moveDirection.getY();
	}
}
