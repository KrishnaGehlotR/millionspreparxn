package org.dev.threaddemo;

class OddNumber implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i <= 100; i += 2)
			System.out.println(i);
	}
}

class EvenNumber implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i <= 100; i += 2)
			System.out.println(i);
	}
}

public class OddEvenNumberRunnable {

	public static void main(String[] args) {

		OddNumber oddNum = new OddNumber();
		Thread td1 = new Thread(oddNum);
		td1.start();

		EvenNumber eveNum = new EvenNumber();
		Thread td2 = new Thread(eveNum);
		td2.start();

	}
}
