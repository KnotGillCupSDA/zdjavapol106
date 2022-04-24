package com.sda.advanced.solution.zad30;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

	public static void main(String[] args) {

		Path workingDirectory = Paths.get("src", "main", "resources", "zad30");
		System.out.println(workingDirectory.resolve("someTextFile.txt").toFile().exists());

	}
}
