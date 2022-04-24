package com.sda.advanced.solution.playground;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.util.Arrays;
import java.util.stream.Stream;

public class DirectoryTraverse {

	public static void main(String[] args) throws IOException {
		File dir = new File("src/main/resources/zad33");
		File[] files = dir.listFiles();
		System.out.println(Arrays.toString(files));

		Path workingDirectory = Paths.get("src", "main", "resources", "zad33");
		try(Stream<Path> walk = Files.walk(workingDirectory)) {
			walk.forEach(System.out::println);
		}


		//Files.walkFileTree(workingDirectory, new SimpleFileVisitor<>());
	}

}
