package com.sda.advanced.solution.zad28;

public class Main {

	public static void main(String[] args) {
		SkipArrayList<Character> list = new SkipArrayList<>();
		//[a, b, c, d, e, f, g]
		list.add('a');
		list.add('b');
		list.add('c');
		list.add('d');
		list.add('e');
		list.add('f');
		list.add('g');
		list.add('h');
		list.add('i');
		list.add('j');
		list.add('k');

		System.out.println(list.getEveryNthElement(2, 3));
	}

}
