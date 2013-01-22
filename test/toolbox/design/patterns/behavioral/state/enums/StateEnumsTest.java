package toolbox.design.patterns.behavioral.state.enums;

import org.junit.After;
import org.junit.Before;

import junit.framework.TestCase;

/**
 * Unit test for the enum-based State behavioral design pattern.
 *
 * @author billy
 */
public class StateEnumsTest extends TestCase {

    private State state;

    /**
     * @throws java.lang.Exception
     */
    @Override
    @Before
    public void setUp() throws Exception {
        state = State.OFF;
    }

    /**
     * @throws java.lang.Exception
     */
    @Override
    @After
    public void tearDown() throws Exception {
    }

    public void testIt() {
        State isON = State.ON;
        State isOFF = State.OFF;

        assertEquals(state, isOFF);

        state = state.turnOn();
        assertEquals(state, isON);

        state = state.turnOn();
        assertEquals(state, isON);

        state = state.turnOff();
        assertEquals(state, isOFF);

        state = state.turnOff();
        assertEquals(state, isOFF);

        state = state.turnOn();
        assertEquals(state, isON);

        state = state.turnOn();
        assertEquals(state, isON);
    }

}
