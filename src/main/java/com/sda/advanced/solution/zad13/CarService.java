package com.sda.advanced.solution.zad13;

import java.util.ArrayList;
import java.util.Comparator;
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

	public List<Car> getCarsProducedBefore1999() {
		List<Car> carList1 = new ArrayList<>();
		for (Car car : cars) {
			if (car.getYearOfProduction() < 1999) {
				carList1.add(car);
			}
		}
		return carList1;
	}

	public List<Car> getCarsProducedBefore1999WithStream() {
		return cars.stream()
				.filter(car -> car.getYearOfProduction() < 1999)
				.collect(Collectors.toList());
	}

	public Car getTheMostExpensiveCar() {
		Car result = null;
		for (Car car : cars) {
			if(result == null || result.getPrice() < car.getPrice()){
				result = car;
			}
		}
		return result;
	}

	public Car getTheMostExpensiveCarWithStream() {
		return cars
				.stream()
				.max(Comparator.comparing(Car::getPrice))
						.orElse(null);
	}

	public Car getTheCheapestCar(){
		Car result = null;
		for (Car car : cars) {
			if(result == null || result.getPrice() > car.getPrice()){
				result = car;
			}
		} return result;
	}

	public Car getTheCheapestCarWithStream() {
		return cars
				.stream()
				.min(Comparator.comparing(Car::getPrice))
				.orElse(null);
	}

}