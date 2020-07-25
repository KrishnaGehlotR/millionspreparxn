package org.dev.controlstatements;

public class ForLoopPrintAlpha {

	public static void main(String[] args) {

		int j = 'A';
		System.out.println(j);

		char ch = 'A';
		System.out.println(ch);

		ch = 65;
		System.out.println(ch);
		System.out.println(++ch);

		System.out.println(ch + 1);// This is not same as ch++

		for (int i = 'A'; i <= 'Z'; i++) {
			System.out.println(i);
		}
		System.out.println();

		for (char ch1 = 65; ch1 <= 90; ch1++) {
			System.out.println(ch1);
		}
		System.out.println();

		for (char ch2 = 'Z'; ch2 >= 'A'; ch2--) {
			System.out.println(ch2);
		}
	}
}
