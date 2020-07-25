package org.dev.threaddemo;

public class MultithreadingRunnableDemo implements Runnable {

	@Override
	public void run() {
		try {
			System.out.println("Thread " + Thread.currentThread().getId() + " is running");
		} catch (Exception e) {
			System.out.println("Exception is found");
		}
	}

	public static void main(String[] args) {
		for (int i = 0; i < 8; i++) {
			Thread thread = new Thread(new MultithreadingRunnableDemo());
			thread.start();
		}
	}

}