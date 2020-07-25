package org.dev.objectcreation;

class Apple1 {

	Apple1() {
		System.out.println("Object creation using constructor");
	}
}

public class Scenario1 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Apple1 a1 = new Apple1();
	}
}
