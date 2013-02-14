package toolbox.design.patterns.behavioral.state.enums;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for the enum-based State behavioral design pattern.
 *
 * @author billy
 */
public class StateEnumsTest {

    private State state;

    @Before
    public void setUp() {
        state = State.OFF;
    }

    @After
    public void tearDown() {
    }

    @Test
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
