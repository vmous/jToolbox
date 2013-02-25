package toolbox.brainer;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for the warm-up class of brainers.
 *
 * @author billy
 */
public class WarmupTest {

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testSleepIn() {
        assertTrue(Warmup.sleepIn(false, false));
        assertFalse(Warmup.sleepIn(true, false));
        assertTrue(Warmup.sleepIn(false, true));
        assertTrue(Warmup.sleepIn(true, true));
    }

    @Test
    public void testMonkeyTrouble() {
        assertTrue(Warmup.monkeyTrouble(true, true));
        assertTrue(Warmup.monkeyTrouble(false, false));
        assertFalse(Warmup.monkeyTrouble(true, false));
        assertFalse(Warmup.monkeyTrouble(false, true));
    }

}
