package org.dev.constructors;

class E {

	int i, j;
	long l;
	String a, b;

	E(int u, int v) {
		i = u;
		j = v;
	}

	E(int x, long y) {
		i = x;
		l = y;
	}

	E(String s, int p) {
		a = s;
		i = p;
	}

	E(int p, String s) {
		i = p;
		a = s;
	}
}

public class ContructorOverload {

	public static void main(String[] args) {

		E e1 = new E(100, 200);
		System.out.println(e1.i);
		System.out.println(e1.j);
		System.out.println("------------");

		E e2 = new E("Star", 20);
		System.out.println(e2.i);
		System.out.println(e2.a);
		System.out.println(e2.b);
		System.out.println(e2.j);
		System.out.println(e2.l);
		System.out.println("------------");

		E e3 = new E(20, "super");
		System.out.println(e3.i);
		System.out.println(e3.a);
		System.out.println(e3.b);
		System.out.println("------------");
	}
}
