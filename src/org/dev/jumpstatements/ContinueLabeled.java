package org.dev.jumpstatements;

public class ContinueLabeled {

	public static void main(String[] args) {

		int j, k;
		demo: for (j = 0; j < 5; j++) {
			for (k = 2; k < 5; k++) {
				if (j == k) {
					continue demo;
				}
				System.out.println(j + "" + k + " " + "j= " + j + "k= " + k);
			}
		}
	}
}
