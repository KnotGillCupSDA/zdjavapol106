package com.sda.advanced.solution.zad35;

import java.util.Random;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		try {
			Thread.sleep(new Random().nextInt(10000)+1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName());
	}
}
