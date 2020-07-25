package org.dev.modifiers.app2;

import org.dev.modifiers.app1.F;

public class Run5 extends F {

	public static void main(String[] args) {

		Run5 r1 = new Run5();
		r1.print();// print() and i are protected members of
		r1.i = 200;// class F can be accessed only through
		r1.print();// inheritance, becomes private to this class
	}
}
