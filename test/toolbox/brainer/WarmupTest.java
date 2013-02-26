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


    @Test
    public void testMissingChar() {
        assertEquals("ktten", Warmup.missingChar("kitten", 1));
        assertEquals("itten", Warmup.missingChar("kitten", 0));
        assertEquals("kittn", Warmup.missingChar("kitten", 4));
        assertEquals("i", Warmup.missingChar("Hi", 0));
        assertEquals("H", Warmup.missingChar("Hi", 1));
        assertEquals("ode", Warmup.missingChar("code", 0));
        assertEquals("cde", Warmup.missingChar("code", 1));
        assertEquals("coe", Warmup.missingChar("code", 2));
        assertEquals("cod", Warmup.missingChar("code", 3));
        assertEquals("chocolat", Warmup.missingChar("chocolate", 8));
    }


    @Test
    public void testFrontBack() {
        assertEquals("eodc", Warmup.frontBack("code"));
        assertEquals("a", Warmup.frontBack("a"));
        assertEquals("ba", Warmup.frontBack("ab"));
        assertEquals("cba", Warmup.frontBack("abc"));
        assertEquals("", Warmup.frontBack(""));
        assertEquals("ehocolatC", Warmup.frontBack("Chocolate"));
        assertEquals("aavJ", Warmup.frontBack("Java"));
        assertEquals("hello", Warmup.frontBack("oellh"));
    }


    @Test
    public void testFront3() {
        assertEquals("JavJavJav", Warmup.front3("Java"));
        assertEquals("ChoChoCho", Warmup.front3("Chocolate"));
        assertEquals("abcabcabc", Warmup.front3("abc"));
        assertEquals("abcabcabc", Warmup.front3("abcXYZ"));
        assertEquals("ababab", Warmup.front3("ab"));
        assertEquals("aaa", Warmup.front3("a"));
        assertEquals("", Warmup.front3(""));
    }


    @Test
    public void testBackAround() {
        assertEquals("tcatt", Warmup.backAround("cat"));
        assertEquals("oHelloo", Warmup.backAround("Hello"));
        assertEquals("aaa", Warmup.backAround("a"));
        assertEquals("cabcc", Warmup.backAround("abc"));
        assertEquals("dreadd", Warmup.backAround("read"));
        assertEquals("obooo", Warmup.backAround("boo"));
    }


    @Test
    public void testFront22() {
        assertEquals("kikittenki", Warmup.front22("kitten"));
        assertEquals("HaHaHa", Warmup.front22("Ha"));
        assertEquals("ababcab", Warmup.front22("abc"));
        assertEquals("ababab", Warmup.front22("ab"));
        assertEquals("aaa", Warmup.front22("a"));
        assertEquals("", Warmup.front22(""));
        assertEquals("LoLogicLo", Warmup.front22("Logic"));
    }


    @Test
    public void testStartHi() {
        assertTrue(Warmup.startHi("hi there"));
        assertTrue(Warmup.startHi("hi"));
        assertFalse(Warmup.startHi("hello hi"));
        assertFalse(Warmup.startHi("he"));
        assertFalse(Warmup.startHi("h"));
        assertFalse(Warmup.startHi(""));
        assertFalse(Warmup.startHi("ho hi"));
        assertTrue(Warmup.startHi("hi ho"));
    }


    @Test
    public void testIcyHot() {
        assertTrue(Warmup.icyHot(120, -1));
        assertTrue(Warmup.icyHot(-1, 120));
        assertFalse(Warmup.icyHot(2, 120));
        assertFalse(Warmup.icyHot(-1, 100));
        assertFalse(Warmup.icyHot(-2, -2));
        assertFalse(Warmup.icyHot(120, 120));
    }


    @Test
    public void testIn1020() {
        assertTrue(Warmup.in1020(12, 99));
        assertTrue(Warmup.in1020(21, 12));
        assertFalse(Warmup.in1020(8, 99));
        assertTrue(Warmup.in1020(99, 10));
        assertTrue(Warmup.in1020(20, 20));
        assertFalse(Warmup.in1020(21, 21));
        assertFalse(Warmup.in1020(9, 9));
    }


    @Test
    public void testHasTeen() {
        assertTrue(Warmup.hasTeen(13, 20, 10));
        assertTrue(Warmup.hasTeen(20, 19, 10));
        assertTrue(Warmup.hasTeen(20, 10, 13));
        assertFalse(Warmup.hasTeen(1, 20, 12));
        assertTrue(Warmup.hasTeen(19, 20, 12));
        assertTrue(Warmup.hasTeen(12, 20, 19));
        assertFalse(Warmup.hasTeen(12, 9, 20));
        assertTrue(Warmup.hasTeen(12, 18, 20));
        assertTrue(Warmup.hasTeen(14, 2, 20));
        assertFalse(Warmup.hasTeen(4, 2, 20));
        assertFalse(Warmup.hasTeen(11, 22, 22));
    }


    @Test
    public void testLoneTeen() {
        assertTrue(Warmup.loneTeen(13, 99));
        assertTrue(Warmup.loneTeen(21, 19));
        assertFalse(Warmup.loneTeen(13, 13));
        assertTrue(Warmup.loneTeen(14, 20));
        assertTrue(Warmup.loneTeen(20, 15));
        assertFalse(Warmup.loneTeen(16, 17));
        assertTrue(Warmup.loneTeen(16, 9));
        assertFalse(Warmup.loneTeen(16, 18));
        assertFalse(Warmup.loneTeen(13, 19));
        assertTrue(Warmup.loneTeen(13, 20));
        assertTrue(Warmup.loneTeen(6, 18));
        assertTrue(Warmup.loneTeen(99, 13));
        assertFalse(Warmup.loneTeen(99, 99));
    }


    @Test
    public void testDelDel() {
        assertEquals("abc", Warmup.delDel("adelbc"));
        assertEquals("aHello", Warmup.delDel("adelHello"));
        assertEquals("adedbc", Warmup.delDel("adedbc"));
        assertEquals("abcdel", Warmup.delDel("abcdel"));
        assertEquals("add", Warmup.delDel("add"));
        assertEquals("ad", Warmup.delDel("ad"));
        assertEquals("a", Warmup.delDel("a"));
        assertEquals("", Warmup.delDel(""));
        assertEquals("del", Warmup.delDel("del"));
        assertEquals("a", Warmup.delDel("a"));
        assertEquals("aadelbb", Warmup.delDel("aadelbb"));
    }


    @Test
    public void testMixStart() {
        assertTrue(Warmup.mixStart("mix snacks"));
        assertTrue(Warmup.mixStart("pix snacks"));
        assertFalse(Warmup.mixStart("piz snacks"));
        assertTrue(Warmup.mixStart("nix"));
        assertFalse(Warmup.mixStart("ni"));
        assertFalse(Warmup.mixStart("n"));
        assertFalse(Warmup.mixStart(""));
    }

}
