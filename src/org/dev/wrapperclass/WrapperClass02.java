package org.dev.wrapperclass;

public class WrapperClass02 {

	public static void main(String[] args) {

		int i = 100;
		Integer intObj1 = new Integer(i);// Boxing operation
		System.out.println(intObj1);

		int j = intObj1.intValue();// Unboxing operation
		System.out.println(j);
	}
}
