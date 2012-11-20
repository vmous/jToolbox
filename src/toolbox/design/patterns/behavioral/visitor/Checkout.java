package toolbox.design.patterns.behavioral.visitor;

/**
 * Visitor. Declares a visit operation for each class of concrete element in the
 * object structure. The operation's name and signature identifies the class
 * that sends the visit request to the visitor. That lets the visitor determine
 * the concrete class of the element being visited. Then the visitor can access
 * the element directly through its particular interface.
 *
 * @author billy
 *
 */
public interface Checkout {

    /**
     * Visit operation.
     *
     * @param book
     */
    public abstract void checkout(Book book);

    /**
     * Visit operation.
     *
     * @param dvd
     */
    public abstract void checkout(DVD dvd);

}
