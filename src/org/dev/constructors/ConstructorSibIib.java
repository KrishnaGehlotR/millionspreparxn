package org.dev.constructors;

class A {

	A() {
		System.out.println("Constructor of class A");
	}

	static {
		System.out.println("SIB of class A");
	}

	{
		System.out.println("IIB of class A");
	}
}

public class ConstructorSibIib {

	static {
		System.out.println("SIB of class ConstructorSibIib");
	}

	{
		System.out.println("IIB of class ConstructorSibIib");
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		System.out.println("Main starts");
		A a1 = new A();
		A a2 = new A();
		System.out.println("Main ends");

		new ConstructorSibIib();
	}
}
