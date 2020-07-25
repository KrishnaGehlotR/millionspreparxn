package org.dev.abstractions;

abstract class C {

	static int i;
	int j;
	static final double PI = 3.14;

	static void print() {
		System.out.println("i= " + i);
	}

	void disp() {
		System.out.println("j= " + j);
	}

	// Can not have static method as abstract
	// abstract static void println();
}

class D extends C {

}

public class NonStaticMethods {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {

		D d1 = new D();
		d1.disp();
		D.print();
		System.out.println("===============");

		System.out.println(d1.j);// Non static variable
		System.out.println(d1.i);// Static variable
		System.out.println(D.i);
		System.out.println("===============");

		C.print();// Calling a static method of an abstract class
		D.print();// Calling an inherited static method
	}
}
