package toolbox.design.patterns.creational.abstractfactory;

/**
 * Concrete product. Implements the interface for the specific type of products
 * created by the corresponding concrete factory.
 *
 * @author billy
 *
 */
public class OracleConnection implements Connection {

    public OracleConnection() {
    }

    @Override
    public void connect() {
        System.out.println("Connected to Oracle.");
    }

}
