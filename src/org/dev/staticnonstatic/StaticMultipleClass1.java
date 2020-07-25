package org.dev.staticnonstatic;

public class StaticMultipleClass1 {

	static int i = 10;

	static {
		System.out.println(i);
		print();
		i = 555;
	}

	public static void main(String[] args) {
		System.out.println(StaticMultipleClass1.i);
		System.out.println(StaticMultipleClass2.j);
	}

	static {
		i = 666;
	}

	static void print() {
		System.out.println("Hello");
	}
}

class StaticMultipleClass2 {

	static int j = 100;

	static {
		j = 1234;
	}
}
