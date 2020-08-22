package org.dev.lamdaExpresxn;

import java.util.ArrayList;

public class LambdaExpforEachLoop {

	public static void main(String[] args) {

		ArrayList<String> lst = new ArrayList<String>();
		lst.add("Ankit");
		lst.add("Mayank");
		lst.add("Irfan");
		lst.add("Jay");

		lst.forEach((n) -> System.out.println(n));
	}
}
