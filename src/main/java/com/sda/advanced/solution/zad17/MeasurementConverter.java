package com.sda.advanced.solution.zad17;

public class MeasurementConverter {

	public double convert(double value, ConversionType conversionType) {
		return value * conversionType.getFactor();
	}

	public double convert(double value, ConversionTypeWithFunction conversionType) {
		return conversionType.apply(value);
	}

}
