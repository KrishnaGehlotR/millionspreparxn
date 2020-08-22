package org.dev.innerclasses;

// Inheriting member of outer class to static Inner class.
public class InnerStaticClassC {

	int i = 10;

	static class C extends InnerStaticClassC {

	}

	public static void main(String[] args) {

		C c1 = new C();
		System.out.println(c1.i);
	}
}
