package org.dev.abstractions;

interface IDemo22 {
	void test1();
}

interface IDemo23 {
	void test2();
}

interface IDemo24 extends IDemo22, IDemo23 {
	void test3();
}

class IDemo25 implements IDemo24 {

	@Override
	public void test1() {
		System.out.println("test1() implemented in class IDemo25");
	}

	@Override
	public void test2() {
		System.out.println("test2() implemented in class IDemo25");
	}

	@Override
	public void test3() {
		System.out.println("test3() implemented in class IDemo25");
	}
}

public class IDemo26 {

	public static void main(String[] args) {

		IDemo25 iDemo25 = new IDemo25();
		iDemo25.test1();
		iDemo25.test2();
		iDemo25.test3();
	}
}
