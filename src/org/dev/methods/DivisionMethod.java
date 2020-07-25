package org.dev.methods;

public class DivisionMethod {

	public static void main(String[] args) {
		int quotient = getQuotient(60, 5);
		System.out.println(quotient);
	}

	public static int getQuotient(int num1, int num2) {
		int quotient = num1 / num2;
		return quotient;
	}
}
