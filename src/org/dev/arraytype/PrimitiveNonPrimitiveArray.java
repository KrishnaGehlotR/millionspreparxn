package org.dev.arraytype;

class Apple {

}

public class PrimitiveNonPrimitiveArray {

	public static void main(String[] args) {

		// Primitive array
		System.out.println("===> Primitive array");
		int arr[] = new int[5];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "]=" + arr[i]);
		}

		// Non primitive array
		System.out.println("===> Non primitive array");
		Apple apple[] = new Apple[5];
		for (int i = 0; i < apple.length; i++) {
			System.out.println("apple[" + i + "]=" + apple[i]);
		}
	}
}
