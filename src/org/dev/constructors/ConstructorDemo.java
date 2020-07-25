package org.dev.constructors;

class Construct {

	int i, j;// Non static variable declaration

	Construct() {
		i = 100;// Initialization of non static variable in a constructor
		j = 100;
		System.out.println("This is constructor");
	}

	void Consruct() {
		System.out.println("This is Consruct() method");
	}

	void consruct() {
		System.out.println("This is consruct() method");
	}
}

public class ConstructorDemo {

	public static void main(String[] args) {

		Construct construct = new Construct();

		System.out.println("i= " + construct.i);
		System.out.println("j= " + construct.j);

		construct.Consruct();
		construct.consruct();
	}
}
