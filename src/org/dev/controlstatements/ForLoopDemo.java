package org.dev.controlstatements;

public class ForLoopDemo {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			System.out.print(i);
		}
		System.out.println();
		System.out.println("----------------");

		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		System.out.println("----------------");

		for (int i = 10; i <= 100; i += 10) {
			System.out.println(i);
		}
		System.out.println("----------------");

		int j1 = 1;
		for (int i = 1; i <= 10; i++) {
			System.out.println(j1);
			j1 += 5;
		}
		System.out.println("----------------");

		for (int i = 1; i <= 20; i += 2) {
			System.out.println(i);
		}
		System.out.println("----------------");

		for (int i = 5; i <= 50; i += 5) {
			System.out.println(i);
		}
		System.out.println("----------------");

		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.println(i);
			}
			System.out.println();
		}
		System.out.println("----------------");

		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.println(j);
			}
			System.out.println();
		}
		System.out.println("----------------");

		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				for (int j = 1; j < 10; j++) {
					System.out.println(i);
				}
				System.out.println();
			} else {
				System.out.println();
			}
		}
		System.out.println("----------------");

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.println("*");
			}
			System.out.println();
		}
	}
}
