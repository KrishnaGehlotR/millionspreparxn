package org.dev.abstractions;

abstract class G {

	int i;

	// We can have constructor for an abstract class
	G(int i) {
		System.out.println("Hello");
		this.i = i;
	}
}

class H extends G {

	H() {
		super(100);
	}
}

public class AbstractClassConstructor {

	public static void main(String[] args) {

		H h1 = new H();
		System.out.println(h1.i);
	}
}
