package toolbox.brainer;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for the arrays class of brainers.
 *
 * @author billy
 */
public class ArraysTest {

    @Before
    public void setUp() {
    }


    @After
    public void tearDown() {
    }


    // -- EASY


    @Test
    public void testFirstLast6() {
        assertTrue(Arrays.firstLast6(new int[]{1, 2, 6}));
        assertTrue(Arrays.firstLast6(new int[]{6, 1, 2, 3}));
        assertFalse(Arrays.firstLast6(new int[]{13, 6, 1, 2, 3}));
        assertTrue(Arrays.firstLast6(new int[]{13, 6, 1, 2, 6}));
        assertFalse(Arrays.firstLast6(new int[]{3, 2, 1}));
        assertFalse(Arrays.firstLast6(new int[]{3, 6, 1}));
        assertTrue(Arrays.firstLast6(new int[]{3, 6}));
        assertTrue(Arrays.firstLast6(new int[]{6}));
        assertFalse(Arrays.firstLast6(new int[]{3}));
        assertTrue(Arrays.firstLast6(new int[]{5, 6}));
        assertFalse(Arrays.firstLast6(new int[]{5, 5}));
        assertTrue(Arrays.firstLast6(new int[]{1, 2, 3, 4, 6}));
        assertFalse(Arrays.firstLast6(new int[]{1, 2, 3, 4}));
    }


    @Test
    public void testBiggerTwo() {
        assertArrayEquals(new int[]{3, 4}, Arrays.biggerTwo(new int[]{1, 2}, new int[]{3, 4}));
        assertArrayEquals(new int[]{3, 4}, Arrays.biggerTwo(new int[]{3, 4}, new int[]{1, 2}));
        assertArrayEquals(new int[]{1, 2}, Arrays.biggerTwo(new int[]{1, 1}, new int[]{1, 2}));
        assertArrayEquals(new int[]{2, 1}, Arrays.biggerTwo(new int[]{2, 1}, new int[]{1, 1}));
        assertArrayEquals(new int[]{2, 2}, Arrays.biggerTwo(new int[]{2, 2}, new int[]{1, 3}));
        assertArrayEquals(new int[]{1, 3}, Arrays.biggerTwo(new int[]{1, 3}, new int[]{2, 2}));
        assertArrayEquals(new int[]{6, 7}, Arrays.biggerTwo(new int[]{6, 7}, new int[]{3, 1}));
    }


    @Test
    public void testCommonEnd() {
        assertTrue(Arrays.commonEnd(new int[]{1, 2, 3}, new int[]{7, 3}));
        assertFalse(Arrays.commonEnd(new int[]{1, 2, 3}, new int[]{7, 3, 2}));
        assertTrue(Arrays.commonEnd(new int[]{1, 2, 3}, new int[]{1, 3}));
        assertTrue(Arrays.commonEnd(new int[]{1, 2, 3}, new int[]{1}));
        assertFalse(Arrays.commonEnd(new int[]{1, 2, 3}, new int[]{2}));
    }


    @Test
    public void testReverse3() {
        assertArrayEquals(new int[]{3, 2, 1}, Arrays.reverse3(new int[]{1, 2, 3}));
        assertArrayEquals(new int[]{9, 11, 5}, Arrays.reverse3(new int[]{5, 11, 9}));
        assertArrayEquals(new int[]{0, 0, 7}, Arrays.reverse3(new int[]{7, 0, 0}));
        assertArrayEquals(new int[]{2, 1, 2}, Arrays.reverse3(new int[]{2, 1, 2}));
        assertArrayEquals(new int[]{1, 2, 1}, Arrays.reverse3(new int[]{1, 2, 1}));
        assertArrayEquals(new int[]{3, 11, 2}, Arrays.reverse3(new int[]{2, 11, 3}));
        assertArrayEquals(new int[]{5, 6, 0}, Arrays.reverse3(new int[]{0, 6, 5}));
        assertArrayEquals(new int[]{3, 2, 7}, Arrays.reverse3(new int[]{7, 2, 3}));
    }


    @Test
    public void testMiddleWay() {
        assertArrayEquals(new int[]{2, 5}, Arrays.middleWay(new int[]{1, 2, 3}, new int[]{4, 5, 6}));
        assertArrayEquals(new int[]{7, 8}, Arrays.middleWay(new int[]{7, 7, 7}, new int[]{3, 8, 0}));
        assertArrayEquals(new int[]{2, 4}, Arrays.middleWay(new int[]{5, 2, 9}, new int[]{1, 4, 5}));
        assertArrayEquals(new int[]{9, 8}, Arrays.middleWay(new int[]{1, 9, 7}, new int[]{4, 8, 8}));
        assertArrayEquals(new int[]{2, 1}, Arrays.middleWay(new int[]{1, 2, 3}, new int[]{3, 1, 4}));
        assertArrayEquals(new int[]{2, 1}, Arrays.middleWay(new int[]{1, 2, 3}, new int[]{4, 1, 1}));
    }


    @Test
    public void testNo23() {
        assertTrue(Arrays.no23(new int[]{4, 5}));
        assertFalse(Arrays.no23(new int[]{4, 2}));
        assertFalse(Arrays.no23(new int[]{3, 5}));
        assertTrue(Arrays.no23(new int[]{1, 9}));
        assertFalse(Arrays.no23(new int[]{2, 9}));
        assertFalse(Arrays.no23(new int[]{1, 3}));
        assertTrue(Arrays.no23(new int[]{1, 1}));
        assertFalse(Arrays.no23(new int[]{2, 2}));
        assertFalse(Arrays.no23(new int[]{3, 3}));
        assertTrue(Arrays.no23(new int[]{7, 8}));
        assertTrue(Arrays.no23(new int[]{8, 7}));
    }


