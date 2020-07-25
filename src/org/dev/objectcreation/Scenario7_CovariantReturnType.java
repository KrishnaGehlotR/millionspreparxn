package org.dev.objectcreation;

class Apple7 {

	Apple7 getApple() {
		return this;
	}
}

class OotyApple extends Apple7 {

	OotyApple getApple() {
		return this;
	}

	void print() {
		System.out.println("Covariant return type demo");
	}
}

public class Scenario7_CovariantReturnType {

	public static void main(String[] args) {

		new OotyApple().getApple().print();
	}
}
