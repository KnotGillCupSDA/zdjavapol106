package com.sda.advanced.solution.zad27;

public class Joiner<T> {

	private final String separator;

	public Joiner(String separator) {
		this.separator = separator;
	}

	public String join(T... elements) {
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < elements.length; i++) {
			builder.append(elements[i]);
			if (i < elements.length - 1) {
				builder.append(separator);
			}
		}

		return builder.toString();
	}

	public void joinPrzemek(T... elements) {
		for (int i = 0; i < elements.length; i++) {
			if (i < elements.length - 1) {
				System.out.print(elements[i] + separator);
			} else {
				System.out.print(elements[i]);
			}
		}
	}

}
