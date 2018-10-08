package strategy;

public class WorkFastStrategy implements IWorkerSkillStrategy {

	@Override
	public void work() {
		System.out.println("Working fast, i've just drinked redbull");	
	}
}
