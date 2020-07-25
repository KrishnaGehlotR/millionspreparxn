package org.dev.staticnonstatic;

public class Orange {

	void test() {
		System.out.println("I am Orange");
	}

	public static void main(String[] args) {

		Orange o1 = new Orange();
		o1.test();

		new Orange().test();
	}
}
