package core;

public abstract class BaseShape implements Shape {

	protected Shape shape;
	
	public BaseShape(Shape shape) {
		this.shape = shape;
	}
}