    @Test
    public void testFix23() {
        assertArrayEquals(new int[]{1, 2, 0}, Arrays.fix23(new int[]{1, 2, 3}));
        assertArrayEquals(new int[]{2, 0, 5}, Arrays.fix23(new int[]{2, 3, 5}));
        assertArrayEquals(new int[]{1, 2, 1}, Arrays.fix23(new int[]{1, 2, 1}));
        assertArrayEquals(new int[]{3, 2, 1}, Arrays.fix23(new int[]{3, 2, 1}));
        assertArrayEquals(new int[]{2, 2, 0}, Arrays.fix23(new int[]{2, 2, 3}));
        assertArrayEquals(new int[]{2, 0, 3}, Arrays.fix23(new int[]{2, 3, 3}));
    }


    @Test
    public void testMakeMiddle() {
        assertArrayEquals(new int[]{2, 3}, Arrays.makeMiddle(new int[]{1, 2, 3, 4}));
        assertArrayEquals(new int[]{2, 3}, Arrays.makeMiddle(new int[]{7, 1, 2, 3, 4, 9}));
        assertArrayEquals(new int[]{1, 2}, Arrays.makeMiddle(new int[]{1, 2}));
        assertArrayEquals(new int[]{2, 4}, Arrays.makeMiddle(new int[]{5, 2, 4, 7}));
        assertArrayEquals(new int[]{4, 3}, Arrays.makeMiddle(new int[]{9, 0, 4, 3, 9, 1}));
    }


    @Test
    public void testMidThree() {
        assertArrayEquals(new int[]{2, 3, 4}, Arrays.midThree(new int[]{1, 2, 3, 4, 5}));
        assertArrayEquals(new int[]{7, 5, 3}, Arrays.midThree(new int[]{8, 6, 7, 5, 3, 0, 9}));
        assertArrayEquals(new int[]{1, 2, 3}, Arrays.midThree(new int[]{1, 2, 3}));
    }


    @Test
    public void testUnlucky1() {
        assertTrue(Arrays.unlucky1(new int[]{1, 3, 4, 5}));
        assertTrue(Arrays.unlucky1(new int[]{2, 1, 3, 4, 5}));
        assertFalse(Arrays.unlucky1(new int[]{1, 1, 1}));
        assertTrue(Arrays.unlucky1(new int[]{1, 3, 1}));
        assertTrue(Arrays.unlucky1(new int[]{1, 1, 3}));
        assertFalse(Arrays.unlucky1(new int[]{1, 2, 3}));
        assertFalse(Arrays.unlucky1(new int[]{3, 3, 3}));
        assertTrue(Arrays.unlucky1(new int[]{1, 3}));
        assertFalse(Arrays.unlucky1(new int[]{1, 4}));
        assertFalse(Arrays.unlucky1(new int[]{1}));
        assertFalse(Arrays.unlucky1(new int[]{}));
        assertFalse(Arrays.unlucky1(new int[]{1, 1, 1, 3, 1}));
        assertTrue(Arrays.unlucky1(new int[]{1, 1, 3, 1, 1}));
        assertTrue(Arrays.unlucky1(new int[]{1, 1, 1, 1, 3}));
        assertFalse(Arrays.unlucky1(new int[]{1, 4, 1, 5}));
        assertFalse(Arrays.unlucky1(new int[]{1, 1, 2, 3}));
        assertFalse(Arrays.unlucky1(new int[]{2, 3, 2, 1}));
        assertTrue(Arrays.unlucky1(new int[]{2, 3, 1, 3}));
        assertTrue(Arrays.unlucky1(new int[]{1, 2, 3, 4, 1, 3}));
    }


    @Test
    public void testSameFirstLast() {
        assertFalse(Arrays.sameFirstLast(new int[]{1, 2, 3}));
        assertTrue(Arrays.sameFirstLast(new int[]{1, 2, 3, 1}));
        assertTrue(Arrays.sameFirstLast(new int[]{1, 2, 1}));
        assertTrue(Arrays.sameFirstLast(new int[]{7}));
        assertFalse(Arrays.sameFirstLast(new int[]{}));
        assertTrue(Arrays.sameFirstLast(new int[]{1, 2, 3, 4, 5, 1}));
        assertFalse(Arrays.sameFirstLast(new int[]{1, 2, 3, 4, 5, 13}));
        assertTrue(Arrays.sameFirstLast(new int[]{13, 2, 3, 4, 5, 13}));
        assertTrue(Arrays.sameFirstLast(new int[]{7, 7}));
    }

    @Test
    public void testSum3() {
        assertEquals(6, Arrays.sum3(new int[]{1, 2, 3}));
        assertEquals(18, Arrays.sum3(new int[]{5, 11, 2}));
        assertEquals(7, Arrays.sum3(new int[]{7, 0, 0}));
        assertEquals(4, Arrays.sum3(new int[]{1, 2, 1}));
        assertEquals(3, Arrays.sum3(new int[]{1, 1, 1}));
        assertEquals(11, Arrays.sum3(new int[]{2, 7, 2}));
    }


    @Test
    public void testMaxEnd3() {
        assertArrayEquals(new int[]{3, 3, 3}, Arrays.maxEnd3(new int[]{1, 2, 3}));
        assertArrayEquals(new int[]{11, 11, 11}, Arrays.maxEnd3(new int[]{11, 5, 9}));
        assertArrayEquals(new int[]{3, 3, 3}, Arrays.maxEnd3(new int[]{2, 11, 3}));
        assertArrayEquals(new int[]{11, 11, 11}, Arrays.maxEnd3(new int[]{11, 3, 3}));
        assertArrayEquals(new int[]{11, 11, 11}, Arrays.maxEnd3(new int[]{3, 11, 11}));
        assertArrayEquals(new int[]{2, 2, 2}, Arrays.maxEnd3(new int[]{2, 2, 2}));
        assertArrayEquals(new int[]{2, 2, 2}, Arrays.maxEnd3(new int[]{2, 11, 2}));
        assertArrayEquals(new int[]{1, 1, 1}, Arrays.maxEnd3(new int[]{0, 0, 1}));
    }


