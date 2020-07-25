package org.dev.operators;

public class PostIncrement {

	public static void main(String[] args) {

		int i = 0;
		int j;
		j = i++;// Use first the current value and then increment

		System.out.println("i= " + i);// 1
		System.out.println("j= " + j);// 0
	}
}
