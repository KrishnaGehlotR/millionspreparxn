package org.dev.innerclasses;

// Inheriting static Inner class members into Local Inner class is possible
public class InnerStaticClassLM {

	static class L {
		static int j = 60;
		int i = 70;
	}

	class M extends L {

	}

	public static void main(String[] args) {
		InnerStaticClassLM iscLm = new InnerStaticClassLM();

		M m1 = iscLm.new M();
		System.out.println(m1.i);
		System.out.println(M.j);
		;
	}
}
