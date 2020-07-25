package org.dev.packages;

public class A {

	int i;

	public void print() {
		System.out.println("i= " + i);
	}

	public static void main(String[] args) {

		System.out.println("Class A of package org.dev.packages");
		new A().print();
	}
}
