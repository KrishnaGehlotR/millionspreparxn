package org.dev.objectcreation;

class A {

	void print() {
		System.out.println("Print method called from A class");
	}

	private void disp() {
		System.out.println("Disp method called from A class");
	}

	public void paint() {
		System.out.println("Paint method called from A class");
	}

	public static void main(String[] args) {

		A a1 = new A();
		a1.print();
		a1.paint();
		a1.disp();
	}
}

class B extends A {

	void print() {
		System.out.println("Print overridden method called from B class");
	}

	// We are not overriding since it is not inherited, this method belong to this
	// class
	private void disp() {
		System.out.println("Disp method called from B class");
	}

	// Will not work, cannot change to smaller access specifier
//	void paint() {
//		System.out.println("Paint method called from B class");
//	}

	public void paint() {
		System.out.println("Paint method called from B class");
	}

	public static void main(String[] args) {

		B b1 = new B();
		b1.print();
		b1.paint();
		b1.disp();
	}
}

public class AcessSpecifierScope {

	public static void main(String[] args) {

		A a1 = new A();
		a1.print();
		a1.paint();

		B b1 = new B();
		b1.print();
		b1.paint();
	}
}
