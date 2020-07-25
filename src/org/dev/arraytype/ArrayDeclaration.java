package org.dev.arraytype;

class Orange {

}

public class ArrayDeclaration {

	public static void main(String[] args) {

		int arr1[] = new int[3];
		arr1[0] = 10;

		for (int i : arr1) {
			System.out.println(i);
		}
		System.out.println("=============");

		String arr2[] = new String[3];
		arr2[0] = "Hello";

		for (String a : arr2) {
			System.out.println(a);
		}
		System.out.println("=============");

		// Apple array
		Orange[] o1 = new Orange[3];

		// Apple object referred by a reference variable
		Orange o2 = new Orange();

		o1[0] = new Orange();// Assigning Apple object
		o1[1] = o2;// Assigning Apple reference variable

		for (Orange o3 : o1) {
			System.out.println(o3);
		}
	}
}
