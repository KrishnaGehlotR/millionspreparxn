package org.dev.operators;

public class AssignmentOperator {

	public static void main(String[] args) {

		int i = 2, j = 3, k = 4, l = 25, m = 7;
		int a = 2, b = 3, c = 4, d = 25, e = 7;

		i += 5;
		System.out.println(i);

		j *= 6;
		System.out.println(j);

		k /= 2;
		System.out.println(k);

		l -= 10;
		System.out.println(l);

		m %= 5;
		System.out.println(m);

		System.out.println("------------------");
		a = a + 5;
		System.out.println(i);

		b = b * 6;
		System.out.println(j);

		c = c / 2;
		System.out.println(k);

		d = d - 10;
		System.out.println(l);

		e = e % 5;
		System.out.println(m);
	}
}
