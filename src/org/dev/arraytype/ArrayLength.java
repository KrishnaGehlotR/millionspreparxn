package org.dev.arraytype;

public class ArrayLength {

	public static void main(String[] args) {

		int arr[][] = new int[4][3];
		System.out.println(arr.length);// Gives number of rows
		System.out.println(arr[0].length);// Column of row 1
		System.out.println(arr[1].length);// Column of row 2
		System.out.println(arr[2].length);// Column of row 3
		System.out.println(arr[3].length);// Column of row 4
	}
}
