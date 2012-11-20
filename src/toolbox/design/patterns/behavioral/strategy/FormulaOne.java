package toolbox.design.patterns.behavioral.strategy;

/**
 * Concrete context. Is configured with a concrete strategy object.
 *
 * @author billy
 *
 */
public class FormulaOne extends Vehicle {

    public FormulaOne() {
        setGoStrategy(new GoByRacingStrategy());
    }

}
