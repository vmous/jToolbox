package toolbox.design.patterns.creational.abstractfactory;

/**
 * Concrete factory. Implements the operations to create concrete product
 * objects.
 *
 * @author billy
 *
 */
public class OracleConnectionFactory implements ConnectionFactory {

    public OracleConnectionFactory() {
    }

    @Override
    public Connection createConnection() {
        return new OracleConnection();
    }

}
