package org.dev.inheritances;

class Apple {

	static int cntr;

	Apple() {
		cntr++;
	}
}

public class CountObjectCreation {

	@SuppressWarnings("unused")
	static public void main(String[] args) {

		Apple a1 = new Apple();
		Apple a2 = new Apple();
		new Apple();

		System.out.println("No of apples are: " + Apple.cntr);
	}
}
