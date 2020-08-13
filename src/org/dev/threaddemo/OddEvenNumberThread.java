package org.dev.threaddemo;

class OddNum extends Thread {

	@Override
	public void run() {
		for (int i = 1; i <= 100; i += 2)
			System.out.println(i);
	}
}

class EvenNum extends Thread {

	@Override
	public void run() {
		for (int i = 0; i <= 100; i += 2)
			System.out.println(i);
	}
}

public class OddEvenNumberThread {

	public static void main(String[] args) {

		OddNum on = new OddNum();
		on.start();

		EvenNum en = new EvenNum();
		en.start();
	}
}
