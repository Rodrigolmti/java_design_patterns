package problem;

/*
 * GolDuck implements Duck, but ducks make quack and fly mandatory, for all
 * classes how implements her, but here we have a problem. This specific type of duck
 * dosen't fly, but we need to implement the method.
 */
public class GoldDuck extends Duck {

	@Override
	public void quack() {
		System.out.println("Quack gold duck!");	
	}

	@Override
	public void fly() {
		System.out.println("This duck dosen't fly, but we need to implement the fly method");	
	}
}
