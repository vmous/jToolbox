package toolbox.brainer;

/**
 * Array problems.
 *
 * @author billy
 */
public class Arrays {

    /**
     * Given an array of ints, return true if 6 appears as either the first or
     * last element in the array. The array will be length 1 or more.
     *
     * @param nums
     *     The array of integers.
     *
     * @return
     *     {@code true} if either the first or the last element equals to 6;
     *     {@code false} otherwise.
     */
    public static boolean firstLast6(int[] nums) {
        boolean is = false;
        if (nums.length > 0 && (nums[0] == 6 || nums[nums.length - 1] == 6) )
            is = true;

        return is;
    }


    /**
     * Start with 2 int arrays, a and b, each length 2. Consider the sum of the
     * values in each array. Return the array which has the largest sum. In
     * event of a tie, return a.
     *
     * @param a
     *     The first array.
     * @param b
     *     The second array.
     *
     * @return
     *     The array with the largest sum of its elements.
     */
    public static int[] biggerTwo(int[] a, int[] b) {
        int aSum = a[0] + a[1];
        int bSum = b[0] + b[1];
        if (aSum > bSum)
            return a;
        else if (bSum > aSum)
            return b;
        else
            return a;
    }

}
