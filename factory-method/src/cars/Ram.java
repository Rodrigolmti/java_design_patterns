package cars;

import core.Car;

public class Ram implements Car {

	@Override
	public void turnOn() {
		System.out.println("Turning on ram");
	}

	@Override
	public void turnOff() {
		System.out.println("Turning off ram");
	}

	@Override
	public void honk() {
		System.out.println("Buu buuu");
	}
}