    @Test
    public void testMakeEnds() {
        assertArrayEquals(new int[]{1, 3}, Arrays.makeEnds(new int[]{1, 2, 3}));
        assertArrayEquals(new int[]{1, 4}, Arrays.makeEnds(new int[]{1, 2, 3, 4}));
        assertArrayEquals(new int[]{7, 2}, Arrays.makeEnds(new int[]{7, 4, 6, 2}));
        assertArrayEquals(new int[]{1, 3}, Arrays.makeEnds(new int[]{1, 2, 2, 2, 2, 2, 2, 3}));
        assertArrayEquals(new int[]{7, 4}, Arrays.makeEnds(new int[]{7, 4}));
        assertArrayEquals(new int[]{7, 7}, Arrays.makeEnds(new int[]{7}));
        assertArrayEquals(new int[]{5, 9}, Arrays.makeEnds(new int[]{5, 2, 9}));
        assertArrayEquals(new int[]{2, 1}, Arrays.makeEnds(new int[]{2, 3, 4, 1}));
    }


    @Test
    public void testMakeLast() {
        assertArrayEquals(new int[]{0, 0, 0, 0, 0, 6}, Arrays.makeLast(new int[]{4, 5, 6}));
        assertArrayEquals(new int[]{0, 0, 0, 2}, Arrays.makeLast(new int[]{1, 2}));
        assertArrayEquals(new int[]{0, 3}, Arrays.makeLast(new int[]{3}));
        assertArrayEquals(new int[]{0, 0}, Arrays.makeLast(new int[]{0}));
        assertArrayEquals(new int[]{0, 0, 0, 0, 0, 7}, Arrays.makeLast(new int[]{7, 7, 7}));
        assertArrayEquals(new int[]{0, 0, 0, 0, 0, 4}, Arrays.makeLast(new int[]{3, 1, 4}));
        assertArrayEquals(new int[]{0, 0, 0, 0, 0, 0, 0, 4}, Arrays.makeLast(new int[]{1, 2, 3, 4}));
        assertArrayEquals(new int[]{0, 0, 0, 0, 0, 0, 0, 0}, Arrays.makeLast(new int[]{1, 2, 3, 0}));
        assertArrayEquals(new int[]{0, 0, 0, 4}, Arrays.makeLast(new int[]{2, 4}));
    }


    @Test
    public void testStart1() {
        assertEquals(2, Arrays.start1(new int[]{1, 2, 3}, new int[]{1, 3}));
        assertEquals(1, Arrays.start1(new int[]{7, 2, 3}, new int[]{1}));
        assertEquals(1, Arrays.start1(new int[]{1, 2}, new int[]{}));
        assertEquals(1, Arrays.start1(new int[]{}, new int[]{1, 2}));
        assertEquals(0, Arrays.start1(new int[]{7}, new int[]{}));
        assertEquals(1, Arrays.start1(new int[]{7}, new int[]{1}));
        assertEquals(2, Arrays.start1(new int[]{1}, new int[]{1}));
        assertEquals(0, Arrays.start1(new int[]{7}, new int[]{8}));
        assertEquals(0, Arrays.start1(new int[]{}, new int[]{}));
        assertEquals(2, Arrays.start1(new int[]{1, 3}, new int[]{1}));
    }


    @Test
    public void testPlusTwo() {
        assertArrayEquals(new int[]{1, 2, 3, 4}, Arrays.plusTwo(new int[]{1, 2}, new int[]{3, 4}));
        assertArrayEquals(new int[]{4, 4, 2, 2}, Arrays.plusTwo(new int[]{4, 4}, new int[]{2, 2}));
        assertArrayEquals(new int[]{9, 2, 3, 4}, Arrays.plusTwo(new int[]{9, 2}, new int[]{3, 4}));
    }


    @Test
    public void testMaxTriple() {
        assertEquals(3, Arrays.maxTriple(new int[]{1, 2, 3}));
        assertEquals(5, Arrays.maxTriple(new int[]{1, 5, 3}));
        assertEquals(5, Arrays.maxTriple(new int[]{5, 2, 3}));
        assertEquals(3, Arrays.maxTriple(new int[]{1, 2, 3, 1, 1}));
        assertEquals(5, Arrays.maxTriple(new int[]{1, 7, 3, 1, 5}));
        assertEquals(5, Arrays.maxTriple(new int[]{5, 1, 3, 7, 1}));
        assertEquals(5, Arrays.maxTriple(new int[]{5, 1, 7, 3, 7, 8, 1}));
        assertEquals(9, Arrays.maxTriple(new int[]{5, 1, 7, 9, 7, 8, 1}));
        assertEquals(9, Arrays.maxTriple(new int[]{5, 1, 7, 3, 7, 8, 9}));
        assertEquals(5, Arrays.maxTriple(new int[]{2, 2, 5, 1, 1}));
    }


    @Test
    public void testMake2() {
        assertArrayEquals(new int[]{4, 5}, Arrays.make2(new int[]{4, 5}, new int[]{1, 2, 3}));
        assertArrayEquals(new int[]{4, 1}, Arrays.make2(new int[]{4}, new int[]{1, 2, 3}));
        assertArrayEquals(new int[]{1, 2}, Arrays.make2(new int[]{}, new int[]{1, 2}));
        assertArrayEquals(new int[]{1, 2}, Arrays.make2(new int[]{1, 2}, new int[]{}));
        assertArrayEquals(new int[]{3, 1}, Arrays.make2(new int[]{3}, new int[]{1, 2, 3}));
        assertArrayEquals(new int[]{3, 1}, Arrays.make2(new int[]{3}, new int[]{1}));
        assertArrayEquals(new int[]{3, 1}, Arrays.make2(new int[]{3, 1, 4}, new int[]{}));
        assertArrayEquals(new int[]{1, 1}, Arrays.make2(new int[]{1}, new int[]{1}));
        assertArrayEquals(new int[]{1, 2}, Arrays.make2(new int[]{1, 2, 3}, new int[]{7, 8}));
        assertArrayEquals(new int[]{7, 8}, Arrays.make2(new int[]{7, 8}, new int[]{1, 2, 3}));
        assertArrayEquals(new int[]{7, 1}, Arrays.make2(new int[]{7}, new int[]{1, 2, 3}));
        assertArrayEquals(new int[]{5, 4}, Arrays.make2(new int[]{5, 4}, new int[]{2, 3, 7}));
    }


