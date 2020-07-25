package org.dev.abstractions;

abstract class E {

	abstract void test1();

	abstract public void test2();

	// abstract private void test3(); Private methods are not inherited
	// No question of overriding

	abstract protected void test3();
}

class F extends E {

	@Override
	void test1() {
		System.out.println("test1() of implemented in class F");

	}

	@Override
	public void test2() {
		System.out.println("test2() of implemented in class F");

	}

	@Override
	protected void test3() {
		System.out.println("test3() of implemented in class F");
	}

	// This private non-static method belongs to class B and not inherited from A
	@SuppressWarnings("unused")
	private void test4() {
		System.out.println("test4() implemented in class F");
	}

}

public class DifferentAccessSpecifiers {

	public static void main(String[] args) {
		F f1 = new F();
		f1.test1();
		f1.test2();
		f1.test3();
	}
}
