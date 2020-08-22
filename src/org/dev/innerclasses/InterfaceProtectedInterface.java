package org.dev.innerclasses;

interface Test4 {

	// The interface member type can only be public
	/* protected */ public interface Yes {
		void show();
	}
}

class Testing4 implements Test4.Yes {

	@Override
	public void show() {
		System.out.println("Show method implemented in Testing4 class");
	}
}

public class InterfaceProtectedInterface {

	public static void main(String[] args) {

		Test4.Yes ty4 = new Testing4();
		ty4.show();
	}
}
