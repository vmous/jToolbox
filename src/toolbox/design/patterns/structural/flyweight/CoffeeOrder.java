package toolbox.design.patterns.structural.flyweight;

/**
 * Flyweight. Declares an interface through which flyweights can receive and act
 * on extrinsic state.
 *
 * @author billy
 */
public interface CoffeeOrder {

    public abstract void serveCoffee(CoffeeOrderContext context);

}
