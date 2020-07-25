package org.dev.staticnonstatic;

public class StaticBlankFinal {

	static final double PI;// Blank Final

	static {
		PI = 3.14;
	}

	public static void main(String[] args) {

		System.out.println(PI);
	}
}
