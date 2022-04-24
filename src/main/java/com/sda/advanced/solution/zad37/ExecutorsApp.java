package com.sda.advanced.solution.zad37;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorsApp {

	private Executor executor;

	public static void main(String[] args) throws InterruptedException {

		final ExecutorService executorService = Executors.newFixedThreadPool(2);
		for (int i = 0; i < 10; i++) {
			executorService.execute(new ThreadPlaygroundRunnable("watek-" + i));
		}
		executorService.shutdown();
		if(!executorService.awaitTermination(5, TimeUnit.SECONDS)) {
			System.out.println("Timeout. Not waiting any longer");
			executorService.shutdownNow();
		}

	}
}