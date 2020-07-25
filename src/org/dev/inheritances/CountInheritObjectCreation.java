package org.dev.inheritances;

class J {

	static int cntr;

	J() {
		cntr++;
	}
}

class K extends J {

	static int cntr;

	K() {
		cntr++;
	}
}

public class CountInheritObjectCreation {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		J j1 = new J();
		new J();
		J J2 = new J();
		System.out.println("No of J class objects are " + J.cntr);

		K k1 = new K();
		new K();
		K k2 = new K();
		System.out.println("No of J class objects are " + J.cntr);
		System.out.println("No of K class objects are " + K.cntr);
	}
}
