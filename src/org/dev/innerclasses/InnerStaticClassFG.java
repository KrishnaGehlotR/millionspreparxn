package org.dev.innerclasses;

public class InnerStaticClassFG {

	static class F {
		int i = 80;
	}

	static class G extends F {
		int j = 90;
	}

	public static void main(String[] args) {

		G g1 = new G();
		System.out.println(g1.i);
		System.out.println(g1.j);
	}
}
