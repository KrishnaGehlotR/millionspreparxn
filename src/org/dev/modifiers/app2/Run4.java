package org.dev.modifiers.app2;

import org.dev.modifiers.app1.F;

public class Run4 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		F f1 = new F();
		// f1.print();// Protected member can't be accessed
		// f1.i = 200;// without inheritance from other package
		// f1.print();
	}
}