    @Test
    public void testMakePi() {
        assertArrayEquals(new int[]{3, 1, 4}, Arrays.makePi());
    }


    @Test
    public void testRotateLeft3() {
        assertArrayEquals(new int[]{2, 3, 1}, Arrays.rotateLeft3(new int[]{1, 2, 3}));
        assertArrayEquals(new int[]{11, 9, 5}, Arrays.rotateLeft3(new int[]{5, 11, 9}));
        assertArrayEquals(new int[]{0, 0, 7}, Arrays.rotateLeft3(new int[]{7, 0, 0}));
        assertArrayEquals(new int[]{2, 1, 1}, Arrays.rotateLeft3(new int[]{1, 2, 1}));
        assertArrayEquals(new int[]{0, 1, 0}, Arrays.rotateLeft3(new int[]{0, 0, 1}));
    }


    @Test
    public void testSum2() {
        assertEquals(3, Arrays.sum2(new int[]{1, 2, 3}));
        assertEquals(2, Arrays.sum2(new int[]{1, 1}));
        assertEquals(2, Arrays.sum2(new int[]{1, 1, 1, 1}));
        assertEquals(3, Arrays.sum2(new int[]{1, 2}));
        assertEquals(1, Arrays.sum2(new int[]{1}));
        assertEquals(0, Arrays.sum2(new int[]{}));
        assertEquals(9, Arrays.sum2(new int[]{4, 5, 6}));
        assertEquals(4, Arrays.sum2(new int[]{4}));
    }


    @Test
    public void testHas23() {
        assertTrue(Arrays.has23(new int[]{2, 5}));
        assertTrue(Arrays.has23(new int[]{4, 3}));
        assertFalse(Arrays.has23(new int[]{4, 5}));
        assertTrue(Arrays.has23(new int[]{2, 2}));
        assertTrue(Arrays.has23(new int[]{3, 2}));
        assertTrue(Arrays.has23(new int[]{3, 3}));
        assertFalse(Arrays.has23(new int[]{7, 7}));
        assertTrue(Arrays.has23(new int[]{3, 9}));
        assertFalse(Arrays.has23(new int[]{9, 5}));
    }


    @Test
    public void testDouble23() {
        assertTrue(Arrays.double23(new int[]{2, 2}));
        assertTrue(Arrays.double23(new int[]{3, 3}));
        assertFalse(Arrays.double23(new int[]{2, 3}));
        assertFalse(Arrays.double23(new int[]{3, 2}));
        assertFalse(Arrays.double23(new int[]{4, 5}));
        assertFalse(Arrays.double23(new int[]{2}));
        assertFalse(Arrays.double23(new int[]{3}));
        assertFalse(Arrays.double23(new int[]{}));
        assertFalse(Arrays.double23(new int[]{3, 4}));
    }

    public void testSwapEnds() {
        assertArrayEquals(new int[]{4, 2, 3, 1}, new int[]{1, 2, 3, 4});
        assertArrayEquals(new int[]{3, 2, 1}, new int[]{1, 2, 3});
        assertArrayEquals(new int[]{5, 6, 7, 9, 8}, new int[]{8, 6, 7, 9, 5});
        assertArrayEquals(new int[]{9, 1, 4, 1, 5, 3}, new int[]{3, 1, 4, 1, 5, 9});
        assertArrayEquals(new int[]{2, 1}, new int[]{1, 2});
        assertArrayEquals(new int[]{1}, new int[]{1});
    }


    @Test
    public void testFrontPiece() {
        assertArrayEquals(new int[]{1, 2}, Arrays.frontPiece(new int[]{1, 2, 3}));
        assertArrayEquals(new int[]{1, 2}, Arrays.frontPiece(new int[]{1, 2}));
        assertArrayEquals(new int[]{1}, Arrays.frontPiece(new int[]{1}));
        assertArrayEquals(new int[]{}, Arrays.frontPiece(new int[]{}));
        assertArrayEquals(new int[]{6, 5}, Arrays.frontPiece(new int[]{6, 5, 0}));
        assertArrayEquals(new int[]{6, 5}, Arrays.frontPiece(new int[]{6, 5}));
        assertArrayEquals(new int[]{3, 1}, Arrays.frontPiece(new int[]{3, 1, 4, 1, 5}));
        assertArrayEquals(new int[]{6}, Arrays.frontPiece(new int[]{6}));
    }


    @Test
    public void testfront11() {
        assertArrayEquals(new int[]{1, 7}, Arrays.front11(new int[]{1, 2, 3}, new int[]{7, 9, 8}));
        assertArrayEquals(new int[]{1, 2}, Arrays.front11(new int[]{1}, new int[]{2}));
        assertArrayEquals(new int[]{1}, Arrays.front11(new int[]{1, 7}, new int[]{}));
        assertArrayEquals(new int[]{2}, Arrays.front11(new int[]{}, new int[]{2, 8}));
        assertArrayEquals(new int[]{}, Arrays.front11(new int[]{}, new int[]{}));
        assertArrayEquals(new int[]{3, 1}, Arrays.front11(new int[]{3}, new int[]{1, 4, 1, 9}));
        assertArrayEquals(new int[]{1}, Arrays.front11(new int[]{1, 4, 1, 9}, new int[]{}));
    }


    // -- MEDIUM


    @Test
    public void testCountEvens() {
        assertEquals(3, Arrays.countEvens(new int[]{2, 1, 2, 3, 4}));
        assertEquals(3, Arrays.countEvens(new int[]{2, 2, 0}));
        assertEquals(0, Arrays.countEvens(new int[]{1, 3, 5}));
        assertEquals(0, Arrays.countEvens(new int[]{}));
        assertEquals(1, Arrays.countEvens(new int[]{11, 9, 0, 1}));
        assertEquals(2, Arrays.countEvens(new int[]{2, 11, 9, 0}));
        assertEquals(1, Arrays.countEvens(new int[]{2}));
        assertEquals(2, Arrays.countEvens(new int[]{2, 5, 12}));
    }


