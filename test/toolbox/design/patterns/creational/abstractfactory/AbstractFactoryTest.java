package toolbox.design.patterns.creational.abstractfactory;

import org.junit.After;
import org.junit.Before;

import toolbox.design.patterns.creational.abstractfactory.DatabaseConnectionFactory.ConnectionType;

import junit.framework.TestCase;

/**
 * Unit test for the Abstract Factory creational design pattern.
 *
 * @author billy
 */
public class AbstractFactoryTest extends TestCase {

	/**
	 * @throws Exception
	 */
	@Override
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws Exception
	 */
	@Override
	@After
	public void tearDown() throws Exception {
	}

	public void testIt() {
        ConnectionType type = ConnectionType.SQL_SERVER;
        ConnectionFactory factory = DatabaseConnectionFactory.getSpecificConnectionFactory(type);
        Connection connection = factory.createConnection();
        connection.connect();
	}

}
