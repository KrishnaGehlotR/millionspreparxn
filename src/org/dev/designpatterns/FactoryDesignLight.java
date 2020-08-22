package org.dev.designpatterns;

import java.util.Scanner;

interface ISwitch {
	void on();

	void off();
}

class TubelightImpl implements ISwitch {

	// Implementation logic

	@Override
	public void on() {
		System.out.println("Tubelight is turned ON");
	}

	@Override
	public void off() {
		System.out.println("Tubelight is turned OFF");
	}

}

class LedImpl implements ISwitch {

	@Override
	public void on() {
		System.out.println("Led is turned ON");
	}

	@Override
	public void off() {
		System.out.println("Led is turned OFF");
	}

}

class LightFactory {

	public static ISwitch getLight(String type) {

		if (type == null) {
			return null;
		}

		if (type.equalsIgnoreCase("Tubelight")) {
			return new TubelightImpl();
		} else if (type.equalsIgnoreCase("Led")) {
			return new LedImpl();
		} else {
			return null;
		}
	}
}

public class FactoryDesignLight {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter type of Light");
		String type = sc.next();
		sc.close();

		ISwitch light = LightFactory.getLight(type);

		if (light != null) {
			light.on();
			light.off();
		}
	}
}
