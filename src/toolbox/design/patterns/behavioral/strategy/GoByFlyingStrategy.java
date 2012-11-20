package toolbox.design.patterns.behavioral.strategy;

/**
 * Concrete strategy. Implements the algorithm using the strategy interface.
 *
 * @author billy
 *
 */
public class GoByFlyingStrategy implements GoStrategy {

	@Override
	public void go() {
		System.out.println("Now I'm flying.");
	}

}
