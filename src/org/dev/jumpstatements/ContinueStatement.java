package org.dev.jumpstatements;

public class ContinueStatement {

	public static void main(String[] args) {

		for (int j = 0; j < 10; j += 2) {
			if (j == 6) {
				continue;
			}
			System.out.println(j);
		}
	}
}
