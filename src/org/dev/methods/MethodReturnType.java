package org.dev.methods;

public class MethodReturnType {

	public static void main(String[] args) {
		print();// does not print anything

		byte b = print1();
		System.out.println(b);

		int n = print2();
		System.out.println(n);

		char ch = print3();
		System.out.println(ch);

		boolean status = isMarried();
		System.out.println(status);

		String str = wish("Krishna");
		System.out.println(str);

		Orange o1 = getOrange();
		System.out.println(o1);

		Apple a1 = getApple();
		System.out.println(a1);

		int[] marks = getMarks();
		for (int i = 0; i < marks.length; i++) {
			System.out.println(marks[i]);
		}

		Orange[] oranges = getOranges();
		for (Orange orange : oranges) {
			System.out.println(orange);
		}
	}

	// Method does not return anything
	static void print() {
		return;// return is optional
	}

	// static primitive byte type return method
	static byte print1() {
		byte b = 25;
		return b;// return byte value
	}

	// static primitive int type return method
	static int print2() {
		int i = 100;
		return i;// return int value
	}

	// static primitive char return method
	static char print3() {
		return 'A';// return char value
	}

	// static primitive boolean return method
	static boolean isMarried() {
		boolean status = false;
		return status;// return boolean value
	}

	// static non-primitive String return method
	static String wish(String name) {
		return "Hello " + name;// return non-primitive String value
	}

	// static non-primitive return method
	static Orange getOrange() {
		return new Orange();// return object
	}

	// static non-primitive return method
	static Apple getApple() {
		Apple a1 = new Apple();
		return a1;// return object
	}

	// static array primitive type
	static int[] getMarks() {
		int[] marks = { 70, 80, 90, 60, 30 };// array declaration
		return marks;// return array value
	}

	// static array non-primitive type
	static Orange[] getOranges() {
		Orange o1 = new Orange();
		Orange orgs[] = { new Orange(), new Orange(), o1 };
		return orgs;// return array type
	}
}

class Orange {

}

class Apple {

}
