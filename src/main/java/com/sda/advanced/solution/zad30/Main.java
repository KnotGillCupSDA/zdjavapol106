package com.sda.advanced.solution.zad30;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

	public static void main(String[] args) throws IOException {

		Path workingDirectory = Paths.get("src", "main", "resources", "zad30");
		String sourceFileName = "someTextFile.txt";
		System.out.println("exists? " + workingDirectory.resolve(sourceFileName).toFile().exists());

		Path pathToFile = workingDirectory.resolve(sourceFileName);
		String textFromFile = Files.readString(pathToFile);
		System.out.println(textFromFile);

		Files.writeString(workingDirectory.resolve(getReversed(sourceFileName)), getReversed(textFromFile));
	}

	private static String getReversed(String original){
		return new StringBuilder(original).reverse().toString();
	}
}
