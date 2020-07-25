package org.dev.abstractions;

abstract class A {

	// Class is abstract because it has abstract method

	abstract void print();// No body, hence abstract method

	// abstract void disp();// Cannot have static and abstract

	// Can have static and concrete
	static void disp() {
		System.out.println("Disp method()");
	}
}

class B extends A {

	void print() {
		System.out.println("Print() implemented in class C");
	}
}

public class AbstractDemo {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {

		B b1 = new B();
		b1.print();
		b1.disp();// Complier will replace reference variable name with class name like C.dips()
		B.disp();// Calling static concrete method of an abstract class
	}
}
