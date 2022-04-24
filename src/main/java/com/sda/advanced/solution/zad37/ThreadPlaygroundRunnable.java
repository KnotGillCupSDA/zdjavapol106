package com.sda.advanced.solution.zad37;

import java.util.Random;

public class ThreadPlaygroundRunnable implements Runnable {

	private String name;

	public ThreadPlaygroundRunnable(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			ourLongRunningCalculation();
			System.out.println("Actual working thread: " + Thread.currentThread().getName());
			System.out.println("Name of thread: " + getName());
			System.out.println("Number of actual iteration: " + i);
		}
	}

	private void ourLongRunningCalculation() {
		try {
			Thread.sleep(new Random().nextInt(1000) + 1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
