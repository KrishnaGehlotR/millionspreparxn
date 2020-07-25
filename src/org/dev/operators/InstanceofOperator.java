package org.dev.operators;

public class InstanceofOperator {

	static Orange o1;

	public static void main(String... krish) {

		System.out.println(o1 instanceof Orange);
		System.out.println(o1);

		o1 = new Orange();
		System.out.println(o1 instanceof Orange);
		System.out.println(o1);

		o1 = null;
		System.out.println(o1 instanceof Orange);
		System.out.println(o1);

		String str = new String("Hello");

		if (str instanceof String) {
			System.out.println("str is instanceof String class");
		}

		str = null;

		if (str instanceof String) {
		} else {
			System.out.println("str is not instanceof String class");
		}
	}
}
