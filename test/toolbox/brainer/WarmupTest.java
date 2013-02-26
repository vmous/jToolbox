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


    @Test
    public void testDiff21() {
        assertEquals(2, Warmup.diff21(19));
        assertEquals(11, Warmup.diff21(10));
        assertEquals(0, Warmup.diff21(21));
        assertEquals(2, Warmup.diff21(22));
        assertEquals(8, Warmup.diff21(25));
        assertEquals(18, Warmup.diff21(30));
        assertEquals(21, Warmup.diff21(0));
        assertEquals(20, Warmup.diff21(1));
        assertEquals(19, Warmup.diff21(2));
        assertEquals(22, Warmup.diff21(-1));
        assertEquals(23, Warmup.diff21(-2));
        assertEquals(58, Warmup.diff21(50));
    }


    @Test
    public void testParrotTrouble() {
        assertTrue(Warmup.parrotTrouble(true, 6));
        assertFalse(Warmup.parrotTrouble(true, 7));
        assertFalse(Warmup.parrotTrouble(false, 6));
        assertTrue(Warmup.parrotTrouble(true, 21));
        assertFalse(Warmup.parrotTrouble(false, 21));
        assertFalse(Warmup.parrotTrouble(false, 20));
        assertTrue(Warmup.parrotTrouble(true, 23));
        assertFalse(Warmup.parrotTrouble(false, 23));
        assertFalse(Warmup.parrotTrouble(true, 20));
        assertFalse(Warmup.parrotTrouble(false, 12));
    }


    @Test
    public void testMakes10() {
        assertTrue(Warmup.makes10(9, 10));
        assertFalse(Warmup.makes10(9, 9));
        assertTrue(Warmup.makes10(1, 9));
        assertTrue(Warmup.makes10(10, 1));
        assertTrue(Warmup.makes10(10, 10));
        assertTrue(Warmup.makes10(8, 2));
        assertFalse(Warmup.makes10(8, 3));
        assertTrue(Warmup.makes10(10, 42));
        assertTrue(Warmup.makes10(12, -2));
    }


    @Test
    public void testNearHundred() {
        assertTrue(Warmup.nearHundred(93));
        assertTrue(Warmup.nearHundred(90));
        assertFalse(Warmup.nearHundred(89));
        assertTrue(Warmup.nearHundred(110));
        assertFalse(Warmup.nearHundred(111));
        assertFalse(Warmup.nearHundred(121));
        assertFalse(Warmup.nearHundred(0));
        assertFalse(Warmup.nearHundred(5));
        assertTrue(Warmup.nearHundred(191));
        assertFalse(Warmup.nearHundred(189));
        assertTrue(Warmup.nearHundred(190));
        assertTrue(Warmup.nearHundred(200));
        assertTrue(Warmup.nearHundred(210));
        assertFalse(Warmup.nearHundred(211));
        assertFalse(Warmup.nearHundred(1000));
    }


    @Test
    public void testPosNeg() {
        assertTrue(Warmup.posNeg(1, -1, false));
        assertTrue(Warmup.posNeg(-1, 1, false));
        assertTrue(Warmup.posNeg(-4, -5, true));
        assertFalse(Warmup.posNeg(-4, -5, false));
        assertTrue(Warmup.posNeg(-4, 5, false));
        assertFalse(Warmup.posNeg(-4, 5, true));
        assertFalse(Warmup.posNeg(1, 1, false));
        assertFalse(Warmup.posNeg(-1, -1, false));
        assertFalse(Warmup.posNeg(1, -1, true));
        assertFalse(Warmup.posNeg(-1, 1, true));
        assertFalse(Warmup.posNeg(1, 1, true));
        assertTrue(Warmup.posNeg(-1, -1, true));
        assertTrue(Warmup.posNeg(5, -5, false));
        assertTrue(Warmup.posNeg(-6, 6, false));
        assertFalse(Warmup.posNeg(-5, -6, false));
        assertFalse(Warmup.posNeg(-2, -1, false));
        assertFalse(Warmup.posNeg(1, 2, false));
        assertFalse(Warmup.posNeg(-5, 6, true));
        assertTrue(Warmup.posNeg(-5, -5, true));
    }


    @Test
    public void testNotString() {
        assertEquals("not candy", Warmup.notString("candy"));
        assertEquals("not x", Warmup.notString("x"));
        assertEquals("not bad", Warmup.notString("not bad"));
        assertEquals("not bad", Warmup.notString("bad"));
        assertEquals("not", Warmup.notString("not"));
        assertEquals("not is not", Warmup.notString("is not"));
        assertEquals("not no", Warmup.notString("no"));
    }

}
