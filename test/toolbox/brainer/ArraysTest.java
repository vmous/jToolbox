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

}
