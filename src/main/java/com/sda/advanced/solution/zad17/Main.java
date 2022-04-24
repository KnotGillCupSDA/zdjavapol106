package com.sda.advanced.solution.zad17;

public class Main {

	public static void main(String[] args) {
		MeasurementConverter measurementConverter = new MeasurementConverter();

		System.out.println(measurementConverter.convert(2, ConversionType.METERS_TO_YARDS));
		System.out.println(measurementConverter.convert(2, ConversionTypeWithFunction.METERS_TO_YARDS));

	}

}
