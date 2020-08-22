package org.dev.innerclasses;

public class InnerStaticClassJK {

	class J {
		int i = 100;
	}

	// No enclosing instance of type InnerStaticClassJK is available due to some
	// intermediate constructor invocation
	static class K /* extends J */ {

	}

	public static void main(String[] args) {

		K k1 = new K();
		// System.out.println(k1.i);
		System.out.println(k1);
	}
}
