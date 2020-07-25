package org.dev.staticnonstatic;

public class NonStaticBlock {

	int i, j;

	public static void main(String[] args) {

		NonStaticBlock nsb1 = new NonStaticBlock();
		System.out.println(nsb1.i);
		System.out.println(nsb1.j);
		System.out.println("--------------");

		NonStaticBlock nsb2 = new NonStaticBlock();
		System.out.println(nsb2.i);
		System.out.println(nsb2.j);
		System.out.println("--------------");

		System.out.println(new NonStaticBlock().i);
		System.out.println(new NonStaticBlock().j);
		System.out.println("--------------");

		nsb2.i = 123;
		nsb2.j = 456;

		System.out.println(nsb1.i);
		System.out.println(nsb1.j);
		System.out.println("--------------");

		System.out.println(nsb2.i);
		System.out.println(nsb2.j);
	}

	{
		System.out.println("IIB1");
		i = 20;
		j = 30;
	}

	{
		System.out.println("IIB2");
		i = 200;
		j = 300;

		{
			i = 222;
			j = 333;
		}
	}
}
