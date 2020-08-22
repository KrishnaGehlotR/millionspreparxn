package org.dev.innerclasses;

class Test2 {

	protected interface Yes {
		void show();
	}
}

class Testing2 implements Test2.Yes {

	@Override
	public void show() {
		System.out.println("Show method implemented in Testing2 class");
	}
}

public class ClassProtectedInterface {

	public static void main(String[] args) {

		Test2.Yes ty2 = new Testing2();
		ty2.show();
	}
}
