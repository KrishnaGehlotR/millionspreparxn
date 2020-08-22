package org.dev.innerclasses;

public class InnerClassA {

	class A {
		int i = 0;
	}

	public static void main(String[] args) {

		InnerClassA icA = new InnerClassA();
		A a1 = icA.new A();
		System.out.println(a1.i);
	}

}
