package org.dev.objectcreation;

class Apple4 {

	private static Apple4 a4;

	private Apple4() {

	}

	// Factory method
	static Apple4 getApple() {
		if (a4 == null)
			a4 = new Apple4();
		return a4;
	}
}

public class Scenario4_SingletonClass {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// Apple4 a4 = new Apple4();// Not possible since constructor is private

		Apple4 a4 = Apple4.getApple();

	}
}
