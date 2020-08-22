package org.dev.designpatterns;

interface Watch {

	public void brand();
}

class Fastrack implements Watch {

	@Override
	public void brand() {
		System.out.println("Fastrack Watch");
	}

}

class Hmt implements Watch {

	@Override
	public void brand() {
		System.out.println("Hmt Watch");
	}

}

class Casio implements Watch {

	@Override
	public void brand() {
		System.out.println("Casio Watch");
	}

}

class Titan implements Watch {

	@Override
	public void brand() {
		System.out.println("Titan Watch");
	}

}

class WatchFactory {

	public static Watch getWatch(String watchType) {

		if (watchType == null) {
			return null;
		}

		if (watchType.equalsIgnoreCase("Fastrack")) {
			return new Fastrack();
		}

		else if (watchType.equalsIgnoreCase("Hmt")) {
			return new Hmt();
		} else if (watchType.equalsIgnoreCase("Casio")) {
			return new Casio();
		} else if (watchType.equalsIgnoreCase("Titan")) {
			return new Titan();
		} else {
			System.out.println("No watch found");
			return null;
		}
	}
}

public class FactoryDesignWatch {

	public static void main(String[] args) {

		WatchFactory.getWatch("Fastrack").brand();
		WatchFactory.getWatch("Hmt").brand();
		WatchFactory.getWatch("Casio").brand();
		WatchFactory.getWatch("Titan").brand();
		WatchFactory.getWatch("Sonata").brand();
	}
}
