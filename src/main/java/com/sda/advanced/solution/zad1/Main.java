package com.sda.advanced.solution.zad1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		final List<String> unsorted = new ArrayList<>();
		unsorted.add("A");
		unsorted.add("B");
		unsorted.add("b");
		unsorted.add("Z");
		unsorted.add("a");
		unsorted.add("c");

		System.out.println(unsorted);

		System.out.println("===");
		System.out.println(sortWithCollections(unsorted));
		System.out.println("===");
		System.out.println(sortWithCustomComparator(unsorted));
		System.out.println("===");
		System.out.println(sortWithAnonymousClass(unsorted));
		System.out.println("===");
		System.out.println(sortWithLambda(unsorted));
		System.out.println("===");
		List<String> x = sortWithBuiltInComparator(unsorted);
		System.out.println(x);


		System.out.println("=========");
		System.out.println(unsorted);
	}

	private static List<String> sortWithCollections(List<String> unsorted) {
		//we should probably make a copy so that the original list is not changed
		List<String> sorted = new ArrayList<>(unsorted);
		Collections.sort(sorted, new MyComparator());
		return sorted;
	}

	private static List<String> sortWithCustomComparator(List<String> unsorted) {
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

	private static List<String> sortWithBuiltInComparator(List<String> names){
		names.sort(Comparator.reverseOrder());
		return names;
	}
}
