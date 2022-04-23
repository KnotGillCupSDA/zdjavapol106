package com.sda.advanced.solution.zad13;

import java.util.List;
import java.util.Objects;

public class Car {

	private final String name;
	private final String model;
	private final float price;
	private final int yearOfProduction;
	private final List<Manufacturer> manufacturerList;
	private final EngineType engineType;

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

	@Override
	public String toString() {
		return "Car{" +
				"name='" + name + '\'' +
				", model='" + model + '\'' +
				", price=" + price +
				", yearOfProduction=" + yearOfProduction +
				", manufacturerList=" + manufacturerList +
				", engineType=" + engineType +
				'}';
	}
}
