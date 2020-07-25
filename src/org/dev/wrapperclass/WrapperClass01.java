package org.dev.wrapperclass;

public class WrapperClass01 {

	public static void main(String[] args) {

		int i = 10;
		System.out.println(i);

		// Boxing operation
		Integer intObj1 = new Integer(i);
		System.out.println(intObj1);

		Integer intObj2 = new Integer(100);
		System.out.println(intObj2);

		Integer intObj3 = new Integer(200);
		System.out.println(intObj3);

		Integer intObj4 = 300;
		System.out.println(intObj4);
	}
}
