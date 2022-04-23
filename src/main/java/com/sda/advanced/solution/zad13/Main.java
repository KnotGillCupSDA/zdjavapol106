package com.sda.advanced.solution.zad13;

import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Manufacturer fiat = new Manufacturer("Fiat", 1900, "Italy");
		Manufacturer mercedes = new Manufacturer("Mercedes", 1901, "Germany");
		Manufacturer porsche = new Manufacturer("Porsche", 1950, "Germany");
		Manufacturer tesla = new Manufacturer("Tesla", 2010, "USA");
		Manufacturer benz = new Manufacturer("Benz", 1901, "Germany");

		Car panda = new Car("Panda", "Fiat", 40000, 2011, Collections.singletonList(fiat), EngineType.S4);
		Car sclass = new Car("S600", "Mercedes", 500000, 2020, List.of(mercedes, benz), EngineType.V12);
		Car sclass2 = new Car("S601", "Mercedes", 550000, 2021, List.of(mercedes, benz, tesla), EngineType.V12);
		Car cayenne = new Car("Cayenne", "Porsche", 300000, 2009, Collections.singletonList(porsche), EngineType.V8);
		Car boxter = new Car("Boxter", "Porsche", 250000, 2001, Collections.singletonList(porsche), EngineType.S6);
		Car eclass = new Car("E500", "Mercedes", 400000, 1992, Collections.singletonList(mercedes), EngineType.V8);

		CarService carService = new CarService();
		carService.addCar(panda);
		carService.addCar(sclass);
		carService.addCar(sclass2);
		carService.addCar(cayenne);
		carService.addCar(boxter);
		carService.addCar(eclass);
		System.out.println(carService.getCars());

		System.out.println("==========");
		carService.removeCar(panda);
		System.out.println(carService.getCars());

		//we're returning an immutable copy, so it will throw an exception
		//carService.getCars().add(panda);
		//System.out.println(carService.getCars());

		System.out.println("==========");
		System.out.println(carService.getCarsWithEngineV12());
		System.out.println(carService.getListOfCarsByEngine(EngineType.V12));

		System.out.println("==========");
		List<Car> carsProducedBefore1999 = carService.getCarsProducedBefore1999();
		List<Car> carsProducedBefore1999WithStream = carService.getCarsProducedBefore1999WithStream();
		System.out.println(carsProducedBefore1999);
		System.out.println(carsProducedBefore1999.equals(carsProducedBefore1999WithStream));

		System.out.println("==========");
		System.out.println(carService.getTheMostExpensiveCar());
		System.out.println(carService.getTheMostExpensiveCarWithStream());
		System.out.println(carService.getTheCheapestCar());
		System.out.println(carService.getTheCheapestCarWithStream());

		System.out.println("==========");
		System.out.println(carService.getCarWithAtLeast3Manufacturers());
		System.out.println(carService.getCarWithAtLeast3ManufacturersWithStream());

		System.out.println("==========");
		System.out.println(carService.getCarsSorted(true));
		System.out.println(carService.getCarsSorted(false));

		System.out.println("==========");
		System.out.println(carService.isCarOnList(boxter));
		System.out.println(carService.isCarOnList(panda));

		System.out.println("==========");
		System.out.println(carService.findCarsByManufacturer(porsche));
		System.out.println(carService.findCarsByManufacturerWithStream(porsche));


		System.out.println("==========");
		System.out.println(
				carService.getListOfCarsMadeByManufacturerThatWasEstablishedInSomeYear(
						1902, CarService.Operator.LESS_THAN));
	}

}
