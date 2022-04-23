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
		List<Car> carList1 = new ArrayList<>();
		for (Car i : cars) {
			if (i.getEngineType().equals(EngineType.V12)) {
				carList1.add(i);
			}
		}
		return carList1;
	}

	public List<Car> getListOfCarsByEngine(EngineType engineType) {
		return cars.
				stream().
				filter(engine -> engine.getEngineType().equals(engineType)).
				collect(Collectors.toList());
	}

}
