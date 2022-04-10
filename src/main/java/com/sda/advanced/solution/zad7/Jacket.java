package com.sda.advanced.solution.zad7;

public interface Jacket {

	String EMPTY = "pusty magazynek";

	/**
	 * dodawanie naboju do magazynka, nie pozwala załadować więcej naboi niż wynosi pojemność magazynka
	 */
	void loadBullet(String bullet);

	/**
	 * zwraca informację o tym czy broń jest naładowana (przynajmniej jeden nabój) czy nie
	 */
	boolean isLoaded();

	/**
	 * jedno wywołanie wystrzeliwuje (wypisuje w konsoli wartość string) jeden
	 * @return bullet string or "pusty magazynek"
	 */
	String shot();

}
