package org.dev.lamdaExpresxn;

interface Sayable2 {
	public String say(String name);
}

public class LambdaExpSingleParam {

	public static void main(String[] args) {

		// Lambda expression with single parameter
		Sayable2 s2 = (name) -> {
			return "Hello, " + name;
		};
		System.out.println(s2.say("Krishna"));

		// We can omit function parentheses
		Sayable2 s21 = name -> {
			return "Hello, " + name;
		};
		System.out.println(s21.say("Gehlot"));
	}
}
