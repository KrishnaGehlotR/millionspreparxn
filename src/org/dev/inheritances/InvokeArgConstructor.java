package org.dev.inheritances;

class XX {

	XX(String s) {
		System.out.println(s);
	}
}

class YY extends XX {

	YY() {
		super("Fellow");
	}
}

public class InvokeArgConstructor {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		XX x1 = new XX("Hello");
		YY y1 = new YY();
	}
}
