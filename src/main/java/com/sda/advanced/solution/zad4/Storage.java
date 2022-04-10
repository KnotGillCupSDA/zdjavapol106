package com.sda.advanced.solution.zad4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Storage {
	private final Map<String, List<String>> map = new HashMap<>();

	public void addToStorage(String key, String value) {
		//if the map does not contain the key then create and put new list, add value to list
		if(!map.containsKey(key)) {
			List<String> values = new ArrayList<>();
			values.add(value);
			map.put(key, values);
		} else {
			//else if the map contains the key then get existing list and append another value
			List<String> values = map.get(key);
			values.add(value);
		}

	}

	public void printValues(String key) {
		List<String> strings = map.get(key);
		System.out.println(strings);
	}

	public List<String> findKeysByValue(String value) {
		List<String> listOfKeys = new ArrayList<>();
		for (Map.Entry<String, List<String>> entry : map.entrySet()) {
			//add only if value is on the list under that key
			if(entry.getValue().contains(value)) {
				listOfKeys.add(entry.getKey());
			}
		}
		return listOfKeys;
	}

	public List<String> findKeysByValueWithStream(String value) {
		return map.entrySet().stream()
				.filter(entry -> entry.getValue().contains(value))
				.map(Map.Entry::getKey)
				.collect(Collectors.toList());
	}
}
