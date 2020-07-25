package org.dev.staticnonstatic;

public class StaticBlock {

	static int i = 10;

	static {
		i = 100;
		System.out.println(3);
	}

	public static void main(String[] args) {
		System.out.println(i);
	}

	static {
		i = 200;
		System.out.println(1);
	}

	static {
		i = 300;
		System.out.println(2);
	}
}
