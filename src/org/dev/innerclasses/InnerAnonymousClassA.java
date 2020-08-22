package org.dev.innerclasses;

class A {

	public void test() {
	}
}

public class InnerAnonymousClassA {

	public static void main(String[] args) {

		A b1 = new A() {
			public void test() {
				System.out.println("from A");
			}
		};

		b1.test();
	}
}
