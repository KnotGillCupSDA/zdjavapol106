package com.sda.advanced.solution.zad17;

public class ConversionTypeClass {

	public static final ConversionTypeClass METERS_TO_YARDS = new ConversionTypeClass(1.09361);
	public static final ConversionTypeClass YARDS_TO_METERS = new ConversionTypeClass(0.9144);


	private final double factor;

	public ConversionTypeClass(double factor) {
		this.factor = factor;
	}

	public double getFactor() {
		return factor;
	}
}
