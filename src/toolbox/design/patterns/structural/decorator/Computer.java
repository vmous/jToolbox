package toolbox.design.patterns.structural.decorator;

/**
 * Concrete component. Defines an object to which additional responsibilities
 * can be attached.
 *
 * @author billy
 *
 */
public class Computer implements Product {

    public Computer() {
    }

    @Override
    public double getCost() {
        return 265.86;
    }

    @Override
    public String getDescription() {
        return "computer";
    }

}
