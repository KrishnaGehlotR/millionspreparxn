package org.dev.staticnonstatic;

public class Mirchi {

	static int i = 100;// static variable
	int j = 200;// non-static variable

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		Mirchi m1 = new Mirchi();
		Mirchi m2 = new Mirchi();
		new Mirchi();
	}

	// static method void type, no return
	static void print() {
	}

	// static method return type
	static int disp() {
		int i = 100;
		return i;
	}
}
