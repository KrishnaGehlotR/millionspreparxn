package org.dev.constructors;

class D {

	int i;

	D(int a) {
		i = a;
	}

	D() {
		i = 123;
	}
}

public class ConstructorMultiple {

	public static void main(String[] args) {
		D d1 = new D(100);// int arg constructor is invoked
		System.out.println(d1.i);

		D d2 = new D();// no arg constructor is invoked
		System.out.println(d2.i);

		D d3 = new D(200);
		System.out.println(d3.i);

		D d4 = new D();
		System.out.println(d4.i);

		d2.i = 567;
		System.out.println(d1.i);
	}
}
