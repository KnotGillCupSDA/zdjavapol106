package com.sda.advanced.solution.zad17;

import java.util.function.Function;

public enum ConversionTypeWithFunction {

	METERS_TO_YARDS(value -> value * 1.09361),
	YARDS_TO_METERS(value -> value * 0.9144),
	CENTIMETERS_TO_INCHES(value -> value * 0.393701),
	INCHES_TO_CENTIMETERS(value -> value * 2.54),
	KILOMETERS_TO_MILES(value -> value * 0.621371),
	MILES_TO_KILOMETERS(value -> value * 1.60934);

	private final Function<Double, Double> converter;

	ConversionTypeWithFunction(Function<Double, Double> converter) {
		this.converter = converter;
	}

	public double apply(double value) {
		return converter.apply(value);
	}
}
