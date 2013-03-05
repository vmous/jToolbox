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

}
