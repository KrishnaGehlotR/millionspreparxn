package org.dev.objectclass;

class Apple {

	int wt;

	Apple(int wt) {
		this.wt = wt;
	}

	public boolean equals(Object obj) {

		if (obj == null)
			return false;

		if (this == obj)
			return true;

		if (obj instanceof Apple) {
			if (this.wt == ((Apple) obj).wt)
				return true;
		}
		return false;
	}
}

public class OverrideEqualsMethod {

	public static void main(String[] args) {

		Apple a1 = new Apple(100);
		Apple a2 = new Apple(200);
		Apple a3 = new Apple(100);

		System.out.println(a1 == a2);
		System.out.println(a1 == a3);
	}
}
