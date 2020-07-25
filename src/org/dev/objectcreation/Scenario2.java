package org.dev.objectcreation;

class Apple2 {

	private Apple2() {

	}

	// Factory method
	static Apple2 getApple2() {
		return new Apple2();
	}
}

public class Scenario2 {

	public static void main(String[] args) {

		// Apple2 a2 = new Apple2();// Not possible since constructor is private

		Apple2 a2 = Apple2.getApple2();
		System.out.println(a2);
	}
}
