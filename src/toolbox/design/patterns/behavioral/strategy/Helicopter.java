package toolbox.design.patterns.behavioral.strategy;

/**
 * Concrete context. Is configured with a concrete strategy object.
 *
 * @author billy
 *
 */
public class Helicopter extends Vehicle {

    public Helicopter() {
        setGoStrategy(new GoByFlyingStrategy());
    }

}
