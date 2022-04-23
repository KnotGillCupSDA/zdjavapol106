package com.sda.advanced.solution.zad14;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {

	public static final int BOUND = 1001;

	public static void main(String[] args) {
		int[] array = new int[100_000];
		fill(array);

		System.out.println(Arrays.toString(array));

		List<Integer> distinct = distinct(array);

	}

	private static void fill(int[] array) {
		Random random = new Random();
		for (int i = 0; i < 100000; i++) {
			array[i] = random.nextInt(BOUND);
		}
	}

	private static List<Integer> distinct(int[] array) {
		return null;
	}

}
