package org.dev.stringclass;

public class StringbufferClass {

	public static void main(String[] args) {

		StringBuffer sb1 = new StringBuffer("Fellow");
		System.out.println("sb1=" + sb1);
		System.out.println("sb1.length()=" + sb1.length());

		sb1.append("Hello");
		System.out.println("sb1=" + sb1);
		System.out.println("sb1.length()=" + sb1.length());

		StringBuffer sb2;
		sb2 = sb1.delete(6, 9);
		System.out.println("sb2=" + sb2);
		System.out.println("sb1==sb2 " + (sb1 == sb2));
		System.out.println("sb1.length()=" + sb1.length());

		sb1.reverse();
		System.out.println("sb1=" + sb1);
		System.out.println("sb2=" + sb2);

		sb1.setLength(0);
		sb1.append("Hello");
		System.out.println("sb1=" + sb1);

		sb1.deleteCharAt(3);
		System.out.println("sb1=" + sb1);

		sb1.insert(0, "Buf");
		System.out.println("sb1=" + sb1);

		String s1 = sb1.toString();
		String s2 = "Hello";

		// 1st way printing in reverse
		System.out.println("=============> 1st way printing in reverse");
		char[] arr1 = s2.toCharArray();
		for (int i = arr1.length - 1; i >= 0; i--) {
			System.out.println("arr[" + i + "]" + arr1[i]);
		}

		// 1a way printing in reverse
		System.out.println("=============> 1a-way printing in reverse");
		char[] arr2 = s2.toCharArray();
		StringBuffer sb3 = new StringBuffer();

		for (int i = arr2.length - 1; i >= 0; i--) {
			sb3.append(arr2[i]);
			s1 = sb3.toString();
			System.out.println("arr[" + i + "]" + s1);
		}

		// 2nd way printing in reverse
		System.out.println("=============> 2nd way printing in reverse");
		StringBuffer sb4 = new StringBuffer(s2);
		sb4.reverse();
		s2 = sb4.toString();
		System.out.println(s2);

		// 3rd way printing in reverse
		System.out.println("=============> 3rd way printing in reverse");
		s2 = new StringBuffer(s2).reverse().toString();
		System.out.println(s2);
	}
}
