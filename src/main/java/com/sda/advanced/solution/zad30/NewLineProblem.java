package com.sda.advanced.solution.zad30;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class NewLineProblem {

	public static void main(String[] args) throws IOException {
		Path workingDirectory = Paths.get("src", "main", "resources", "zad30");
		String sourceFileName = "someTextFile.txt";

		Path pathToFile = workingDirectory.resolve(sourceFileName);
		List<String> allLines = Files.readAllLines(pathToFile);

		String reversedFileName = getReversed(sourceFileName);
		Files.write(workingDirectory.resolve(reversedFileName), getReversed(allLines));
	}

	private static String getReversed(String original){
		return new StringBuilder(original).reverse().toString();
	}

	private static List<String> getReversed(List<String> allLines) {
		List<String> reversed = allLines.stream().map(NewLineProblem::getReversed).collect(Collectors.toList());
		Collections.reverse(reversed);
		return reversed;
	}

}
