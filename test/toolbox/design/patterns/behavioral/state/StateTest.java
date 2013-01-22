package toolbox.design.patterns.behavioral.state;

import org.junit.After;
import org.junit.Before;

import junit.framework.TestCase;

/**
 * Unit test for the State behavioral design pattern.
 *
 * @author billy
 */
public class StateTest extends TestCase {

    /**
     * @throws java.lang.Exception
     */
    @Override
    @Before
    public void setUp() throws Exception {
    }

    /**
     * @throws java.lang.Exception
     */
    @Override
    @After
    public void tearDown() throws Exception {
    }

    public void testIt() {
        Messager messager = new Messager();
        messager.sendMessage("Hello m8 :)");
        messager.goOffline();
        messager.goOnline();
        messager.sendMessage("Hello m8 :)");
        messager.receiveMessage();
        messager.goOnline();
        messager.goOffline();
        messager.receiveMessage();
    }

}
