package org.dev.threaddemo;

public class RunnableDemo implements Runnable {

	@Override
	public void run() {
		System.out.println("Runnable thread Running");
	}

	public static void main(String[] args) {

		RunnableDemo rd = new RunnableDemo();
		Thread td = new Thread(rd);
		td.start();
	}

}
