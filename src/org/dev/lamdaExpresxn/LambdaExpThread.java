package org.dev.lamdaExpresxn;

public class LambdaExpThread {

	public static void main(String[] args) {

		// Thread example without lambda
		Runnable r1 = new Runnable() {

			@Override
			public void run() {
				System.out.println("Thread 1 running");
			}
		};
		Thread t1 = new Thread(r1);
		t1.start();

		// Thread example with lambda

		Runnable r2 = () -> {
			System.out.println("Thread 2 running");
		};
		Thread t2 = new Thread(r2);
		t2.start();
	}
}
