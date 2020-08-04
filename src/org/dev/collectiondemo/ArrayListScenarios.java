package org.dev.collectiondemo;

import java.util.ArrayList;

class Chocolate {

	void giveAroma() {
		System.out.println("Chocolate aroma");
	}
}

class Halwa {

	void getAroma() {
		System.out.println("Halwa aroma");
	}
}

public class ArrayListScenarios {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		ArrayList lst = new ArrayList();
		lst.add(new Chocolate());
		lst.add(new Chocolate());
		lst.add(new Halwa());
		lst.add(new Chocolate());
		lst.add(new Halwa());

		System.out.println(lst.size());

		for (Object obj : lst)
			if (obj instanceof Chocolate)
				((Chocolate) obj).giveAroma();
			else if (obj instanceof Halwa)
				((Halwa) obj).getAroma();
	}
}
