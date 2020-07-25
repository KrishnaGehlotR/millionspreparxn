package org.dev.operators;

public class ArithmaticOperator {

	public static void main(String[] args) {

		int i = 30, j = 20;
		int k = i + j;
		System.out.println("Sum of " + i + " and " + j + " is " + k);

		k = i - j;
		System.out.println("Diff of " + i + " and " + j + " is " + k);

		k = i * j;
		System.out.println("Product of " + i + " and " + j + " is " + k);

		k = i / j;
		System.out.println("Quotient of " + i + " and " + j + " is " + k);

		k = i % j;
		System.out.println("Remainder of " + i + " and " + j + " is " + k);

		++i;
		System.out.println("Pre-increment of " + i);

		--i;
		System.out.println("Pre-decrement of " + i);

		i++;
		System.out.println("Post-increment of " + i);

		i--;
		System.out.println("Post-decrement of " + i);
	}
}
