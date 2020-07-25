package org.dev.methodoverriding;

class O {

}

class C extends O {

	int i, j;

	private C(int i, int j) {
		super();// Automatically called by compiler
		this.i = i;
		this.j = j;
	}

	C() {
		this(100, 200);
		// super(); We cannot have this and super class constructor together
	}

	void print() {
		System.out.println("Print() method");
	}

	void disp() {
		this.print();
	}
}

public class ThisDemo {

	public static void main(String[] args) {

		C c1 = new C();
		System.out.println("i= " + c1.i + ", j= " + c1.j);
		c1.disp();
	}
}
