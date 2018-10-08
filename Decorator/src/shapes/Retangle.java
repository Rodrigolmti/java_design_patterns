package shapes;

import core.Shape;

public class Retangle implements Shape {

	@Override
	public void draw() {
		System.out.println("Draw a rectangle");
	}

	@Override
	public void resize() {
		System.out.println("Resize the rectangle");
	}

	@Override
	public void description() {
		System.out.println("This is a rectangle [=]");
	}
}
