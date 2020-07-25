package org.dev.typecasting;

interface IDemo09 {
	void test1();
}

interface IDemo10 extends IDemo09 {

	void test2();
}

class K implements IDemo09, IDemo10 {

	@Override
	public void test1() {
		System.out.println("test1() implemented in class K");
	}

	@Override
	public void test2() {
		System.out.println("test2() implemented in class K");
	}

	void print() {
		System.out.println("print() of class K");
	}
}

public class InterfaceClassUpDownCasting {

	public static void main(String[] args) {

		K k1 = new K();
		k1.test1();
		k1.test2();
		System.out.println("==============================");

		((IDemo10) k1).test1();
		((IDemo10) k1).test2();
//		((IDemo10) k1).print();
		System.out.println("==============================");

		((IDemo09) k1).test1();
//		((IDemo09) k1).test2();
//		((IDemo09) k1).print();
		System.out.println("==============================");

		IDemo09 id9 = new K();
		id9.test1();
//		id9.test2();// Not possible

		((IDemo10) id9).test1();
		((IDemo10) id9).test2();
		System.out.println("==============================");

		IDemo10 id10 = new K();
		id10.test1();
		id10.test2();
		((IDemo09) id10).test1();
//		((IDemo09) id10).test2();// Not possible
		System.out.println("==============================");

		((K) id10).test1();
		((K) id10).test2();
		((K) id10).print();
		System.out.println("==============================");

//		Very long casting
		((IDemo09) (IDemo10) (K) (IDemo09) (K) id9).test1();
	}
}
