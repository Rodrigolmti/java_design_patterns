package cars;

import core.Car;

public class Bugatti implements Car {

	@Override
	public void turnOn() {
		System.out.println("Turning on bugatti");
	}

	@Override
	public void turnOff() {
		System.out.println("Turning off bugatti");
	}

	@Override
	public void honk() {
		System.out.println("Beep beep");
	}
}
