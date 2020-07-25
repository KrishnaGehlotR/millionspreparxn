package org.dev.methodoverriding;

class MummyMd {

	void mummyMasalaDosa() {
		System.out.println("Heat Tava");
		System.out.println("Put 1tsp oil and spread the dosa better");
		System.out.println("After a while put a bit of oil at edge and center");
		System.out.println("Once golder color, put potato masala");
		System.out.println("Fold both ends and place on a plate");
	}

	void createIdly() {
		System.out.println("White Idly");
	}
}

class MyMd extends MummyMd {

	void create() {
		super.mummyMasalaDosa();
		System.out.println("Put the ghee on dosa");
		System.out.println("Put chutney in a cup");
	}

	void createIdly() {
		super.createIdly();
		System.out.println("Prepare masala idly");
	}

	void mixedIdly() {
		super.createIdly();
		System.out.println("Put this on left half");
		this.createIdly();
		System.out.println("Put this on right half");
	}
}

public class MasalaDosa {

	public static void main(String[] args) {

		MyMd myMd = new MyMd();
		myMd.create();
		System.out.println("===============Next week=============");

		myMd.createIdly();// masala idly
		System.out.println("===============Next week=============");

		myMd.mixedIdly();
	}

}
