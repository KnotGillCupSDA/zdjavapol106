package com.sda.advanced.solution.zad7;

import java.util.ArrayDeque;
import java.util.Deque;

public class JacketImpl implements Jacket {

	private final Deque<String> stack = new ArrayDeque<>();

	@Override
	public void loadBullet(String bullet) {
		stack.add(bullet);
	}

	@Override
	public boolean isLoaded() {
		return !stack.isEmpty();
	}

	@Override
	public String shot() {
		return stack.pop();
	}
}
