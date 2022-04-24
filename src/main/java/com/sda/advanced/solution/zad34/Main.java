package com.sda.advanced.solution.zad34;

public class Main {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		new MyThread().start();
		new MyThread().start();
	}
}
