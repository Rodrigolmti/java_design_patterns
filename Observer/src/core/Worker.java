package core;
import observer.Observer;
import strategy.IWorkerSkillStrategy;

public class Worker implements Observer {
	
	private IWorkerSkillStrategy workerStrategy;
	
	public Worker (IWorkerSkillStrategy workerStrategy) {
		this.workerStrategy = workerStrategy;
	}
	
	public void changeWorkerStrategy(IWorkerSkillStrategy workerStrategy) {
		this.workerStrategy = workerStrategy;
	}

	@Override
	public void update() {
		this.workerStrategy.work();
	}
}
