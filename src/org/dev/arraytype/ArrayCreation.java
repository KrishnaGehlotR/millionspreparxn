package org.dev.arraytype;

public class ArrayCreation {

	public static void main(String[] args) {

		// Syntax of array creation
		// Arraytype[] arrayName = new ArrayType[size];

		System.out.println("=====> Array of age");
		int[] age = new int[4];
		age[0] = 10;
		age[1] = 18;
		age[2] = 29;
		age[3] = 50;
		for (int i = 0; i < age.length; i++) {
			System.out.println(age[i]);
		}

		System.out.println("=====> Array of marks");
		int marks[] = new int[3];
		marks[2] = 59;
		marks[0] = 75;
		marks[1] = 69;
		for (int i = 0; i < marks.length; i++) {
			System.out.println(marks[i]);
		}

		System.out.println("=====> Array of scores");
		int scores[];
		scores = new int[5];
		scores[4] = 100;
		scores[3] = 99;
		scores[2] = 76;
		scores[1] = 50;
		scores[0] = 30;
		for (int i = 0; i < scores.length; i++) {
			System.out.println(scores[i]);
		}

		System.out.println("=====> Array of random numbers");
		int[] randNums = { 12, 345, 45, 234, 6, 7435 };
		for (int i = 0; i < randNums.length; i++) {
			System.out.println(randNums[i]);
		}

		System.out.println("=====> Array of prime numbers");
		int[] primeNums = new int[] { 1, 3, 5, 7, 11, 13, 19, 23 };
		for (int i = 0; i < primeNums.length; i++) {
			System.out.println(primeNums[i]);
		}
	}
}
