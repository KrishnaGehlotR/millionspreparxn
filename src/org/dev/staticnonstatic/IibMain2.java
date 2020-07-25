package org.dev.staticnonstatic;

public class IibMain2 {

	public static void main(String[] args) {

		IibMain1 iibMain1 = new IibMain1();
		int k = iibMain1.getIVal(500);
		System.out.println(k);
		System.out.println(iibMain1.getJVal(1000));
	}
}

class IibMain1 {

	int i, j;

	int getIVal(int a) {
		i = a;
		return i;
	}

	int getJVal(int b) {
		return j = b;
	}
}
