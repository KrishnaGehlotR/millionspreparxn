package org.dev.lamdaExpresxn;

interface Addable2 {
	int add(int a, int b);
}

public class LambdaExpWitOrWiotReturn {

	public static void main(String[] args) {

		// Lambda expression without return keyword.
		Addable2 a2 = (a, b) -> (a + b);
		System.out.println(a2.add(125, 175));

		// Lambda expression with return keyword.
		Addable2 ad2 = (a, b) -> {
			return (a + b);
		};
		System.out.println(ad2.add(25, 75));
	}
}
