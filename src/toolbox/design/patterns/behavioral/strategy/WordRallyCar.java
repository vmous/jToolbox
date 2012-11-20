package toolbox.design.patterns.behavioral.strategy;

/**
 * Concrete context. Is configured with a concrete strategy object.
 *
 * @author billy
 *
 */
public class WordRallyCar extends Vehicle {

    public WordRallyCar() {
        setGoStrategy(new GoByDrivingStrategy());
    }

}
