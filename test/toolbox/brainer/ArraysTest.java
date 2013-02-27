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

}
