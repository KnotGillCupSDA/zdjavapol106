package com.sda.advanced.solution.zad13;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarService {

	private final List<Car> cars = new ArrayList<>();

	public void addCar(Car car) {
		cars.add(car);
	}

	public void removeCar(Car car) {
		cars.remove(car);
	}

	public List<Car> getCars() {
		return List.copyOf(cars);
	}

	public List<Car> getCarsWithEngineV12() {
		List<Car> carsWithEngineV12 = new ArrayList<>();
		for (Car car : cars) {
			if (car.getEngineType().equals(EngineType.V12)) {
				carsWithEngineV12.add(car);
			}
		}
		return carsWithEngineV12;
	}

	public List<Car> getListOfCarsByEngine(EngineType engineType) {
		return cars.
				stream().
				filter(car -> car.getEngineType().equals(engineType)).
				collect(Collectors.toList());
	}

}
