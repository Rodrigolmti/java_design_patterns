package core;

import cars.Bugatti;
import cars.Prius;
import cars.Ram;

public class CarFactory {

	public static Car carFactory(CarFuel fuel) {
		switch(fuel) {
			case ELETRICITY:
				return new Prius();
			case GASOLINE:
				return new Bugatti();
			case DIESEL:
				return new Ram();
			default:
				return new Prius();
		}
	}
}
