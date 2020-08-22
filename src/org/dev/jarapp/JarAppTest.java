package org.dev.jarapp;

class Boy {

	void drink() {
		System.out.println("Akash is drinking coffee");
	}
}

public class JarAppTest {

	public static void main(String[] args) {

		Boy boy = new Boy();
		boy.drink();
	}
}
