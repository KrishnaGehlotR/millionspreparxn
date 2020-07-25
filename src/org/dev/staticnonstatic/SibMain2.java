package org.dev.staticnonstatic;

public class SibMain2 {

	static {
		System.out.println("SIB of SibMain2 class");
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		System.out.println("Main method starts");
		SibMain1 sibMain1 = new SibMain1();
		SibMain1 sibMain2 = new SibMain1();
		System.out.println("Main method ends");
	}
}

class SibMain1 {

	static {
		System.out.println("SIB of SibMain1 class");
	}

	{
		System.out.println("IIB of SibMain1 class");
	}
}
