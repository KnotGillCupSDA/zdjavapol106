package com.sda.advanced.solution.zad36;

public class TwoThreadsApp {

	private static Thread thread1 = new Thread(new ThreadPlaygroundRunnable("Nosek"));
	private static Thread thread2 = new Thread(new ThreadPlaygroundRunnable("Buc"));

	public static void main(String[] args) {

		thread1.start();
		thread2.start();

	}
}
