package com.sda.advanced.solution.zad27;

import java.util.List;

import com.sda.advanced.solution.zad11.Point2D;

public class Main {

	public static void main(String[] args) {
		Joiner<String> stringJoiner = new Joiner<>(". ");

		stringJoiner.joinPrzemek("a", "b", "c", "d"); // a. b. c. d
		System.out.println();
		System.out.println(stringJoiner.join("a", "b", "c", "d")); // a. b. c. d


		Joiner<Point2D> point2DJoiner = new Joiner<>(System.lineSeparator());
		System.out.println(point2DJoiner.join(new Point2D(0,0), new Point2D(1,1), new Point2D(5, -1)));
	}

}
