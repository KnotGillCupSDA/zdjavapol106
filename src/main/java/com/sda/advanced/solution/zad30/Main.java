package com.sda.advanced.solution.zad30;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

	public static void main(String[] args) throws IOException {

		Path workingDirectory = Paths.get("src", "main", "resources", "zad30");
		System.out.println("exists? " + workingDirectory.resolve("someTextFile.txt").toFile().exists());

		Path pathToFile = workingDirectory.resolve("someTextFile.txt");
		String textFromFile = Files.readString(pathToFile);
		System.out.println(textFromFile);

		Files.writeString(workingDirectory.resolve("someNewFile.txt"), getReversed(textFromFile));
	}

	private static String getReversed(String original){
		return new StringBuilder(original).reverse().toString();
	}
}
