package org.dev.inheritances;

class C {

	int i, j;

	// Constructor with 2 arguments
	C(int i, int j) {
		this.i = i;
		this.j = j;
	}

	void print() {
		System.out.println("i= " + i);
		System.out.println("j= " + j);
	}
}

class D extends C {

	int a, b;

	// Constructor
	D(int a, int b) {
		super(a, b);// Invoking super class constructor
		this.a = a;
		this.b = b;
	}

	void disp() {
		System.out.println("a= " + a);
		System.out.println("b= " + b);
	}
}

class E extends D {

	// 2 args constructor
	E(int x, int y) {
		super(x, y);// Calling super class constructor
	}

	// Constructor no argumetns
	E() {
		super(400, 600);
	}
}

public class Inherit3Classes {

	public static void main(String[] args) {

		C c1 = new C(111, 222);
		c1.print();
		System.out.println("---------------");

		D d1 = new D(500, 600);
		d1.disp();
		d1.print();
		System.out.println("---------------");

		E e1 = new E(555, 666);
		e1.print();
		e1.disp();
		System.out.println("---------------");

		E e2 = new E();
		e2.print();
		e2.disp();

	}
}
