package com.sda.advanced.solution.zad33;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) throws IOException {
		Path workingDirectory = Paths.get("src", "main", "resources", "zad33");

		try(Stream<Path> walk = Files.walk(workingDirectory)) {
			walk
					.filter(path -> path.toString().endsWith(".jpg") || path.toString().endsWith(".png"))
					.forEach(System.out::println);
		}

	}

}
