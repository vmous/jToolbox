package toolbox.design.patterns.behavioral.visitor;

/**
 * Element. Defines an accept operation that takes a visitor as an argument.
 *
 * @author billy
 *
 */
public interface Item {

    /**
     * Accept operation.
     *
     * @param checkout
     */
    public abstract void proceed(Checkout checkout);

}
