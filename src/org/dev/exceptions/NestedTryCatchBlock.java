package org.dev.exceptions;

public class NestedTryCatchBlock {

	public static void main(String[] args) {

		int i = 10;
		int j;

		try {
			System.out.println("Inside outer try block");

			try {

				System.out.println("Inside inner try block");
				int k = Integer.parseInt("test");
				System.out.println("k=" + k);

			} catch (NumberFormatException nfe) {
				System.out.println("Inside inner catch block");
				nfe.printStackTrace();
			}

			System.out.println("Back to outer try block");
			j = i / 0;
			System.out.println("j=" + j);

		} catch (Exception e) {
			System.out.println("Inside outer catch block");
			e.printStackTrace();
		}
	}
}
