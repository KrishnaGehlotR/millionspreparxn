package org.dev.objectcreation;

class Apple3 {

	private Apple3() {

	}

	static Apple3 getApple3() {
		Apple3 a3 = new Apple3();
		return a3;
	}
}

public class Scenario3 {

	public static void main(String[] args) {

		Apple3 a3 = Apple3.getApple3();
		System.out.println(a3);
	}
}
