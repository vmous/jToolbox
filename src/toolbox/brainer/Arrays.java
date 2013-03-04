package toolbox.brainer;

/**
 * Array brainers.
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


    /**
     * Given 2 arrays of ints, a and b, return true if they have the same first
     * element or they have the same last element. Both arrays will be length 1
     * or more.
     *
     * @param a
     *     The first array.
     * @param b
     *     The second array.
     *
     * @return
     *     {@code true} if they have their first or last elements equal;
     *     {@code false} otherwise.
     */
    public static boolean commonEnd(int[] a, int[] b) {
        boolean is = false;

        if (a.length > 0 && b.length > 0)
            if ( (a[0] == b[0]) || (a[a.length - 1] == b[b.length - 1]) )
                is = true;

        return is;
    }


    /**
     * Given an array of ints length 3, return a new array with the elements
     * in reverse order, so {1, 2, 3} becomes {3, 2, 1}.
     *
     * @param nums
     *     The array.
     *
     * @return
     *     The given array with its elements in reverse order.
     */
    public static int[] reverse3(int[] nums) {
        int[] newNums = new int[3];
        newNums[0] = nums[2];
        newNums[1] = nums[1];
        newNums[2] = nums[0];

        return newNums;
    }


    /**
     * Given 2 int arrays, a and b, each length 3, return a new array length 2
     * containing their middle elements.
     *
     * @param a
     *     The first array.
     * @param b
     *     The second array.
     *
     * @return
     *     A two-element array containing the given arrays' middle elements.
     */
    public static int[] middleWay(int[] a, int[] b) {
        int[] newArray = new int[2];

        newArray[0] = a[1];
        newArray[1] = b[1];

        return newArray;
    }


    /**
     * Given an int array length 2, return true if it does not contain a 2 or 3.
     *
     * @param nums
     *     The array.
     *
     * @return
     *     {@code true} if it does not contain a 2 or 3; {@code false}
     *     otherwise.
     */
    public static boolean no23(int[] nums) {
        return ( (nums[0] != 2 && nums[0] != 3 && nums[1] != 2 && nums[1] != 3) );
    }


    /**
     * Given an int array length 3, if there is a 2 in the array immediately
     * followed by a 3, set the 3 element to 0. Return the changed array.
     *
     * @param nums
     *     The array.
     *
     * @return
     *     Returns the same array any 3 following a 2, changed to 0.
     */
    public static int[] fix23(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 2)
                if( (i < nums.length - 1) && nums[i + 1] == 3)
                    nums[i + 1] = 0;
        }
        return nums;
    }


    /**
     * Given an array of ints of even length, return a new array length 2
     * containing the middle two elements from the original array. The original
     * array will be length 2 or more.
     *
     * @param nums
     *     The array of even length (at least 2).
     *
     * @return
     *     A new array of length 2 containing the middle elements of the given
     *     array.
     */
    public static int[] makeMiddle(int[] nums) {
        int[] newArray = new int[2];

        newArray[0] = nums[(int) Math.floor((double) (nums.length - 1) / 2)];
        newArray[1] = nums[(int) Math.ceil((double) (nums.length - 1) / 2)];

        return newArray;
    }


    /**
     * Given an array of ints of odd length, return a new array length 3
     * containing the elements from the middle of the array. The array length
     * will be at least 3.
     *
     * @param nums
     *     The array of odd lenght (at least 3).
     *
     * @return
     *     A new array of length 3 containing the middle elements of given
     *     array.
     */
    public static int[] midThree(int[] nums) {
        int[] newArray = new int[3];
        int mid = (nums.length - 1) / 2;

        newArray[0] = nums[mid - 1];
        newArray[1] = nums[mid];
        newArray[2] = nums[mid + 1];

        return newArray;
    }


    /**
     * We'll say that a 1 immediately followed by a 3 in an array is an
     * "unlucky" 1. Return true if the given array contains an unlucky 1 in the
     * first 2 or last 2 positions in the array.
     *
     * @param nums
     *     The array.
     *
     * @return
     *     {@code true} if the given array contains an unlucky 1 in the first
     *     2 or last 2 positions in the array.
     */
    public static boolean unlucky1(int[] nums) {
        boolean is = false;

        for (int i = 0; i < nums.length; i++)
            if (nums[i] == 1 && (i < 2 || i == nums.length - 2))
                if (i < nums.length - 1 && nums[i + 1] == 3)
                    is = true;

        return is;
    }


    /**
     * Given an array of ints, return true if the array is length 1 or more, and
     * the first element and the last element are equal.
     *
     * @param nums
     *     The array.
     *
     * @return
     *     {@code true} if the is lenght 1 or more and the first element and the
     *     last are equal.
     */
    public static boolean sameFirstLast(int[] nums) {
        return ( nums.length > 0 && (nums[0] == nums[nums.length - 1]) );
    }

}
