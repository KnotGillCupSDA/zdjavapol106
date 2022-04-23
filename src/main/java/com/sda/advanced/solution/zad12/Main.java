package com.sda.advanced.solution.zad12;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		Manufacturer fiat = new Manufacturer("Fiat", 1900, "Italy");
		Manufacturer fiat2 = fiat;
		Manufacturer fiat3 = new Manufacturer("Fiat", 1900, "Italy");

		//compare the same reference
		System.out.println(fiat == fiat2);
		System.out.println(fiat.equals(fiat2));

		//compare different instance having same field values
		System.out.println(fiat == fiat3);
		System.out.println(fiat.equals(fiat3));

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
