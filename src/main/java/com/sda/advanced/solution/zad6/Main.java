package com.sda.advanced.solution.zad6;

import java.util.Map;
import java.util.TreeMap;

public class Main {

	public static void printFirstAndLast(TreeMap<?,?> map) {
		System.out.println(map.firstEntry());
		System.out.println(map.lastEntry());
	}

	public static void main(String[] args) {
		printFirstAndLast(new TreeMap<>(Map.of("a", "1", "b", 2, "c", 3)));
	}

}