    @Test
    public void testSum13() {
        assertEquals(6, Arrays.sum13(new int[]{1, 2, 2, 1}));
        assertEquals(2, Arrays.sum13(new int[]{1, 1}));
        assertEquals(6, Arrays.sum13(new int[]{1, 2, 2, 1, 13}));
        assertEquals(4, Arrays.sum13(new int[]{1, 2, 13, 2, 1, 13}));
        assertEquals(3, Arrays.sum13(new int[]{13, 1, 2, 13, 2, 1, 13}));
        assertEquals(0, Arrays.sum13(new int[]{}));
        assertEquals(0, Arrays.sum13(new int[]{13}));
        assertEquals(0, Arrays.sum13(new int[]{13, 13}));
        assertEquals(0, Arrays.sum13(new int[]{13, 0, 13}));
        assertEquals(0, Arrays.sum13(new int[]{13, 1, 13}));
        assertEquals(14, Arrays.sum13(new int[]{5, 7, 2}));
        assertEquals(5, Arrays.sum13(new int[]{5, 13, 2}));
        assertEquals(0, Arrays.sum13(new int[]{0}));
        assertEquals(0, Arrays.sum13(new int[]{13, 0}));
    }


    @Test
    public void testLucky13() {
        assertTrue(Arrays.lucky13(new int[]{0, 2, 4}));
        assertFalse(Arrays.lucky13(new int[]{1, 2, 3}));
        assertFalse(Arrays.lucky13(new int[]{1, 2, 4}));
        assertTrue(Arrays.lucky13(new int[]{2, 7, 2, 8}));
        assertFalse(Arrays.lucky13(new int[]{2, 7, 1, 8}));
        assertFalse(Arrays.lucky13(new int[]{3, 7, 2, 8}));
        assertFalse(Arrays.lucky13(new int[]{2, 7, 2, 1}));
        assertFalse(Arrays.lucky13(new int[]{1, 2}));
        assertTrue(Arrays.lucky13(new int[]{2, 2}));
        assertTrue(Arrays.lucky13(new int[]{2}));
        assertFalse(Arrays.lucky13(new int[]{3}));
        assertTrue(Arrays.lucky13(new int[]{}));
    }


    @Test
    public void testOnly14() {
        assertTrue(Arrays.only14(new int[]{1, 4, 1, 4}));
        assertFalse(Arrays.only14(new int[]{1, 4, 2, 4}));
        assertTrue(Arrays.only14(new int[]{1, 1}));
        assertTrue(Arrays.only14(new int[]{4, 1}));
        assertFalse(Arrays.only14(new int[]{2}));
        assertTrue(Arrays.only14(new int[]{}));
        assertFalse(Arrays.only14(new int[]{1, 4, 1, 3}));
        assertFalse(Arrays.only14(new int[]{3, 1, 3}));
        assertTrue(Arrays.only14(new int[]{1}));
        assertTrue(Arrays.only14(new int[]{4}));
        assertFalse(Arrays.only14(new int[]{3, 4}));
        assertFalse(Arrays.only14(new int[]{1, 3, 4}));
        assertTrue(Arrays.only14(new int[]{1, 1, 1}));
        assertFalse(Arrays.only14(new int[]{1, 1, 1, 5}));
        assertTrue(Arrays.only14(new int[]{4, 1, 4, 1}));
    }


    @Test
    public void testEither24() {
        assertTrue(Arrays.either24(new int[]{1, 2, 2}));
        assertTrue(Arrays.either24(new int[]{4, 4, 1}));
        assertFalse(Arrays.either24(new int[]{4, 4, 1, 2, 2}));
        assertFalse(Arrays.either24(new int[]{1, 2, 3, 4}));
        assertFalse(Arrays.either24(new int[]{3, 5, 9}));
        assertTrue(Arrays.either24(new int[]{1, 2, 3, 4, 4}));
        assertTrue(Arrays.either24(new int[]{2, 2, 3, 4}));
        assertTrue(Arrays.either24(new int[]{1, 2, 3, 2, 2, 4}));
        assertFalse(Arrays.either24(new int[]{1, 2, 3, 2, 2, 4, 4}));
        assertFalse(Arrays.either24(new int[]{1, 2}));
        assertTrue(Arrays.either24(new int[]{2, 2}));
        assertTrue(Arrays.either24(new int[]{4, 4}));
        assertFalse(Arrays.either24(new int[]{2}));
        assertFalse(Arrays.either24(new int[]{}));
    }


    @Test
    public void testHas12() {
        assertTrue(Arrays.has12(new int[]{1, 3, 2}));
        assertTrue(Arrays.has12(new int[]{3, 1, 2}));
        assertTrue(Arrays.has12(new int[]{3, 1, 4, 5, 2}));
        assertFalse(Arrays.has12(new int[]{3, 1, 4, 5, 6}));
        assertTrue(Arrays.has12(new int[]{3, 1, 4, 1, 6, 2}));
        assertTrue(Arrays.has12(new int[]{2, 1, 4, 1, 6, 2}));
        assertFalse(Arrays.has12(new int[]{2, 1, 4, 1, 6}));
        assertFalse(Arrays.has12(new int[]{3, 5, 9}));
        assertFalse(Arrays.has12(new int[]{3, 5, 1}));
        assertFalse(Arrays.has12(new int[]{3, 2, 1}));
        assertTrue(Arrays.has12(new int[]{1, 2}));
        assertFalse(Arrays.has12(new int[]{1, 1}));
        assertFalse(Arrays.has12(new int[]{1}));
        assertFalse(Arrays.has12(new int[]{}));
    }


