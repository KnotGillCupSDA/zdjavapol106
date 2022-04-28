package com.sda.advanced.omitted.zad20;

public class Hexagon extends Shape{

	private final int a;

	public Hexagon(int a) {
		this.a = a;
	}

	@Override
	public int calculatePerimeter() {
		return 6 * a;
	}
}
