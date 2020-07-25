package org.dev.inheritances;

import static java.lang.System.*;

class F {

	int i;

	// Constructor with no arguments
	F() {
		i = 123;
	}

	// Single int argument constructor
	F(int i) {
		this.i = i;
	}

	F(String s) {
		out.println(s);
	}
}

class I extends F {

	// Invoking super class no argument constructor
	I() {
		super();
	}

	// Invoking super class single argument constructor
	I(int j) {
		super(j);
	}

	I(int a, int b, String s1, String s2, char ch) {
		super(a);// Invoking super class single argument constructor
	}
}

public class InvokeOverloadConstructor {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		F f1 = new F();
		new F(100);

		F f2 = new F("Hello");

		I i1 = new I();
		I i2 = new I(100);
		I i3 = new I(500, 600, "Hello", "Banglaore", 'A');
	}
}
