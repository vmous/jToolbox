package toolbox.design.patterns.behavioral.state;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for the State behavioral design pattern.
 *
 * @author billy
 */
public class StateTest {

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
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
