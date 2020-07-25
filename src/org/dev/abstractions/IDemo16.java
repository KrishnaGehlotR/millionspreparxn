package org.dev.abstractions;

interface IDemo13 {

	void test1();
}

interface IDemo14 {

	void test2();
}

class IDemo15 implements IDemo13, IDemo14 {

	public void test1() {
		System.out.println("test1() implemented in class IDemo15");
	}

	public void test2() {
		System.out.println("test2() implemented in class IDemo15");
	}
}

public class IDemo16 {

	public static void main(String[] args) {

		IDemo15 iDemo15 = new IDemo15();
		iDemo15.test1();
		iDemo15.test2();
	}
}
