package org.dev.abstractions;

interface IDemo08 {

	void test1();
}

interface IDemo09 {

	void test2();
}

class IDemo10 implements IDemo08 {

	public void test1() {
		System.out.println("test1() implemented in IDemo10 class");
	}
}

class IDemo11 extends IDemo10 implements IDemo09 {

	public void test2() {
		System.out.println("test2() implemented in IDemo11 class");
	}
}

public class IDemo12 {

	public static void main(String[] args) {

		IDemo11 iDemo11 = new IDemo11();
		iDemo11.test1();
		iDemo11.test2();
	}
}
