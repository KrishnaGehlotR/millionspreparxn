package org.dev.innerclasses;

interface Test3 {

	interface Yes {
		void show();
	}
}

class Testing3 implements Test3.Yes {

	@Override
	public void show() {
		System.out.println("Show method implemented in Testing3 class");
	}

}

public class InterfaceDefaultInterface {

	public static void main(String[] args) {

		Test3.Yes ty3 = new Testing3();
		ty3.show();
	}
}
