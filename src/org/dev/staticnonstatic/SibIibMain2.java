package org.dev.staticnonstatic;

class SibIibMain1 {

}

public class SibIibMain2 {

	int i, j;
	String s1;
	SibIibMain1 sibIibMain1;

	static int x, y;
	static String s2;
	static SibIibMain1 sibIibMain2;

	SibIibMain2() {
		i = 100;
		j = 200;
		s1 = "Hello.Cons";
		sibIibMain1 = new SibIibMain1();
	}

	{
		i = 110;
		j = 220;
		s1 = "Hello.Iib";
		sibIibMain1 = new SibIibMain1();
	}

	static {
		x = 222;
		y = 333;
		s2 = "Bangalore";
		sibIibMain2 = new SibIibMain1();
	}

	public static void main(String[] args) {

		SibIibMain2 sibIibMain1 = new SibIibMain2();
		System.out.println(sibIibMain1.i);
		System.out.println(sibIibMain1.j);
		System.out.println(sibIibMain1.s1);
		System.out.println(sibIibMain1.sibIibMain1);
		System.out.println("------------------");

		SibIibMain2 sibIibMain2 = new SibIibMain2();
		System.out.println(sibIibMain2.i);
		System.out.println(sibIibMain2.j);
		System.out.println(sibIibMain2.s1);
		System.out.println(sibIibMain2.sibIibMain1);
		System.out.println("------------------");

		System.out.println(SibIibMain2.x);
		System.out.println(SibIibMain2.y);
		System.out.println(SibIibMain2.s2);
		System.out.println(SibIibMain2.sibIibMain2);
	}
}