    @Test
    public void testTwoTwo() {
        assertTrue(Arrays.twoTwo(new int[]{4, 2, 2, 3}));
        assertTrue(Arrays.twoTwo(new int[]{2, 2, 4}));
        assertFalse(Arrays.twoTwo(new int[]{2, 2, 4, 2}));
        assertTrue(Arrays.twoTwo(new int[]{1, 3, 4}));
        assertTrue(Arrays.twoTwo(new int[]{1, 2, 2, 3, 4}));
        assertFalse(Arrays.twoTwo(new int[]{1, 2, 3, 4}));
        assertTrue(Arrays.twoTwo(new int[]{2, 2}));
        assertTrue(Arrays.twoTwo(new int[]{2, 2, 7}));
        assertFalse(Arrays.twoTwo(new int[]{2, 2, 7, 2, 1}));
        assertTrue(Arrays.twoTwo(new int[]{4, 2, 2, 2}));
        assertTrue(Arrays.twoTwo(new int[]{2, 2, 2}));
        assertFalse(Arrays.twoTwo(new int[]{1, 2}));
        assertFalse(Arrays.twoTwo(new int[]{2}));
        assertTrue(Arrays.twoTwo(new int[]{1}));
        assertTrue(Arrays.twoTwo(new int[]{}));
        assertTrue(Arrays.twoTwo(new int[]{5, 2, 2, 3}));
        assertFalse(Arrays.twoTwo(new int[]{2, 2, 5, 2}));
    }


    @Test
    public void testShiftLeft() {
        assertArrayEquals(new int[]{2, 5, 3, 6}, Arrays.shiftLeft(new int[]{6, 2, 5, 3}));
        assertArrayEquals(new int[]{2, 1}, Arrays.shiftLeft(new int[]{1, 2}));
        assertArrayEquals(new int[]{1}, Arrays.shiftLeft(new int[]{1}));
        assertArrayEquals(new int[]{}, Arrays.shiftLeft(new int[]{}));
        assertArrayEquals(new int[]{1, 2, 2, 4, 1}, Arrays.shiftLeft(new int[]{1, 1, 2, 2, 4}));
        assertArrayEquals(new int[]{1, 1, 1}, Arrays.shiftLeft(new int[]{1, 1, 1}));
        assertArrayEquals(new int[]{2, 3, 1}, Arrays.shiftLeft(new int[]{1, 2, 3}));
    }


    @Test
    public void testPost4() {
        assertArrayEquals(new int[]{1, 2}, Arrays.post4(new int[]{2, 4, 1, 2}));
        assertArrayEquals(new int[]{2}, Arrays.post4(new int[]{4, 1, 4, 2}));
        assertArrayEquals(new int[]{1, 2, 3}, Arrays.post4(new int[]{4, 4, 1, 2, 3}));
        assertArrayEquals(new int[]{2}, Arrays.post4(new int[]{4, 2}));
        assertArrayEquals(new int[]{3}, Arrays.post4(new int[]{4, 4, 3}));
        assertArrayEquals(new int[]{}, Arrays.post4(new int[]{4, 4}));
        assertArrayEquals(new int[]{}, Arrays.post4(new int[]{4}));
        assertArrayEquals(new int[]{3, 2}, Arrays.post4(new int[]{2, 4, 1, 4, 3, 2}));
        assertArrayEquals(new int[]{2, 2, 2}, Arrays.post4(new int[]{4, 1, 4, 2, 2, 2}));
        assertArrayEquals(new int[]{3, 2}, Arrays.post4(new int[]{3, 4, 3, 2}));
    }


    @Test
    public void testWithoutTen() {
        assertArrayEquals(new int[]{1, 2, 0, 0}, Arrays.withoutTen(new int[]{1, 10, 10, 2}));
        assertArrayEquals(new int[]{2, 0, 0}, Arrays.withoutTen(new int[]{10, 2, 10}));
        assertArrayEquals(new int[]{1, 99, 0}, Arrays.withoutTen(new int[]{1, 99, 10}));
        assertArrayEquals(new int[]{13, 14, 0, 0}, Arrays.withoutTen(new int[]{10, 13, 10, 14}));
        assertArrayEquals(new int[]{13, 14, 0, 0, 0}, Arrays.withoutTen(new int[]{10, 13, 10, 14, 10}));
        assertArrayEquals(new int[]{3, 0, 0}, Arrays.withoutTen(new int[]{10, 10, 3}));
        assertArrayEquals(new int[]{1}, Arrays.withoutTen(new int[]{1}));
        assertArrayEquals(new int[]{13, 1}, Arrays.withoutTen(new int[]{13, 1}));
        assertArrayEquals(new int[]{0}, Arrays.withoutTen(new int[]{10}));
        assertArrayEquals(new int[]{}, Arrays.withoutTen(new int[]{}));
    }


    @Test
    public void testBigDiff() {
        assertEquals(7, Arrays.bigDiff(new int[]{10, 3, 5, 6}));
        assertEquals(8, Arrays.bigDiff(new int[]{7, 2, 10, 9}));
        assertEquals(8, Arrays.bigDiff(new int[]{2, 10, 7, 2}));
        assertEquals(8, Arrays.bigDiff(new int[]{2, 10}));
        assertEquals(8, Arrays.bigDiff(new int[]{10, 2}));
        assertEquals(10, Arrays.bigDiff(new int[]{10, 0}));
        assertEquals(1, Arrays.bigDiff(new int[]{2, 3}));
        assertEquals(0, Arrays.bigDiff(new int[]{2, 2}));
        assertEquals(0, Arrays.bigDiff(new int[]{2}));
        assertEquals(8, Arrays.bigDiff(new int[]{5, 1, 6, 1, 9, 9}));
        assertEquals(3, Arrays.bigDiff(new int[]{7, 6, 8, 5}));
        assertEquals(3, Arrays.bigDiff(new int[]{7, 7, 6, 8, 5, 5, 6}));
    }


