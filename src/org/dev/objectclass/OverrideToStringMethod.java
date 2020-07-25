package org.dev.objectclass;

class C {

	int i = 100, j = 100;

	public String toString() {
		return "i=" + i + ", j=" + j;
	}
}

public class OverrideToStringMethod {

	public static void main(String[] args) {

		C c1 = new C();
		System.out.println(c1);// Prints value i=100, j=200;
		System.out.println(c1.toString());// Prints value i=100, j=200
		System.out.println("===========");

		System.out.println(new C());// Prints value i=100,j=200
		System.out.println(new OverrideToStringMethod());// Prints address
	}
}
