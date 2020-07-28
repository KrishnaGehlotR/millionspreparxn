package org.dev.exceptions;

public class TryFinallyBlock {

	public static void main(String[] args) {

		int i = 10;
		int j = 0;

		try {

			System.out.println("Inside try block");
			j = i / 0;
			System.out.println("j=" + j);
			System.out.println("Existing try block");

		} catch (ArithmeticException ae) {
			System.out.println("Inside catch block");
			ae.printStackTrace();
		} finally {
			System.out.println("Inside finally block");
		}

		System.out.println("i=" + i);
	}
}
