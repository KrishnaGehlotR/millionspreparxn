package org.dev.typecasting;

abstract class AbDemo03 {

	static void paint() {
		System.out.println("Paint() of AbDemo03");
	}
}

class ConDemo03 extends AbDemo03 {

	static void paint() {
		System.out.println("Paint() of ConDemo03");
	}
}

public class StaticMethodUpcasting {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {

		AbDemo03 ab1 = new ConDemo03();
		ab1.paint();// Super class static method is called
		AbDemo03.paint();
	}
}
