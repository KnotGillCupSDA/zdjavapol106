package com.sda.advanced.solution.playground;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class IO {

	public static void main(String[] args) {
		/*

			"/home/tomek/myfile";

			relative, when we are already in home
			"tomek/myfile"


			my workind dir is
			C:\priv\dev\SDA\zdjavapol106

			src/main/java/com/sda/advanced/solution/playground/IO.java
			C:\priv\dev\SDA\zdjavapol106\src\main\java\com\sda\advanced\solution\playground\IO.java

		 */

		String path = "C:\\priv\\dev\\SDA\\zdjavapol106\\src\\main\\java\\com\\sda\\advanced\\solution\\playground\\IO.java";

		Path ourJavaCodeDir = Paths.get("src", "main", "java");
		Path pathToSolution = Paths.get("com", "sda", "advanced", "solution");
		Path pathToMainPackage = ourJavaCodeDir.resolve(pathToSolution);

		pathToMainPackage.toFile();

		File file =
				new File("C:\\priv\\dev\\SDA\\zdjavapol106\\src\\main\\java\\com\\sda\\advanced\\solution\\playground\\IO.java");

		file.toPath();

		try {
			Path pathToIOJava = pathToMainPackage.resolve("playground").resolve("IO.java");
			String playground = Files.readString(pathToIOJava);
			System.out.println(playground);
			Files.writeString(pathToMainPackage.resolve("playground").resolve("IO2.java"), playground);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
