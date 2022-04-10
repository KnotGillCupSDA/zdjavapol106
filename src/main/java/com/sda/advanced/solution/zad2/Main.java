package com.sda.advanced.solution.zad2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.sda.advanced.solution.zad1.MyComparator;

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

		System.out.println("=== sortWithCollections");
		System.out.println(sortWithCollections(unsorted));
		System.out.println("=== sortWithCustomComparator");
		System.out.println(sortWithCustomComparator(unsorted));
		System.out.println("=== sortWithAnonymousClass");
		System.out.println(sortWithAnonymousClass(unsorted));
		System.out.println("=== sortWithLambda");
		System.out.println(sortWithLambda(unsorted));
		System.out.println("=== sortWithBuiltInComparator");
		List<String> x = sortWithBuiltInComparator(unsorted);
		System.out.println(x);


		System.out.println("=========");
		System.out.println(unsorted);
	}

	private static List<String> sortWithCollections(List<String> unsorted) {
		//we should probably make a copy so that the original list is not changed
		List<String> sorted = new ArrayList<>(unsorted);
		Collections.sort(sorted, new MyCaseInsensitiveComparator());
		return sorted;
	}

	private static List<String> sortWithCustomComparator(List<String> unsorted) {
		unsorted.sort(new MyCaseInsensitiveComparator());
		return unsorted;
	}

	private static List<String> sortWithAnonymousClass(List<String> unsorted) {
		unsorted.sort(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// not optimal solution as we allocate o lot of new Strings when calling toLower()
				return o2.toLowerCase().compareTo(o1.toLowerCase());
			}
		});
		return unsorted;
	}

	private static List<String> sortWithLambda(List<String> names){
		names.sort((o1, o2) -> o2.compareToIgnoreCase(o1));
		return names;
	}

	private static List<String> sortWithBuiltInComparator(List<String> names){
		names.sort(String.CASE_INSENSITIVE_ORDER.reversed());
		return names;
	}
}
