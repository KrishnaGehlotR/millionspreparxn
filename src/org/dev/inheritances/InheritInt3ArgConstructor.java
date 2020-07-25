package org.dev.inheritances;

class G {

}

class H extends G {

	H(int a, int b, int c) {
		super();// This will be put by default
		// Since super class does not have a constructor
		// It will first create a default constructor in the super class and in sub
		// class uses super();
		System.out.println("a=" + a + ", b=" + b + ", c=" + c);
	}
}

public class InheritInt3ArgConstructor {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		G g1 = new G();
		H h1 = new H(100, 200, 300);
	}
}
