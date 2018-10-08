package core;
import java.util.ArrayList;
import java.util.List;

import observer.Observable;
import observer.Observer;

public class Mine implements Observable {

	private final List<Observer> observers = new ArrayList<>();
	private boolean mineWorking = false;
	
	@Override
	public void addObserver(Observer observer) {
		this.observers.add(observer);
	}
	
	@Override
	public void removeObserver(Observer observer) {
		this.observers.remove(observer);
	}
	
	@Override
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update();
		}
	}
	
	public void startMine()  {
		this.mineWorking = true;
		workersStartMine();
	}
	
	public void stopMine() {
		this.mineWorking = false;
	}
	
	private void workersStartMine() {
		if (mineWorking) {
			try {
				
				Thread.sleep(2000);
				notifyObservers();
				workersStartMine();
				
			} catch(Exception error) {
				error.printStackTrace();
			}
		}
	}
}
