package toolbox.design.patterns.creational.factorymethod;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

//import toolbox.design.patterns.creational.factorymethod.UserAuthenticationFactory.AuthenticationType;

/**
 * Unit test for the Factory Method creational design pattern.
 *
 * @author billy
 */
public class FactoryMethodTest {

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testIt() {
		UserAuthenticationFactory factory = new UserAuthenticationFactory();
        UserAuthentication authOpenLdap = factory.getUserAuthenication(UserAuthenticationFactory.AuthenticationType.OPEN_LDAP);
		UserAuthentication authActiveDirectory = factory.getUserAuthenication(UserAuthenticationFactory.AuthenticationType.ACTIVE_DIRECTORY);

		// Simulates that the authentication against an Active Directory fails.
		assertFalse(authActiveDirectory.authenticate());

		// Simulates that the authentication against an Open LDAP server succeeds.
		assertTrue(authOpenLdap.authenticate());
    }

}
