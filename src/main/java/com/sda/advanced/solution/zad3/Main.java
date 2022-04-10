package com.sda.advanced.solution.zad3;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("Java", 18);
		map.put("C#", 9);
		map.put("Python", 1);
		map.put("JavaScript", 0);
		map.put("PHP", 0);

		print(map);

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
				System.out.println("Klucz: " + entry.getKey() + " " + "Wartość: " + entry.getValue() + ".");
			} else {
				System.out.println("Klucz: " + entry.getKey() + " " + "Wartość: " + entry.getValue() + ",");
			}
		}

	}

}
