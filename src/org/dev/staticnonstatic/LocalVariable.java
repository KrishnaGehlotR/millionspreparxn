package org.dev.staticnonstatic;

public class LocalVariable {

	int i;

	public static void main(String[] args) {

		LocalVariable lv1 = new LocalVariable();
		lv1.i = 10;
		System.out.println(lv1.i);

		LocalVariable lv2 = new LocalVariable();
		lv2.i = 20;
		System.out.println(lv2.i);
	}
}
