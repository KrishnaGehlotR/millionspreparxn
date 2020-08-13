package org.dev.threaddemo;

class ThreadDB extends Thread {

	int total;

	@Override
	public void run() {
		synchronized (this) {// Current instance
			for (int i = 0; i < 1000000000; i++) {
				total += i;
			}
		}
	}
}

public class NotifyDemo {

	public static void main(String[] args) {

		ThreadDB tb = new ThreadDB();
		tb.start();

		synchronized (tb) {
			System.out.println("Waiting for tb to complete");

			try {
				tb.wait();
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
			System.out.println("Wait over");
		}

	}
}
