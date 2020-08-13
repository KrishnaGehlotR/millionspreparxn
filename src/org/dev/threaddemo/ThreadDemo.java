package org.dev.threaddemo;

public class ThreadDemo extends Thread {

	public void run() {
		System.out.println("Thread Running");
	}

	public static void main(String[] args) {

		ThreadDemo td = new ThreadDemo();
		td.start();
	}
}
