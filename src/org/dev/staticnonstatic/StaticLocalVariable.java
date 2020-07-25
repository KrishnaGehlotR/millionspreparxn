package org.dev.staticnonstatic;

public class StaticLocalVariable {

	static int i = 10;

	public static void main(String[] args) {

		System.out.println("i= " + i);

		i = 20;
		System.out.println("i= " + i);

		i = 30;
		System.out.println("i= " + i);

		int i = 400;
		System.out.println("i= " + i);

		i = 500;
		System.out.println("i= " + i);

		System.out.println("i= " + StaticLocalVariable.i);

		StaticLocalVariable.i = 40;
		System.out.println("i= " + StaticLocalVariable.i);

		System.out.println("------------------");
		{
			// Statement block, for organizing code
			int j = 100;// local variable
			System.out.println("i= " + i);
			System.out.println("j= " + j);
		}
	}
}
