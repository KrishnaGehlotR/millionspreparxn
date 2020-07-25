package org.dev.abstractions;

abstract interface IDemo03 {

	// abstract is optional as it is default
	void test1();// public & abstract are optional as it is default

	public abstract void test2();
}

class IDemo02 implements IDemo03 {

	@Override
	public void test1() {
		System.out.println("test1() implemented in class IDemo");
	}

	@Override
	public void test2() {
		System.out.println("test2() implemented in class IDemo");
	}

	void disp() {
		test2();// Can call directly
	}

	public static void main(String[] args) {

		IDemo02 iDemo = new IDemo02();
		iDemo.test1();
		iDemo.test2();
		iDemo.disp();
	}

}

public class IDemo01 {

	public static void main(String[] args) {
		IDemo02 iDemo = new IDemo02();
		iDemo.test1();
		iDemo.test2();
		iDemo.disp();
	}
}
