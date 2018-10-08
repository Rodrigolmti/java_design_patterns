package decorators;

import core.BaseShape;
import core.Shape;
import enums.Color;

public class ColorDecorator extends BaseShape {

	private final Color color;
	
	public ColorDecorator(Shape shape, Color color) {
		super(shape);
		this.color = color;	
	}

	@Override
	public void draw() {
		System.out.println("Paint with: " + color);
		shape.draw();
	}

	@Override
	public void resize() {
		shape.resize();
	}

	@Override
	public void description() {
		shape.description();
	}
}
