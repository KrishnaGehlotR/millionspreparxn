package org.dev.methodoverriding;

class A {

	void print() {
		System.out.println("Non static method");
	}

	static void test() {

		System.out.println("Static method");
	}
}

class B extends A {

	void print() {
		System.out.println("Overriding");
	}

	static void test() {
		System.out.println("Static hiding");
	}
}

public class StaticHiding {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {

		A a1 = new A();
		a1.print();
		a1.test();

		B b1 = new B();
		b1.print();
		b1.test();
	}
}
