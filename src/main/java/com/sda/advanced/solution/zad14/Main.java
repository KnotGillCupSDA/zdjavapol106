package com.sda.advanced.solution.zad14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {

	public static final int BOUND = 1001;

	public static void main(String[] args) {
		int[] array = new int[100_000];
		fill(array);

		System.out.println(Arrays.toString(array));

		List<Integer> distinct = distinct(array);
		System.out.println("========================");
		System.out.println(distinct);
		List<Integer> duplicates = getDuplicates(array);
		System.out.println("========================");
		System.out.println(duplicates);
		System.out.println("========================");



		//alternative: from Magda
		Set<Integer> uniqueValues = new HashSet<>();
		Set<Integer> duplicatedValues = new HashSet<>();
		for (Integer randomNumber : array) {
			if (!uniqueValues.add(randomNumber)) {
				duplicatedValues.add(randomNumber);
			}
		}
		List<Integer> uniqueValuesList = new ArrayList<>(uniqueValues);
		List<Integer> duplicatedValuesList = new ArrayList<>(duplicatedValues);

		System.out.println("Unique values: " + uniqueValuesList);
		System.out.println("Duplicated values: " + duplicatedValuesList);

	}

	private static void fill(int[] array) {
		Random random = new Random();
		for (int i = 0; i < 100000; i++) {
			array[i] = random.nextInt(BOUND);
		}
	}

	private static List<Integer> distinct(int[] array) {
		List<Integer> newIntegerArrayList = new ArrayList<>();

		for (Integer integer: array) {
			if (!newIntegerArrayList.contains(integer)) {
				newIntegerArrayList.add(integer);
			}
		}
		return newIntegerArrayList;
	}

	private static List<Integer> distinctWithSet(int[] array) {
		Set<Integer> set = new HashSet<>();
		for (int i : array) {
			set.add(i);
		}
		return new ArrayList<>(set);
	}

	private static List<Integer> distinctWithStream(int[] array) {
		return Arrays.stream(array).distinct().boxed().collect(Collectors.toList());
	}

	private static List<Integer> getDuplicates(int[] array) {
		Set<Integer> duplicates = new HashSet<>();
		Set<Integer> alreadySeen = new HashSet<>();
		for (int i : array) {
			if(!alreadySeen.add(i)) {
				duplicates.add(i);
			}
		}

		return new ArrayList<>(duplicates);
	}

}
