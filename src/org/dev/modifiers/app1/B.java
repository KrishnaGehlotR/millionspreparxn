package org.dev.modifiers.app1;

public class B {

	int i = 100;

	// private constructor
	private B() {

	}

	public void print() {
		System.out.println("i= " + i);
	}

	public static void main(String[] args) {

		B b1 = new B();
		b1.print();
	}
}
