package org.dev.arraytype;

public class JaggedArray {

	public static void main(String[] args) {

		int[][] arr1 = { { 3, 5, 7, 9 }, { 4, 2 }, { 5, 7, 8, 9 }, { 6 } };

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("===================");

		for (int sa[] : arr1) {
			for (int i : sa) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
}
