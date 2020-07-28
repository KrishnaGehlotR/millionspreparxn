package org.dev.exceptions;

public class MultipleTryCatchBlock {

	public static void main(String[] args) {

		int i = 10;
		int j;

		try {
			System.out.println("Inside ArithmeticException try block");
			j = i / 0;// Exception is thrown
			System.out.println("j=" + j);

		} catch (ArithmeticException ae) {
			System.out.println("Inside ArithmeticException catch block");
			ae.printStackTrace();
		}

		try {
			System.out.println("Inside NumberFormatException try block");
			int k = Integer.parseInt("test");// This statement will not get executed
			System.out.println("k=" + k);

		} catch (NumberFormatException nfe) {
			System.out.println("Inside NumberFormatException catch block");
			nfe.printStackTrace();
		}

		System.out.println("i=" + i);
	}
}
