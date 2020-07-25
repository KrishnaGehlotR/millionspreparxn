package org.dev.methods;

public class StaticPrimitiveMethods {

	public static void main(String[] args) {
		print();
		disp();

		int sum = add(100, 200);
		System.out.println(sum);
		System.out.println(add(111, 222));
		System.out.println(add(123, 456));
		System.out.println(add(add(111, 222), add(333, 444)));

		double sum1 = add(23.4, 32.1);
		System.out.println(sum1);

		String stmt = wish("Krishna");
		System.out.println(stmt);

	}

	// static method void return type
	static void print() {
		System.out.println("Hello All");
	}

	// static method void return type
	static void disp() {
		System.out.println("My name is Krishna");
		return;// return statement
	}

	// static method int return type with 2 arguments
	static int add(int n1, int n2) {
		int total = n1 + n2;// Addition of variable
		return total;// return int value
	}

	// static method double return type with 2 arguments
	static double add(double d1, double d2) {
		double total = d1 + d2;
		return total;// return double value
	}

	// static method String return type with 1 argument
	static String wish(String name) {
		return "Hello " + name + " Happy New Year";// return String
	}
}
