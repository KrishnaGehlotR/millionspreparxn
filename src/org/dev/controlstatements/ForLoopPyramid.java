package org.dev.controlstatements;

public class ForLoopPyramid {

	public static void main(String[] args) {

		int cntr = 1;
		int space = 4;

		for (int i = 1; i <= 4; i++) {

			for (int k = space - i; k >= 1; k--) {
				System.out.print(" ");
			}

			for (int j = 1; j <= i; j++) {
				System.out.print(cntr++ + " ");
			}
			System.out.println();
		}
	}
}
