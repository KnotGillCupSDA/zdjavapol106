package com.sda.advanced.solution.zad4;

public class Main {

	public static void main(String[] args) {
		Storage storage = new Storage();

		storage.addToStorage("k1", "v1");
		storage.addToStorage("k1", "v2");

		storage.printValues("anything");
		storage.printValues("k1");
		//expected [v1, v2]
	}

}
