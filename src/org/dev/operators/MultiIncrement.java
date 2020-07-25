package org.dev.operators;

public class MultiIncrement {

	public static void main(String[] args) {

		int i = 0, j = 0;
		j = i + i++ + i + i++;

		System.out.println("i=" + i);
		System.out.println("j=" + j);

		int k = 0, l = 0;

		k = ++l;
		System.out.println("k=" + k);
		System.out.println("l=" + l);
	}
}
