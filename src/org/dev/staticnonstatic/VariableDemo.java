package org.dev.staticnonstatic;

public class VariableDemo {

	static int a = 100;// static variable / class variable
	int b = 200;// non-static variable / instance variable

	public static void main(String[] args) {

		int i = 10;// local variable

		{
			// statement block
			int j = 20;// local variable
			System.out.println("j= " + j);
		}

		System.out.println("a= " + a);
		System.out.println("b= " + new VariableDemo().b);
		System.out.println("i= " + i);

	}
}
