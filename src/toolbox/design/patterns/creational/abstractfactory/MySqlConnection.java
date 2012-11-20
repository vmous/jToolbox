package toolbox.design.patterns.creational.abstractfactory;

/**
 * Concrete product. Implements the interface for the specific type of products
 * created by the corresponding concrete factory.
 *
 * @author billy
 *
 */
public class MySqlConnection implements Connection {

    public MySqlConnection() {
    }

    @Override
    public void connect() {
        System.out.println("Connected to MySQL.");
    }

}
