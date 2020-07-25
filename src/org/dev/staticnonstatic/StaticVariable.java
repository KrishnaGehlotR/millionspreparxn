package org.dev.staticnonstatic;

public class StaticVariable {

	static int i = 20;

	public static void main(String[] args) {

		StaticVariable.test();

	}

	static void test() {
		System.out.println("i= " + StaticVariable.i);
	}
}
