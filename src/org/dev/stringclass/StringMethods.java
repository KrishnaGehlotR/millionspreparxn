package org.dev.stringclass;

public class StringMethods {

	public static void main(String[] args) {

		String s1 = "Hello";// Constant pool
		System.out.println("s1.length()=" + s1.length());// 5
		System.out.println("s1.concat(\"Hello\")=" + s1.concat("Hello"));// concat() / Hello Hello
		System.out.println(s1);

		String s2 = new String();
		System.out.println("s2.isEmpty()=" + s2.isEmpty());
		s2 = s2.concat("Bangalore");
		System.out.println("s2=" + s2);

		System.out.println("new String(\"Hello\").equals(\"Hello\")=" + new String("Hello").equals("Hello"));
		System.out.println("\"Hello\".equals(\"Hello\")=" + "Hello".equals("Hello"));

		s1 = "Hello";// Constant pool
		s2 = "Hello";// Constant pool
		System.out.println("s1.equals(s2)=" + s1.equals(s2));
		System.out.println("s1.equals(\"Hello\")=" + s1.equals("Hello"));
		System.out.println("s1.equals(new String(\"Hello\"))=" + s1.equals(new String("Hello")));
		System.out.println("s1.equals(s1)=" + s1.equals(s1));
		System.out.println("s1.equals(null)=" + s1.equals(null));
		System.out.println("\"Hello\".equals(\"Hello\")=" + "Hello".equals("Hello"));
		System.out.println("new String(\"Hello\").equals(new String(\"Hello\"))="
				+ new String("Hello").equals(new String("Hello")));
		System.out.println("new String(\"Hello\").equals(\"Hello\")=" + new String("Hello").equals("Hello"));

		// Contains Method
		System.out.println("s1.equalsIgnoreCase(\"Hello\")=" + s1.equalsIgnoreCase("Hello"));
		System.out.println("s1.equals(\"Hello\")=" + s1.equals("Hello"));
		System.out.println("s1.indexOf('l')=" + s1.indexOf('l'));

		s1 = "I Love and Java and Selenium";
		System.out.println("s1.indexOf(\"and\")=" + s1.indexOf("and"));
		System.out.println("s1.indexOf(\"and\", 9)=" + s1.indexOf("and", 9));
		System.out.println("s1.indexOf(\"e\")=" + s1.indexOf("e"));
		System.out.println("s1.lastIndexOf(\"e\")=" + s1.lastIndexOf("e"));

		System.out.println("s1.equalsIgnoreCase(\"Hello\")=" + s1.equalsIgnoreCase("Hello"));
		System.out.println("s1.indexOf('D')=" + s1.indexOf('D'));
		System.out.println("s1.indexOf(\"Dev\")=" + s1.indexOf("Dev"));
		System.out.println("s1.indexOf('Z')=" + s1.indexOf('Z'));
		System.out.println("s1.lastIndexOf('e')=" + s1.lastIndexOf('e'));
		System.out.println("s1.indexOf('e', 0)=" + s1.indexOf('e', 0));
		System.out.println("s1.indexOf('e', 6)=" + s1.indexOf('e', 6));
		System.out.println("s1.indexOf('e', 8)=" + s1.indexOf('e', 8));

		// Replace all occurrences
		int i = 0;
		s1 = "Selenium";

		while (s1.indexOf("e", i) != -1) {
			int index = s1.indexOf("e", i);
			System.out.println("At index=" + index);
			i = index + 1;
		}

		char ch1 = s1.charAt(0);
		System.out.println("ch1=" + ch1);

		char ch2 = s1.charAt(s1.length() - 1);
		System.out.println("ch2=" + ch2);

		System.out.println("s1.replace('e', '&')=" + s1.replace('e', '&'));
		System.out.println("s1.replace(\"e\", \"E\")=" + s1.replace("e", "E"));
		System.out.println("s1.replaceAll(\"l\", \"L\")=" + s1.replaceAll("l", "L"));
		System.out.println("s1.charAt(0)=" + s1.charAt(0));
		System.out.println("s1.charAt(s1.length()-1)=" + s1.charAt(s1.length() - 1));
		char ch3 = s1.charAt(1);
		System.out.println("ch3=" + ch3);

		String s3 = "Krishna";// Constant Pool
		String s4 = new String("Hello");// Non Constant Pool
		System.out.println("s3=" + s3);
		System.out.println("s4=" + s4);
		char ch4 = s1.charAt(s1.length() - 1);
		System.out.println("ch4=" + ch4);
		System.out.println(s1.replaceAll("Selen", "Hindal"));

		// Compare methods
		System.out.println("ACZ".compareTo("ABZ"));
		System.out.println(s1.endsWith("per"));
		System.out.println(s1.startsWith("Java"));
		System.out.println("DA".compareTo("CA"));
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println("Sum of 4 and 5 is " + 4 + 5);
		System.out.println("Sum of 4 and 5 is " + (4 + 5));
		System.out.println(4 + 5 + " is the sum of 4 and 5");

		s1 = "JackAndJill";
		for (int i1 = 0; i1 < s1.length(); i1++) {
			System.out.println(s1.charAt(i1));
		}
		System.out.println("---------************");

		for (int i2 = s1.length() - 1; i2 >= 0; i2--) {
			System.out.println(s1.charAt(i2));
		}
		System.out.println("---------************");

		String s5 = "JackAndJill";
		char[] arr = s5.toCharArray();
		for (int i3 = 0; i3 < s5.length(); i3++) {
			// Print char in array
			System.out.print(arr[i] + "\t");

			// Print the unicode value of the char
			System.out.print((int) arr[i] + "\t");

			// Print the next char of the present char
			// if A print B, if J print K - 2 ways
			System.out.print((char) (arr[i] + 1) + "\t");
			System.out.println(++arr[i]);
		}

		System.out.println("============-----------============");
		String s6 = "KRISHNA";
		char ch5;

		for (int i1 = 0; i1 < s6.length(); i1++) {
			System.out.println(s6.charAt(i) + "\t" + (int) s6.charAt(i) + "\t" + (char) ((int) s6.charAt(i) + 1) + "\t"
					+ "" + (ch5 = s6.charAt(i)) + "\t" + ++ch5);
		}

		System.out.println("new String(\"Hello\").length()=" + new String("Hello").length());
		System.out.println("\"Bangalore\".length()" + "Bangalore".length());

		String s7 = "Hello";
		System.out.println("s7.length()=" + s7.length());
		s7 = s7.trim();
		System.out.println("s7.trim()=" + s7);
		System.out.println("s7.length()=" + s7.length());

		// Alternate way
		System.out.println("s7.trim().length()=" + s7.trim().length());
		System.out.println("s1.substring(4)=" + s1.substring(4));
		System.out.println("s1.substring(4, s1.length())=" + s1.substring(4, s1.length()));
		System.out.println("s1.substring(4, 11)=" + s1.substring(4, 11));

		String s8 = "This is java class";
		String arr1[] = s8.split(" ");

		for (int i1 = arr1.length - 1; i1 >= 0; i1--) {
			System.out.println(arr1[i1] + " ");
		}

	}
}
