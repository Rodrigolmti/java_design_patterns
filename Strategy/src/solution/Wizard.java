package solution;

/*
 * With the strategy pattern we can create an interface that contains a execute method, and
 * we i'll have some others class's that implements the strategy and have the logic. So when you
 * have a class that dosen't share the same behavior you can change the strategy.
 */
public class Wizard {

	private WizardCastStrategy wizardCastStrategy;

	public Wizard(WizardCastStrategy wizardCastStrategy) {
		super();
		this.wizardCastStrategy = wizardCastStrategy;
	}
	
	public void changeStrategy(WizardCastStrategy wizardCastStrategy) {
		this.wizardCastStrategy = wizardCastStrategy;
	}
	
	public void castSpell() {
		wizardCastStrategy.execute();
	}
}
