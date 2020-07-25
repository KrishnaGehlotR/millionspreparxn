package org.dev.objectclass;

class B {

	int i = 100;

	public String toString() {
		return "i=" + i;
	}
}

public class ToStringMethod {

	public static void main(String[] args) {

		B b1 = new B();
		System.out.println(b1);// Prints value i=100
		System.out.println(b1.toString());// Prints value 1=100
	}
}
