package org.dev.innerclasses;

public class InnerClassB {

	class B {
		int i = 10;
	}

	public static void main(String[] args) {

		InnerClassB icB = new InnerClassB();
		B b1 = icB.new B();
		System.out.println(b1.i);
	}
}
