package org.dev.lamdaExpresxn;

interface Addable1 {
	int add(int a, int b);
}

public class LambdaExpMultiParam {

	public static void main(String[] args) {

		// Multiple parameters in lambda expression
		Addable1 a1 = (a, b) -> (a + b);
		System.out.println(a1.add(10, 15));

		// Multiple parameters with data type in lambda expression
		Addable1 a12 = (int a, int b) -> (a + b);
		System.out.println(a12.add(100, 155));
	}
}
