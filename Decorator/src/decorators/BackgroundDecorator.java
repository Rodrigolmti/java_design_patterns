package decorators;

import core.BaseShape;
import core.Shape;
import enums.Background;

public class BackgroundDecorator extends BaseShape {

	protected Background background;
	
	public BackgroundDecorator(Shape shape, Background background) {
		super(shape);
		this.background = background;
	}

	@Override
	public void draw() {
		System.out.println("Change the background to: " + background);
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
