package org.dev.innerclasses;

public class InnerAnonymousClassD {

	static class D {

		public void test() {
			System.out.println("test-B");
		}

		public static void main(String[] args) {

			D d1 = new D() {
				public void test() {
					System.out.println("test-anonymous");
				}
			};
			d1.test();
		}
	}
}
