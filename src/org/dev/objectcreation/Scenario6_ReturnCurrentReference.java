package org.dev.objectcreation;

class Apple6 {

	Apple6 getApple() {
		return this;
	}
}

public class Scenario6_ReturnCurrentReference {

	public static void main(String[] args) {

		Apple6 a61 = new Apple6();
		Apple6 a62 = a61.getApple();
		System.out.println(a61 == a62);
	}
}
