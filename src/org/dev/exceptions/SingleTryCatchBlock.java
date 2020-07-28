package org.dev.exceptions;

public class SingleTryCatchBlock {

	public static void main(String[] args) {

		int i = 10;
//		int j;

		try {
			System.out.println("Inside the block");
//			j = i / 0;

			int k = Integer.parseInt("test");
			System.out.println("k=" + k);

		} catch (NumberFormatException nfe) {
			System.out.println("Inside NumberFormatException block");
			nfe.printStackTrace();
		} catch (ArithmeticException ae) {
			System.out.println("Inside ArithmeticException block");
			ae.printStackTrace();
		}
		System.out.println("i=" + i);
	}
}
