package com.sda.advanced.solution.zad12;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		Manufacturer fiat = new Manufacturer("Fiat", 1900, "Italy");

		Car panda = new Car("Panda",
				"Fiat",
				40_000,
				2011,
				List.of(fiat),
				EngineType.S4);

		System.out.println(panda);
		System.out.println(panda.getManufacturerList().get(0).getName());
	}

}
