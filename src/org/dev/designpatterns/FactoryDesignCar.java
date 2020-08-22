package org.dev.designpatterns;

interface Car {
	void carType();
}

class MercedesBenz implements Car {

	@Override
	public void carType() {
		System.out.println("Mercedes Benz car");
	}
}

class Bmw implements Car {

	@Override
	public void carType() {
		System.out.println("BMW car");
	}
}

class Jagaur implements Car {

	@Override
	public void carType() {
		System.out.println("Jagaur car");
	}

}

class RangeRover implements Car {

	@Override
	public void carType() {
		System.out.println("Range Rover car");
	}

}

class RollsRoyce implements Car {

	@Override
	public void carType() {
		System.out.println("Rolls Royce car");
	}

}

class CarFactory {

	public static Car getCar(String carType) {

		if (carType == null) {
			return null;
		}

		if (carType.equalsIgnoreCase("Benz")) {
			return new MercedesBenz();
		} else if (carType.equalsIgnoreCase("BMW")) {
			return new Bmw();
		} else if (carType.equalsIgnoreCase("Jagaur")) {
			return new Jagaur();
		} else if (carType.equalsIgnoreCase("RangeRover")) {
			return new RangeRover();
		} else if (carType.equalsIgnoreCase("RollsRoyce")) {
			return new RollsRoyce();
		} else {
			return null;
		}
	}
}

public class FactoryDesignCar {

	public static void main(String[] args) {

		CarFactory.getCar("Benz").carType();
		CarFactory.getCar("BMW").carType();
		CarFactory.getCar("Jagaur").carType();
		CarFactory.getCar("RangeRover").carType();
		CarFactory.getCar("RollsRoyce").carType();
		CarFactory.getCar("Audi").carType();
	}
}
