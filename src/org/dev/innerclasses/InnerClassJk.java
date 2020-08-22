package org.dev.innerclasses;

// Inheritance between two inner class is possible
public class InnerClassJk {

	class J {
		int i = 10;
	}

	class K extends J {
		int j = 20;
	}

	public static void main(String[] args) {
		InnerClassJk icJk = new InnerClassJk();
		K k1 = icJk.new K();
		System.out.println(k1.i);
		System.out.println(k1.j);
	}
}
