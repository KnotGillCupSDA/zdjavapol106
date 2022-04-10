package com.sda.advanced.solution.zad3;

import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		/*Map<String, Integer> map = new HashMap<>();
		map.put("Java", 18);
		map.put("C#", 9);
		map.put("Python", 1);
		map.put("JavaScript", 0);
		map.put("PHP", 0);*/

		//java 11 style - immutable map
		Map<String, Integer> map = Map.of("Java", 18,
				"C#", 9,
				"Python", 1,
				"JavaScript", 0,
				"PHP", 0);

		print(map);
		System.out.println("===");
		printWithForeach(map);
		System.out.println("===");
		printWithStream(map);

	}

	private static void print(Map<String, Integer> map) {
		/*for (String i : map.keySet()) {
			System.out.println("Klucz: " + i + " " + "Wartość: " + map.get(i));
		}*/

		//it's better to iterate over key->value pairs in this case
		int index = 0;
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			boolean isLastElement = index++ == map.size() - 1;
			if (isLastElement) {
				System.out.println("Klucz: " + entry.getKey() + ", " + "Wartość: " + entry.getValue() + ".");
			} else {
				System.out.println("Klucz: " + entry.getKey() + ", " + "Wartość: " + entry.getValue() + ",");
			}
		}

	}

	private static void printWithForeach(Map<String, Integer> map) {
		AtomicInteger index = new AtomicInteger(0);
		map.forEach((key, value) -> {
			boolean isLastElement = index.getAndIncrement() == map.size() - 1;
			if (isLastElement) {
				System.out.println("Klucz: " + key + ", " + "Wartość: " + value + ".");
			} else {
				System.out.println("Klucz: " + key + ", " + "Wartość: " + value + ",");
			}
		});
	}

	private static void printWithStream(Map<String, Integer> map) {
		String collect = map.entrySet().stream()
				.map(entry -> "Klucz: " + entry.getKey() + ", " + "Wartość: " + entry.getValue())
				.collect(Collectors.joining("," + System.lineSeparator(), "", "."));
		System.out.println(collect);
	}

}
