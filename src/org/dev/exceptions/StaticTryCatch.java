package org.dev.exceptions;

public class StaticTryCatch {

	static String test() {

		int i = 10;

		try {
			System.out.println("Inside try block");
			int j = i / 0;
			System.out.println("j=" + j);
		} catch (ArithmeticException ae) {
			System.out.println("Inside catch block");
		} finally {// To mandatory to execute block of code
			System.out.println("Inside finally block");
		}

		return "from outside";
	}

	public static void main(String[] args) {

		System.out.println("Main method starts");
		System.out.println(test());
		System.out.println("Main method ends");

	}
}
