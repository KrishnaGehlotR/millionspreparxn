package org.dev.objectcreation;

class Apple5 {

	Apple5 getApple() {
		return new Apple5();// Not meaningful because constructor is not private
	}
}

public class Scenario5 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		Apple5 a51 = new Apple5();
		Apple5 a52 = a51.getApple();
	}
}
