package cars;

import core.Car;

public class Prius implements Car {

	@Override
	public void turnOn() {
		System.out.println("Turning on prius");
	}

	@Override
	public void turnOff() {
		System.out.println("Turning off prius");
	}

	@Override
	public void honk() {
		System.out.println("Biip biip");
	}
}
