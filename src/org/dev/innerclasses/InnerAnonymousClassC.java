package org.dev.innerclasses;

class C {

	public void test() {
		System.out.println("from test()");
	}
}

public class InnerAnonymousClassC {

	public static void main(String[] args) {

		C c1 = new C() {
		};
		c1.test();
	}
}
