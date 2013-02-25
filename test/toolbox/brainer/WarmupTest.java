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


    @Test
    public void testSumDouble() {
        assertEquals(3, Warmup.sumDouble(1, 2));
        assertEquals(5, Warmup.sumDouble(3, 2));
        assertEquals(8, Warmup.sumDouble(2, 2));
        assertEquals(-1, Warmup.sumDouble(-1, 0));
        assertEquals(12, Warmup.sumDouble(3, 3));
        assertEquals(0, Warmup.sumDouble(0, 0));
        assertEquals(1, Warmup.sumDouble(0, 1));
        assertEquals(7, Warmup.sumDouble(3, 4));
    }

}
