package org.dev.threaddemo;

class A {

	synchronized void test1() {

		Thread t1 = Thread.currentThread();
		System.out.println(t1.getName() + " started test1");

		for (int i = 1; i <= 5; i++) {

			System.out.println(t1.getName() + "::" + i);

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println(t1.getName() + " completed test1");
		}
	}
}

class B extends Thread {

	A a1;

	B(A a1) {
		this.a1 = a1;
	}

	@Override
	public void run() {
		a1.test1();
	}
}

class C extends Thread {

	A a1;

	C(A a1) {
		this.a1 = a1;
	}

	@Override
	public void run() {
		a1.test1();
	}
}

public class ThreadSynchronize {

	public static void main(String[] args) {

		A a1 = new A();
		B b1 = new B(a1);
		C c1 = new C(a1);

		b1.setName("B Thread");
		c1.setName("C Thread");

		b1.start();
		c1.start();
	}
}
