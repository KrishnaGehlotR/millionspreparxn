package org.dev.staticnonstatic;

public class NonStaticVariable {

	int i = 100;

	public static void main(String[] args) {

		NonStaticVariable nsv = new NonStaticVariable();
		nsv.print();// i=100
		nsv.i = 200;// i=200
		nsv.print();// i=200

		System.out.println(nsv.i);
		System.out.println(new NonStaticVariable().i);

		new NonStaticVariable().i = 555;
		System.out.println(new NonStaticVariable().i);
	}

	void print() {
		System.out.println("i= " + i);
	}
}
