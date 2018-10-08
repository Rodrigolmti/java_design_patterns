package shapes;

import core.Shape;

public class Circle implements Shape {

	@Override
	public void draw() {
		System.out.println("Draw a circle");
	}

	@Override
	public void resize() {
		System.out.println("Resize the cricle");
	}

	@Override
	public void description() {
		System.out.println("This is a circle o");
	}

}
