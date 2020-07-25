package org.dev.jumpstatements;

public class Break2 {

	public static void main(String[] args) {

		for (int i = 0; i <= 3; i++) {
			for (int j = 2; j <= 4; j++) {

				if (i == j) {
					break;
				}
				System.out.print(i + "" + j + " ");
			}
			System.out.println();
		}
	}
}
