package org.dev.modifiers.app1;

public class FinalKeyword {

	final static int i = 10;
	final int j = 100;

	public static void main(String[] args) {

		System.out.println(FinalKeyword.i);
//		FinalKeyword.i = 12;// Cannot reinitialize final variable
		FinalKeyword fk = new FinalKeyword();
		System.out.println(fk.j);
	}
}
