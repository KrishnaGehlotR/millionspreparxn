package org.dev.typecasting;

class D {

	void test1() {
		System.out.println("test1() of class D");
	}
}

class E extends D {

	void test2() {
		System.out.println("test2() of class E");
	}
}

class F extends E {

	void test3() {
		System.out.println("test3() of class F");
	}
}

public class DEFDemo {

	public static void main(String[] args) {

		D d1 = new E();
		d1.test1();
//		 d1.test2();// Can't access its own class members because of up casting
		System.out.println("-------------");

//		D d2 = new D();
//		E e1 = (E) d2;// Class Cast Exception since it is not upcasted before downcasted.
//		E e2 = (E) new D();// Class Cast Exception same reason
		E e3 = (E) d1;// Downcasted of an upcasted object
		e3.test1();
		e3.test2();
	}
}
