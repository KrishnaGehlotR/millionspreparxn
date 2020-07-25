package org.dev.packages;

public class B {

	public static void main(String[] args) {

		System.out.println("Class B of package org.dev.packages");

		A a1 = new A();
		a1.print();
		B b1 = new B();
		System.out.println(b1);
	}
}
