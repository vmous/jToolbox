package toolbox.design.patterns.creational.abstractfactory;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import toolbox.design.patterns.creational.abstractfactory.DatabaseConnectionFactory.ConnectionType;

/**
 * Unit test for the Abstract Factory creational design pattern.
 *
 * @author billy
 */
public class AbstractFactoryTest {

	@Before
	public void setUp() {
	}

	@After
	public void tearDown() {
	}

	@Test
	public void testIt() {
        ConnectionType type = ConnectionType.SQL_SERVER;
        ConnectionFactory factory = DatabaseConnectionFactory.getSpecificConnectionFactory(type);
        Connection connection = factory.createConnection();
        connection.connect();
	}

}
