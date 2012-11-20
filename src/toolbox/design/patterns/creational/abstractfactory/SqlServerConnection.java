package toolbox.design.patterns.creational.abstractfactory;

/**
 * Concrete product. Implements the interface for the specific type of products
 * created by the corresponding concrete factory.
 *
 * @author billy
 *
 */
public class SqlServerConnection implements Connection {

    public SqlServerConnection() {
    }

    @Override
    public void connect() {
        System.out.println("Connected to M$ SQL Server.");
    }

}
