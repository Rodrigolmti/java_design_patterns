package core;
import strategy.WorkFastStrategy;
import strategy.WorkSlowStrategy;

public class Main {

	public static void main(String[] args) {
		
		final Mine mine = new Mine();
		
		final Worker mike = new Worker(new WorkFastStrategy());
		final Worker louis = new Worker(new WorkSlowStrategy());
		
		mine.addObserver(mike);
		mine.addObserver(louis);
		
		mine.startMine();
	}
}
