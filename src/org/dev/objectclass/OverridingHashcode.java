package org.dev.objectclass;

class Strawberry {

	int wt;

	public Strawberry(int wt) {
		this.wt = wt;
	}

	public String toString() {
		return "wt=" + wt;
	}

	public boolean equals(Object obj) {

		if (obj == null)
			return false;

		if (this == obj)
			return true;

		if (this.wt == ((Strawberry) obj).wt)
			return true;
		return false;
	}

	public int hashCode() {
		return wt * 7 * 11 * 15;
	}
}

public class OverridingHashcode {

	public static void main(String[] args) {

		Strawberry sw1 = new Strawberry(100);
		Strawberry sw2 = new Strawberry(120);
		Strawberry sw3 = new Strawberry(100);

		System.out.println(sw1);
		System.out.println(sw2);
		System.out.println(sw3);

		System.out.println(sw1 == sw2);
		System.out.println(sw1.equals(sw2));

		System.out.println("===== Generate hashcode =====");
		System.out.println(sw1.hashCode());
		System.out.println(sw2.hashCode());
		System.out.println(sw3.hashCode());
	}
}
