package toolbox.design.patterns.creational.abstractfactory;

/**
 * Abstract factory. Declares an interface for operations that create abstract
 * products.
 *
 * @author billy
 *
 */
public interface ConnectionFactory {

    public abstract Connection createConnection();

}
