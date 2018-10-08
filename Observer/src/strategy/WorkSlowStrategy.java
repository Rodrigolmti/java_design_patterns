package strategy;

public class WorkSlowStrategy implements IWorkerSkillStrategy {

	@Override
	public void work() {
		System.out.println("Working slow, today i'm not good!");
	}
}
