package org.dev.inheritances;

class A {

	int i = 100;
	static int j = 200;
	@SuppressWarnings("unused")
	private int k = 300;// private member does not get inherited

	void print() {
		System.out.println("i=" + i);
	}

	static void disp() {
		System.out.println("j=" + j);
	}
}

class B extends A {

}

public class InheritClassMember {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {

		B b1 = new B();
		b1.print();
		System.out.println(b1.i);
		System.out.println("----------------");

		B.disp();
		System.out.println(B.j);
		System.out.println("----------------");

		b1.disp();// Compiler will replace b1 with class B
		System.out.println(b1.j);// Compiler will replace b1 with class B
		// System.out.println(b1.k);// Private members are not inherited

	}
}
