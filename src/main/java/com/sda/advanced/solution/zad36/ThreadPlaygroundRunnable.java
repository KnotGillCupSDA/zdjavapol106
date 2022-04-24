package com.sda.advanced.solution.zad36;

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
			/*try {
				Thread.sleep(new Random().nextInt(100) + 1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}*/
			System.out.println("Actual working thread: " + Thread.currentThread().getName());
			System.out.println("Name of thread: " + getName());
			System.out.println("Number of actual iteration: " + i);
		}
	}
}
