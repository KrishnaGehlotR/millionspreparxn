package org.dev.abstractions;

abstract class I {

	abstract void test1();

	abstract void test2();

	abstract void test3();
}

abstract class J extends I {

	void test1() {
		System.out.println("test1() implemented in class J");
	}
}

abstract class K extends J {

	void test2() {
		System.out.println("test2() implemented in class K");
	}
}

class L extends K {

	void test3() {
		System.out.println("test3() implemented in class L");
	}
}

public class AbstractMethods {

	public static void main(String[] args) {
		L l1 = new L();
		l1.test1();
		l1.test2();
		l1.test3();
	}
}
