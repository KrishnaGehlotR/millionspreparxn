package org.dev.operators;

public class IncrementDecrement {

	public static void main(String[] args) {

		int i = 0, j = 1;
		int k = (i) + (j++) + (++i) + (++j) + (i++);

		System.out.println("i=" + i);
		System.out.println("j=" + j);
		System.out.println("k=" + k);
	}
}
