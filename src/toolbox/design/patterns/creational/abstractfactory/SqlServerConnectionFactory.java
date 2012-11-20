package toolbox.design.patterns.creational.abstractfactory;

/**
 * Concrete factory. Implements the operations to create concrete product
 * objects.
 *
 * @author billy
 *
 */
public class SqlServerConnectionFactory implements ConnectionFactory {

    public SqlServerConnectionFactory() {
    }

    @Override
    public Connection createConnection() {
        return new SqlServerConnection();
    }

}
