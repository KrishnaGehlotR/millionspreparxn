package org.dev.jumpstatements;

public class BreakLabeled {

	public static void main(String[] args) {
		int i, j;
		demo: for (i = 0; i <= 3; i++) {
			for (j = 2; j <= 4; j++) {
				if (i == j) {
					break demo;
				}
				System.out.print(i + "" + j + " ");
			}
			System.out.println();
		}
	}
}
