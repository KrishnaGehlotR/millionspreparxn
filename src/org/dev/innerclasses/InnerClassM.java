package org.dev.innerclasses;

public class InnerClassM {

	class M {

		int i;
		{
			int j = 20;
			System.out.println(j);
			System.out.println("from IIB");
		}

		M() {
			System.out.println("from Constructor");
		}
	}

	public static void main(String[] args) {

		InnerClassM icM = new InnerClassM();
		M m1 = icM.new M();
		System.out.println(m1.i);
	}
}
