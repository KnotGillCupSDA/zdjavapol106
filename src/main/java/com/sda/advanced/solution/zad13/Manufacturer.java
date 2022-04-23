package com.sda.advanced.solution.zad13;

import java.util.Objects;

public final class Manufacturer {
	private final String name;
	private final int year;
	private final String country;

	public Manufacturer(String name, int year, String country) {
		this.name = name;
		this.year = year;
		this.country = country;
	}

	public String getName() {
		return name;
	}

	public int getYear() {
		return year;
	}

	public String getCountry() {
		return country;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Manufacturer that = (Manufacturer) o;
		return year == that.year && Objects.equals(name, that.name) && Objects.equals(country, that.country);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, year, country);
	}

	@Override
	public String toString() {
		return "Manufacturer{" +
				"name='" + name + '\'' +
				", year=" + year +
				", country='" + country + '\'' +
				'}';
	}
}

