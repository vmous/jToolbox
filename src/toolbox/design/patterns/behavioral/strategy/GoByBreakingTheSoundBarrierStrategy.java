package toolbox.design.patterns.behavioral.strategy;

/**
 * Concrete strategy. Implements the algorithm using the strategy interface.
 *
 * @author billy
 *
 */
public class GoByBreakingTheSoundBarrierStrategy implements GoStrategy {

    @Override
    public void go() {
        System.out.println("Now I'm breaking the sound barrier.");
    }

}