    @Test
    public void testSum67() {
        assertEquals(5, Arrays.sum67(new int[]{1, 2, 2}));
        assertEquals(5, Arrays.sum67(new int[]{1, 2, 2, 6, 99, 99, 7}));
        assertEquals(4, Arrays.sum67(new int[]{1, 1, 6, 7, 2}));
        assertEquals(2, Arrays.sum67(new int[]{1, 6, 2, 2, 7, 1, 6, 99, 99, 7}));
        assertEquals(2, Arrays.sum67(new int[]{1, 6, 2, 6, 2, 7, 1, 6, 99, 99, 7}));
        assertEquals(18, Arrays.sum67(new int[]{2, 7, 6, 2, 6, 7, 2, 7}));
        assertEquals(9, Arrays.sum67(new int[]{2, 7, 6, 2, 6, 2, 7}));
        assertEquals(8, Arrays.sum67(new int[]{1, 6, 7, 7}));
        assertEquals(8, Arrays.sum67(new int[]{6, 7, 1, 6, 7, 7}));
        assertEquals(0, Arrays.sum67(new int[]{6, 8, 1, 6, 7}));
        assertEquals(0, Arrays.sum67(new int[]{}));
        assertEquals(11, Arrays.sum67(new int[]{6, 7, 11}));
        assertEquals(22, Arrays.sum67(new int[]{11, 6, 7, 11}));
        assertEquals(11, Arrays.sum67(new int[]{2, 2, 6, 7, 7}));
    }


    @Test
    public void testSum28() {
        assertTrue(Arrays.sum28(new int[]{2, 3, 2, 2, 4, 2}));
        assertFalse(Arrays.sum28(new int[]{2, 3, 2, 2, 4, 2, 2}));
        assertFalse(Arrays.sum28(new int[]{1, 2, 3, 4}));
        assertTrue(Arrays.sum28(new int[]{2, 2, 2, 2}));
        assertTrue(Arrays.sum28(new int[]{1, 2, 2, 2, 2, 4}));
        assertFalse(Arrays.sum28(new int[]{}));
        assertFalse(Arrays.sum28(new int[]{2}));
        assertFalse(Arrays.sum28(new int[]{8}));
        assertFalse(Arrays.sum28(new int[]{2, 2, 2}));
        assertFalse(Arrays.sum28(new int[]{2, 2, 2, 2, 2}));
        assertTrue(Arrays.sum28(new int[]{1, 2, 2, 1, 2, 2}));
        assertTrue(Arrays.sum28(new int[]{5, 2, 2, 2, 4, 2}));
    }


    @Test
    public void testNo14() {
        assertTrue(Arrays.no14(new int[]{1, 2, 3}));
        assertFalse(Arrays.no14(new int[]{1, 2, 3, 4}));
        assertTrue(Arrays.no14(new int[]{2, 3, 4}));
        assertFalse(Arrays.no14(new int[]{1, 1, 4, 4}));
        assertTrue(Arrays.no14(new int[]{2, 2, 4, 4}));
        assertFalse(Arrays.no14(new int[]{2, 3, 4, 1}));
        assertTrue(Arrays.no14(new int[]{2, 1, 1}));
        assertFalse(Arrays.no14(new int[]{1, 4}));
        assertTrue(Arrays.no14(new int[]{2}));
        assertTrue(Arrays.no14(new int[]{2, 1}));
        assertTrue(Arrays.no14(new int[]{1}));
        assertTrue(Arrays.no14(new int[]{4}));
        assertTrue(Arrays.no14(new int[]{}));
        assertTrue(Arrays.no14(new int[]{1, 1, 1, 1}));
        assertFalse(Arrays.no14(new int[]{9, 4, 4, 1}));
        assertFalse(Arrays.no14(new int[]{4, 2, 3, 1}));
        assertTrue(Arrays.no14(new int[]{4, 2, 3, 5}));
        assertTrue(Arrays.no14(new int[]{4, 4, 2}));
        assertFalse(Arrays.no14(new int[]{1, 4, 4}));
    }


    @Test
    public void testMatchUp() {
        assertEquals(2, Arrays.matchUp(new int[]{1, 2, 3}, new int[]{2, 3, 10}));
        assertEquals(3, Arrays.matchUp(new int[]{1, 2, 3}, new int[]{2, 3, 5}));
        assertEquals(2, Arrays.matchUp(new int[]{1, 2, 3}, new int[]{2, 3, 3}));
        assertEquals(1, Arrays.matchUp(new int[]{5, 3}, new int[]{5, 5}));
        assertEquals(2, Arrays.matchUp(new int[]{5, 3}, new int[]{4, 4}));
        assertEquals(1, Arrays.matchUp(new int[]{5, 3}, new int[]{3, 3}));
        assertEquals(1, Arrays.matchUp(new int[]{5, 3}, new int[]{2, 2}));
        assertEquals(1, Arrays.matchUp(new int[]{5, 3}, new int[]{1, 1}));
        assertEquals(0, Arrays.matchUp(new int[]{5, 3}, new int[]{0, 0}));
        assertEquals(0, Arrays.matchUp(new int[]{4}, new int[]{4}));
        assertEquals(1, Arrays.matchUp(new int[]{4}, new int[]{5}));
    }


    @Test
    public void testModThree() {
        assertTrue(Arrays.modThree(new int[]{2, 1, 3, 5}));
        assertFalse(Arrays.modThree(new int[]{2, 1, 2, 5}));
        assertTrue(Arrays.modThree(new int[]{2, 4, 2, 5}));
        assertFalse(Arrays.modThree(new int[]{1, 2, 1, 2, 1}));
        assertTrue(Arrays.modThree(new int[]{9, 9, 9}));
        assertFalse(Arrays.modThree(new int[]{1, 2, 1}));
        assertFalse(Arrays.modThree(new int[]{1, 2}));
        assertFalse(Arrays.modThree(new int[]{1}));
        assertFalse(Arrays.modThree(new int[]{}));
        assertFalse(Arrays.modThree(new int[]{9, 7, 2, 9}));
        assertFalse(Arrays.modThree(new int[]{9, 7, 2, 9, 2, 2}));
        assertTrue(Arrays.modThree(new int[]{9, 7, 2, 9, 2, 2, 6}));
    }


