package org.dev.innerclasses;

public class InnerClassHi {

	class H {
		int i = 10;
	}

	class I {	
		int j = 20;
	}

	public static void main(String[] args) {

		InnerClassHi icHi = new InnerClassHi();
		H h1 = icHi.new H();
		System.out.println(h1.i);

		I i1 = icHi.new I();
		System.out.println(i1.j);
	}
}
