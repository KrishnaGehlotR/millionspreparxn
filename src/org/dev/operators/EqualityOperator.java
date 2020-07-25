package org.dev.operators;

public class EqualityOperator {

	public static void main(String[] args) {

		int x = 5, y = 8;

		System.out.println(x == y);// false
		System.out.println(x == 10);// false
		//System.out.println(10 == 10);// true

		Orange o1 = new Orange();
		System.out.println(o1);// Address

		Orange o2 = new Orange();
		System.out.println(o2);// Address

		System.out.println(o1 == o2);// false
		System.out.println(o1 != o2);// true
		// System.out.println(o1 >= o2);// Not possible, CTE Error
	}
}

class Orange {
}
