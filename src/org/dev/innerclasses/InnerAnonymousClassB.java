package org.dev.innerclasses;

class B {

	public void test() {
		System.out.println("from B");
	}
}

public class InnerAnonymousClassB {

	public static void main(String[] args) {

		B b1 = new B() {
			public void test() {
				System.out.println("from anonymous B");
			}
		};

		b1.test();
	}
}
