package org.dev.typecasting;

class A {

}

class B extends A {

}

class C extends B {

}

public class UpDownCasting {

	public static void main(String[] args) {

		A a1 = new A();
		B b1 = new B();
		C c1 = new C();
		System.out.println(a1);
		System.out.println(b1);
		System.out.println(c1);

		A a2 = a1;
		B b2 = b1;
		C c2 = c1;
		System.out.println(a2);// No object creation, but a2 refers to same object as a1
		System.out.println(b2);
		System.out.println(c2);

		B b3 = new C();// Auto upcasting
		A a3 = new B();// Auto upcasting
		A a4 = new C();// Auto upcasting
		System.out.println(b3);
		System.out.println(a3);
		System.out.println(a4);

		// B b4 = new A();// Direct down casting of super class object
		// C c4 = new B();// CTE - incompatible types

		// B b4 = (B) new A();// Explicit casting of a super class
		// C c4 = (C) new B();// object will compile but generates
		// C c5 = (C) new A();// Class Cast Exception during execution

		B b5 = (B) a3;// Downcasting of an upcasted object
		C c5 = (C) b3;// Downcasting of an upcasted object
		C c6 = (C) a4;// Downcasting of an upcasted object
		System.out.println(b5);
		System.out.println(c5);
		System.out.println(c6);
	}
}
