package com.sda.advanced.solution.zad4;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		Storage storage = new Storage();

		storage.addToStorage("k1", "v1");
		storage.addToStorage("k1", "v2");
		storage.addToStorage("k1", "v3");

		storage.addToStorage("k2", "v1");
		storage.addToStorage("k2", "v4");

		storage.addToStorage("k3", "v5");

		storage.printValues("anything");
		storage.printValues("k1"); //expected [v1, v2, v3]
		storage.printValues("k2");
		storage.printValues("k3");

		System.out.println("===");
		List<String> keysForV1 = storage.findKeysByValue("v1");
		System.out.println(keysForV1); //expected [k1, k2]
		System.out.println(storage.findKeysByValue("v2")); //expected [k1]
		System.out.println(storage.findKeysByValue("v5")); //expected [k3]
		System.out.println(storage.findKeysByValue("not existing")); //expected []

		System.out.println("===");
		System.out.println(storage.findKeysByValueWithStream("v1")); //expected [k1, k2]
		System.out.println(storage.findKeysByValueWithStream("v2")); //expected [k1]
		System.out.println(storage.findKeysByValueWithStream("v5")); //expected [k3]
		System.out.println(storage.findKeysByValueWithStream("not existing")); //expected []
	}

}
