package toolbox.design.patterns.creational.abstractfactory;

/**
 * Utility class for generating database factories.
 *
 * @author billy
 */
public class DatabaseConnectionFactory {

    /**
     * Supported database connection types.
     *
     * @author billy
     */
    public enum ConnectionType {
        MYSQL,
        ORACLE,
        SQL_SERVER
    }

    /**
     * Static utility function for getting specific database factories.
     *
     * @param type
     *     The specific type.
     *
     * @return
     *     A factory for database connections specific to the given type.
     */
    public static ConnectionFactory getSpecificConnectionFactory(ConnectionType type) {
        ConnectionFactory factory;

        switch (type) {
        case MYSQL:
            factory = new MySqlConnectionFactory();
            break;
        case ORACLE:
            factory = new OracleConnectionFactory();
            break;
        case SQL_SERVER:
            factory = new SqlServerConnectionFactory();
            break;
        default:
            factory = null;
        }

        return factory;
    }

}
