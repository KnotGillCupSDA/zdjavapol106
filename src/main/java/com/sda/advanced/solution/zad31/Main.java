package com.sda.advanced.solution.zad31;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) throws IOException {
		Path workingDirectory = Paths.get("src", "main", "resources", "zad31");
		Path pathToFile = workingDirectory.resolve("zadania.txt");

		Map<String, Integer> wordsOccurrences = new TreeMap<>();
		for (String line : Files.readAllLines(pathToFile)) {
			for (String word : line.split("\\s+")) {
				Integer count = wordsOccurrences.get(word);
				if (count != null) {
					count++;
				} else {
					count = 1;
				}
				wordsOccurrences.put(word, count);
			}
			wordsOccurrences.forEach((key, val) -> System.out.println(key + " - " + val));
		}

		Files.writeString(workingDirectory.resolve("counters"), wordsOccurrences.toString());
	}
}
