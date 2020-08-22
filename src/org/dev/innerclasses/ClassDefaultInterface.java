package org.dev.innerclasses;

class Test1 {

	interface Yes {
		void show();
	}
}

class Testing1 implements Test1.Yes {

	@Override
	public void show() {
		System.out.println("Show method implemented in Testing1 class");
	}

}

public class ClassDefaultInterface {

	public static void main(String[] args) {

		Test1.Yes ty1;
		ty1 = new Testing1();
		ty1.show();
	}
}
