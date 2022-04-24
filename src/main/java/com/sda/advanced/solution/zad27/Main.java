package com.sda.advanced.solution.zad27;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		Joiner<String> stringJoiner = new Joiner<>();
		System.out.println(stringJoiner.join(". ", "a", "b", "c", "d")); // a. b. c. d
	}

}
