package org.dev.innerclasses;

interface H {
	void test();
}

public class InnerStaticClassHI {

	static class I implements H {

		@Override
		public void test() {
			System.out.println("from interface test()");
		}
	}

	public static void main(String[] args) {

		I i1 = new I();
		i1.test();
	}
}
