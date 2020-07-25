package org.dev.abstractions;

abstract public class AbstractClassMainMethod {

	static int i = 55;

	static void print() {
		System.out.println("i= " + i);
	}

	abstract void disp();// Non static

	public static void main(String[] args) {
		AbstractClassMainMethod.print();
	}
}
