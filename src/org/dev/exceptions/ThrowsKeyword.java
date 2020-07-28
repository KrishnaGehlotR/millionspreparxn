package org.dev.exceptions;

public class ThrowsKeyword {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) throws ClassNotFoundException {

		Class c1 = Class.forName("org.dev.exceptions.ThrowsKeyword");
		System.out.println(c1);
	}
}
