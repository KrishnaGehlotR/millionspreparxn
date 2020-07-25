package org.dev.operators;

public class ConditionalOperator {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		int x = 10;
		int y = x > 12 ? 100 : 200;// 200
		System.out.println(y);

		char ch = 12.34 == 12.3 ? 'A' : 'B';// B
		System.out.println(ch);

		int marks = 55;
		String res = marks > 50 ? "Pass" : "Fail";
		System.out.println(res);
	}
}
