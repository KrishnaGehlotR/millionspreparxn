package org.dev.methodoverloading;

public class MethodOverloading {

	void print() {
		System.out.println("Print() method (no arg)");
	}

	String print(int i) {
		System.out.println("Print() method (one arg)");
		return "success";
	}

	String print(int i, int j) {
		System.out.println("Print() method (two arg)");
		return "success";
	}

	String print(long l, long m) {
		System.out.println("Print() method (two arg)");
		return "success";
	}

	String print(String s, int i) {
		System.out.println("Print() method (two arg)");
		return "success";
	}

	String print(int i, String s) {
		System.out.println("Print() method (two arg)");
		return "success";
	}

	public static void main(String[] args) {

		String res;

		MethodOverloading mo = new MethodOverloading();
		mo.print();

		res = mo.print(555);
		System.out.println(res);

		res = mo.print(123, 456);
		System.out.println(res);

		res = mo.print(100l, 200l);
		System.out.println(res);

		res = mo.print(10, "Hello");
		System.out.println(res);

		res = mo.print("Hello", 10);
		System.out.println(res);
	}
}
