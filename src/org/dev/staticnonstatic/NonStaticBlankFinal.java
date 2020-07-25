package org.dev.staticnonstatic;

public class NonStaticBlankFinal {

	final double PI;// Blank Final

	{
		PI = 3.14;
	}

	public static void main(String[] args) {
		System.out.println(new NonStaticBlankFinal().PI);
	}
}
