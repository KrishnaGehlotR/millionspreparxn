package org.dev.modifiers.app1;

public class A {

	private int i = 10;

	void print() {
		System.out.println("i= " + i);
	}

	public static void main(String[] args) {

		A a1 = new A();
		a1.print();
		a1.i = 20;
		a1.print();
	}
}
