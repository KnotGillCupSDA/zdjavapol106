package com.sda.advanced.solution.zad12;

import java.util.List;
import java.util.Objects;

public class Car {

	private String name;
	private String model;
	private float price;
	private int yearOfProduction;
	private List<Manufacturer> manufacturerList;
	private EngineType engineType;

	public Car(String name, String model, float price, int yearOfProduction,
			List<Manufacturer> manufacturerList, EngineType engineType) {
		this.name = name;
		this.model = model;
		this.price = price;
		this.yearOfProduction = yearOfProduction;
		this.manufacturerList = manufacturerList;
		this.engineType = engineType;
	}

	public String getName() {
		return name;
	}

	public String getModel() {
		return model;
	}

	public float getPrice() {
		return price;
	}

	public int getYearOfProduction() {
		return yearOfProduction;
	}

	public List<Manufacturer> getManufacturerList() {
		return manufacturerList;
	}

	public EngineType getEngineType() {
		return engineType;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Car car = (Car) o;
		return Float.compare(car.price, price) == 0 && yearOfProduction == car.yearOfProduction &&
				Objects.equals(name, car.name) && Objects.equals(model, car.model) &&
				Objects.equals(manufacturerList, car.manufacturerList) && engineType == car.engineType;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, model, price, yearOfProduction, manufacturerList, engineType);
	}
}
