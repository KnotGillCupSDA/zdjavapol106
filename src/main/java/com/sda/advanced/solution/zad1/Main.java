package com.sda.advanced.solution.zad1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Zad1
public class Main {

	public static void main(String[] args) {
		List<String> unsorted = new ArrayList<>();
		unsorted.add("A");
		unsorted.add("B");
		unsorted.add("b");
		unsorted.add("Z");
		unsorted.add("a");
		unsorted.add("c");

		System.out.println(unsorted);

		List<String> sorted = sortWithCollections(unsorted);

		System.out.println("===");
		System.out.println(sorted);
	}

	/**
	 * @param unsorted a list to be sorted
	 * @return sorted list
	 */
	private static List<String> sortWithCollections(List<String> unsorted) {
		Collections.sort(unsorted, (o1, o2) -> o2.compareTo(o1));
		return unsorted;
	}

	private static List<String> sortNamesFromZToA(List<String> names){
		names.sort((o1, o2) -> o2.compareTo(o1));
		return names;
	}
}
