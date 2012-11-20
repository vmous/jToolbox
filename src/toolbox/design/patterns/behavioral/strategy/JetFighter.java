package toolbox.design.patterns.behavioral.strategy;

/**
 * Concrete context. Is configured with a concrete strategy object.
 *
 * @author billy
 *
 */
public class JetFighter extends Vehicle {

    public JetFighter() {
        setGoStrategy(new GoByBreakingTheSoundBarrierStrategy());
    }

}
