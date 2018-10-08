package problem;

import solution.FireBallCastStrategy;
import solution.IceWallCastStrategy;
import solution.Wizard;

public class Main {

	public static void main(String[] args) {
		
		// Bad implementation
		final Duck gold = new GoldDuck();
		final Duck black = new BlackDuck();
	
		gold.quack();
		gold.fly();
		
		black.quack();
		black.fly();
		
		// Right implementation
		final Wizard wizard = new Wizard(new FireBallCastStrategy());
		
		wizard.castSpell();
		wizard.changeStrategy(new IceWallCastStrategy());
		wizard.castSpell();
		
		wizard.changeStrategy(() -> { System.out.println("Casting custom spell!"); });
		wizard.castSpell();
	}
}
