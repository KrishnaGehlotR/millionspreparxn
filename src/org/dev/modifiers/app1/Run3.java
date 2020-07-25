package org.dev.modifiers.app1;

class C {

	int i = 100;

	void print() {
		System.out.println("i= " + i);
	}
}

public class Run3 {

	public static void main(String[] args) {

		C c1 = new C();// Can't access a default class
		c1.print();// and default members in
		c1.i = 200;// another package
		c1.print();
	}
}
