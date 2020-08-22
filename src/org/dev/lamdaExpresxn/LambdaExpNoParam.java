package org.dev.lamdaExpresxn;

interface Sayable1 {
	public String say();
}

public class LambdaExpNoParam {

	public static void main(String[] args) {

		Sayable1 s = () -> {
			return "I am trying lambda expression with no param arg";
		};

		System.out.println(s.say());
	}
}
