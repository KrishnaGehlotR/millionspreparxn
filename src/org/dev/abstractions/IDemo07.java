package org.dev.abstractions;

interface IDemo04 {

	void test1();

	void test2();
}

abstract class IDemo05 implements IDemo04 {

	public void test1() {
		System.out.println("test1() implemented in class IDemo05");
	}
}

class IDemo06 extends IDemo05 {

	public void test2() {
		System.out.println("test2() implemented in class IDemo06");
	}
}

public class IDemo07 {

	public static void main(String[] args) {

		IDemo06 iDemo06 = new IDemo06();
		iDemo06.test1();
		iDemo06.test2();
	}
}
