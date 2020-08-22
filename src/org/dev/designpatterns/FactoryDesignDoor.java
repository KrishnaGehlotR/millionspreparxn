package org.dev.designpatterns;

import java.util.Scanner;

interface IDoor {

	void open();

	void close();
}

class FrontDoor implements IDoor {

	@Override
	public void open() {
		System.out.println("Front door was opened");
	}

	@Override
	public void close() {
		System.out.println("Front door was closed");
	}

}

class BackDoor implements IDoor {

	@Override
	public void open() {
		System.out.println("Back door was opened");
	}

	@Override
	public void close() {
		System.out.println("Back door was closed");
	}

}

class DoorFactory {

	public static IDoor getDoor(String door) {

		if (door == null) {
			return null;
		}

		if (door.equalsIgnoreCase("Front")) {
			return new FrontDoor();
		} else if (door.equalsIgnoreCase("Back")) {
			return new BackDoor();
		} else {
			return null;
		}
	}
}

public class FactoryDesignDoor {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the type of door");

		String type = sc.next();
		sc.close();

		IDoor door = DoorFactory.getDoor(type);

		if (door != null) {
			door.open();
			door.close();
		}
	}
}
