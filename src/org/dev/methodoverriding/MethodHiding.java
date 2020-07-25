package org.dev.methodoverriding;

class E {

	static int i = 100;

	static void print() {
		System.out.println("print() of A");
	}
}

class F extends E {

	static int i = 4321;// Shadowing

	static void print() {
		System.out.println("print() of B");// Hiding
	}
}

public class MethodHiding {

	public static void main(String[] args) {

		F.print();
		System.out.println(F.i);
	}
}
