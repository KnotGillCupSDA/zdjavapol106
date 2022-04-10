package com.sda.advanced.solution.zad7;

import java.util.ArrayDeque;
import java.util.Deque;

public class JacketImpl implements Jacket {

	private final Deque<String> stack = new ArrayDeque<>();
	private final int maxSize;

	public JacketImpl() {
		this(10);
	}

	public JacketImpl(int maxSize) {
		this.maxSize = maxSize;
	}

	@Override
	public void loadBullet(String bullet) {
		//if is full then throw exception
		if(stack.size() >= maxSize) {
			throw new RuntimeException("Jacket is overload");
		}

		//else add to deque/stack
		stack.push(bullet);
	}

	@Override
	public boolean isLoaded() {
		return !stack.isEmpty();
	}

	@Override
	public String shot() {
		if (isLoaded()) {
			return stack.pop();
		} else {
			return Jacket.EMPTY;
		}
	}
}
