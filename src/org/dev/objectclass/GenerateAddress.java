package org.dev.objectclass;

class BlackBerry {

}

public class GenerateAddress {

	public static void main(String[] args) {
		BlackBerry b1 = new BlackBerry();
		System.out.println(b1);
		System.out.println(b1.getClass().getName() + "@" + Integer.toHexString(b1.hashCode()));
	}
}
