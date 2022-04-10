package com.sda.advanced.solution.zad1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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

	private static List<String> sortWithCollections(List<String> unsorted) {
		Collections.sort(unsorted, new MyComparator());
		return unsorted;
	}

	private static List<String> sortWithOuterComparator(List<String> unsorted) {
		unsorted.sort(new MyComparator());
		return unsorted;
	}

	private static List<String> sortWithAnonymousClass(List<String> unsorted) {
		unsorted.sort(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
			}
		});
		return unsorted;
	}

	private static List<String> sortWithLambda(List<String> names){
		names.sort((o1, o2) -> o2.compareTo(o1));
		return names;
	}

	private static List<String> sortWithComparator(List<String> names){
		names.sort(Comparator.reverseOrder());
		return names;
	}
}
