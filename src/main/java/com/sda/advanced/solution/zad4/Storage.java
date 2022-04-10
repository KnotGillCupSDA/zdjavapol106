package com.sda.advanced.solution.zad4;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Storage {
	private final Map<String, List<String>> map = new HashMap<>();

	public void printValues(String key) {
		List<String> strings = map.get(key);
		System.out.println(strings);
	}

	public void addToStorage(String k1, String v1) {

	}
}
