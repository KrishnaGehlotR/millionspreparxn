package org.dev.exceptions;

public class ChainedException {

	public static void main(String[] args) {

		try {

			String[] str = { "Hello" };
			System.out.println(str[5]);

		} catch (RuntimeException re) {
			System.out.println(re.getClass());
			System.out.println(re.getClass());
		}
	}
}