    @Test
    public void testSameEnds() {
        assertFalse(Arrays.sameEnds(new int[]{5, 6, 45, 99, 13, 5, 6}, 1));
        assertTrue(Arrays.sameEnds(new int[]{5, 6, 45, 99, 13, 5, 6}, 2));
        assertFalse(Arrays.sameEnds(new int[]{5, 6, 45, 99, 13, 5, 6}, 3));
        assertTrue(Arrays.sameEnds(new int[]{1, 2, 5, 2, 1}, 1));
        assertFalse(Arrays.sameEnds(new int[]{1, 2, 5, 2, 1}, 2));
        assertTrue(Arrays.sameEnds(new int[]{1, 2, 5, 2, 1}, 0));
        assertTrue(Arrays.sameEnds(new int[]{1, 2, 5, 2, 1}, 5));
        assertTrue(Arrays.sameEnds(new int[]{1, 1, 1}, 0));
        assertTrue(Arrays.sameEnds(new int[]{1, 1, 1}, 1));
        assertTrue(Arrays.sameEnds(new int[]{1, 1, 1}, 2));
        assertTrue(Arrays.sameEnds(new int[]{1, 1, 1}, 3));
        assertTrue(Arrays.sameEnds(new int[]{1}, 1));
        assertTrue(Arrays.sameEnds(new int[]{}, 0));
        assertFalse(Arrays.sameEnds(new int[]{4, 2, 4, 5}, 1));
    }


    @Test
    public void testTenRun() {
        assertArrayEquals(new int[]{2, 10, 10, 10, 20, 20}, Arrays.tenRun(new int[]{2, 10, 3, 4, 20, 5}));
        assertArrayEquals(new int[]{10, 10, 20, 20}, Arrays.tenRun(new int[]{10, 1, 20, 2}));
        assertArrayEquals(new int[]{10, 10, 10, 20}, Arrays.tenRun(new int[]{10, 1, 9, 20}));
        assertArrayEquals(new int[]{1, 2, 50, 50}, Arrays.tenRun(new int[]{1, 2, 50, 1}));
        assertArrayEquals(new int[]{1, 20, 50, 50}, Arrays.tenRun(new int[]{1, 20, 50, 1}));
        assertArrayEquals(new int[]{10, 10}, Arrays.tenRun(new int[]{10, 10}));
        assertArrayEquals(new int[]{10, 10}, Arrays.tenRun(new int[]{10, 2}));
        assertArrayEquals(new int[]{0, 0}, Arrays.tenRun(new int[]{0, 2}));
        assertArrayEquals(new int[]{1, 2}, Arrays.tenRun(new int[]{1, 2}));
        assertArrayEquals(new int[]{1}, Arrays.tenRun(new int[]{1}));
        assertArrayEquals(new int[]{}, Arrays.tenRun(new int[]{}));
    }


    @Test
    public void testNotAlone() {
        assertArrayEquals(new int[]{1, 3, 3}, Arrays.notAlone(new int[]{1, 2, 3}, 2));
        assertArrayEquals(new int[]{1, 3, 3, 5, 5, 2}, Arrays.notAlone(new int[]{1, 2, 3, 2, 5, 2}, 2));
        assertArrayEquals(new int[]{3, 4}, Arrays.notAlone(new int[]{3, 4}, 3));
        assertArrayEquals(new int[]{3, 3}, Arrays.notAlone(new int[]{3, 3}, 3));
        assertArrayEquals(new int[]{1, 3, 3, 2}, Arrays.notAlone(new int[]{1, 3, 1, 2}, 1));
        assertArrayEquals(new int[]{3}, Arrays.notAlone(new int[]{3}, 3));
        assertArrayEquals(new int[]{}, Arrays.notAlone(new int[]{}, 3));
        assertArrayEquals(new int[]{7, 7, 6}, Arrays.notAlone(new int[]{7, 1, 6}, 1));
        assertArrayEquals(new int[]{1, 1, 1}, Arrays.notAlone(new int[]{1, 1, 1}, 1));
        assertArrayEquals(new int[]{1, 1, 1, 2}, Arrays.notAlone(new int[]{1, 1, 1, 2}, 1));
    }


    @Test
    public void testZeroMax() {
        assertArrayEquals(new int[]{5, 5, 3, 3}, Arrays.zeroMax(new int[]{0, 5, 0, 3}));
        assertArrayEquals(new int[]{3, 4, 3, 3}, Arrays.zeroMax(new int[]{0, 4, 0, 3}));
        assertArrayEquals(new int[]{1, 1, 0}, Arrays.zeroMax(new int[]{0, 1, 0}));
        assertArrayEquals(new int[]{5, 1, 5}, Arrays.zeroMax(new int[]{0, 1, 5}));
        assertArrayEquals(new int[]{0, 2, 0}, Arrays.zeroMax(new int[]{0, 2, 0}));
        assertArrayEquals(new int[]{1}, Arrays.zeroMax(new int[]{1}));
        assertArrayEquals(new int[]{0}, Arrays.zeroMax(new int[]{0}));
        assertArrayEquals(new int[]{}, Arrays.zeroMax(new int[]{}));
        assertArrayEquals(new int[]{7, 3, 4, 3, 0, 2}, Arrays.zeroMax(new int[]{7, 0, 4, 3, 0, 2}));
        assertArrayEquals(new int[]{7, 3, 4, 3, 1, 1}, Arrays.zeroMax(new int[]{7, 0, 4, 3, 0, 1}));
        assertArrayEquals(new int[]{7, 3, 4, 3, 0, 0}, Arrays.zeroMax(new int[]{7, 0, 4, 3, 0, 0}));
        assertArrayEquals(new int[]{7, 7, 1, 7, 7, 7}, Arrays.zeroMax(new int[]{7, 0, 1, 0, 0, 7}));
    }

}
