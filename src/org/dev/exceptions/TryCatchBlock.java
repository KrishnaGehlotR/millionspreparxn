package org.dev.exceptions;

public class TryCatchBlock {

	public static void main(String[] args) {

		int i = 10;
		int j = 0;

		try {

			System.out.println("Inside try block");
			j = i / 0;
			System.out.println("Existing try block");

		} catch (ArithmeticException e) {
			System.out.println("Inside catch block");
			e.printStackTrace();
		}
		System.out.println("j=" + j);
	}
}
