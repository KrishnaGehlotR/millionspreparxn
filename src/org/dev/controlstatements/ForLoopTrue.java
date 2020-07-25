package org.dev.controlstatements;

public class ForLoopTrue {

	public static void main(String[] args) {

		int i = 1;

		for (; true;) {
			System.out.println(i);
			++i;

			if (i == 10)
				break;
		}
	}
}
