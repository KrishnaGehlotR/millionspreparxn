package org.dev.innerclasses;

import org.dev.innerclasses.N.O;

interface AA {
	public void test();
}

class N {

	class O implements AA {

		@Override
		public void test() {
			System.out.println("test() method implemented in O inner class");
		}

	}
}

public class InnerClassImplementInterface {

	public static void main(String[] args) {

		N n1 = new N();
		O o1 = n1.new O();
		o1.test();
	}
}
