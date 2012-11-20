package toolbox.design.patterns.creational.abstractfactory;

/**
 * Concrete factory. Implements the operations to create concrete product
 * objects.
 *
 * @author billy
 *
 */
public class MySqlConnectionFactory implements ConnectionFactory {

    public MySqlConnectionFactory() {
    }

    @Override
    public Connection createConnection() {
        return new MySqlConnection();
    }

}
