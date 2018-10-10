package core;

public class Main {

	public static void main(String[] args) {

		Car car = CarFactory.carFactory(CarFuel.ELETRICITY);
		car.turnOn();
		car.turnOff();
		
		car = CarFactory.carFactory(CarFuel.GASOLINE);
		car.turnOn();
		car.turnOff();
		
		car = CarFactory.carFactory(CarFuel.DIESEL);
		car.turnOn();
		car.turnOff();
	}
}
