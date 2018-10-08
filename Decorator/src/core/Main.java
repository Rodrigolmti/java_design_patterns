package core;

import decorators.BackgroundDecorator;
import decorators.ColorDecorator;
import enums.Background;
import enums.Color;
import shapes.Circle;
import shapes.Retangle;

public class Main {

	public static void main(String[] args) {
		
		System.out.println(" == Creating simple shapes == ");
		
		final Shape rectangle = new Retangle();
		final Shape cricle = new Circle();

		rectangle.draw();
		cricle.draw();
		
		System.out.println(" == Showing the black filled rectangle == ");
		
		final Shape rectangleBlackFilled = new ColorDecorator(new BackgroundDecorator(new Retangle(), Background.FILLED), Color.BLACK);
		rectangleBlackFilled.description();
		rectangleBlackFilled.draw();
		
		System.out.println(" == Showing the blue trasnaparent circle == ");
		final Shape shapeDecorator = new Circle();
		final ColorDecorator colorDecorator = new ColorDecorator(shapeDecorator, Color.BLUE);
		final BackgroundDecorator backgroundDecorator = new BackgroundDecorator(colorDecorator, Background.TRANSPARENT);
		final Shape circleBlueTransparent = backgroundDecorator;
		
		circleBlueTransparent.description();
		circleBlueTransparent.draw();
	}
}
