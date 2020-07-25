package org.dev.typecasting;

class G {

	final void test1() {
		System.out.println("test1() of class G");
	}

	static final void disp() {
		System.out.println("disp() of class G");
	}
}

class H extends G {

//	test1() in H cannot override test1() in G
//	void test1() {
//		System.out.println("test1() of class H");
//	}

//	disp() in H cannot override disp() in G
//	static void disp() {
//		System.out.println("disp() of class H");
//	}
}

public class FinalMethod {

	public static void main(String[] args) {
		new G().test1();
		G.disp();
	}
}
