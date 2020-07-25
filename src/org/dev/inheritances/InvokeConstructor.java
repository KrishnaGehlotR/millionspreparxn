package org.dev.inheritances;

class X {

	X() {
		System.out.println("Constructor of class x");
	}
}

class Y extends X {

	Y() {
		super();
		System.out.println("Constructor of class y");
	}
}

public class InvokeConstructor {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Y y1 = new Y();

	}
}
