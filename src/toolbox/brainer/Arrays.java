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
        int[] arr = new int[2];

        arr[0] = a[1];
        arr[1] = b[1];

        return arr;
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
        int[] arr = new int[2];

        arr[0] = nums[(int) Math.floor((double) (nums.length - 1) / 2)];
        arr[1] = nums[(int) Math.ceil((double) (nums.length - 1) / 2)];

        return arr;
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
        int[] arr = new int[3];
        int mid = (nums.length - 1) / 2;

        arr[0] = nums[mid - 1];
        arr[1] = nums[mid];
        arr[2] = nums[mid + 1];

        return arr;
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


    /**
     * Given an array of ints length 3, return the sum of all the elements.
     *
     * @param nums
     *     The array of length 3.
     *
     * @return
     *     The sum of the given array's elements.
     */
    public static int sum3(int[] nums) {
        return nums[0] + nums[1] + nums[2];
    }


    /**
     * Given an array of ints length 3, figure out which is larger between the
     * first and last elements in the array, and set all the other elements to
     * be that value. Return the changed array.
     *
     * @param nums
     *     The array of length 3.
     *
     * @return
     *     The array with all its elements set to the largest value of the
     *     given element.
     */
    public static int[] maxEnd3(int[] nums) {
        int max;

        if (nums[0] < nums[nums.length - 1])
            max = nums[nums.length - 1];
        else
            max = nums[0];

        for (int i = 0; i < nums.length; i++)
            nums[i] = max;

        return nums;
    }


    /**
     * Given an array of ints, return a new array length 2 containing the first
     * and last elements from the original array. The original array will be
     * length 1 or more.
     *
     * @param nums
     *     The array of length 1.
     *
     * @return
     *     A new arrat of length 2 containing the first and last elements of
     *     the given array.
     */
    public static int[] makeEnds(int[] nums) {
        int[] arr = new int[2];

        if (nums.length > 0) {
            arr[0] = nums[0];
            arr[1] = nums[nums.length - 1];
        }

        return arr;
    }


    /**
     * Given an int array, return a new array with double the length where its
     * last element is the same as the original array, and all the other
     * elements are 0. The original array will be length 1 or more. Note: by
     * default, a new int array contains all 0's.
     *
     * @param nums
     *     The array of length 1 or more.
     *
     * @return
     *     A new array with double the size of the given array, where its last
     *     elements are is the same while first are all zero
     */
    public static int[] makeLast(int[] nums) {
        int[] arr = new int[2 * nums.length];

        if (nums.length > 0) {
            arr[2 * nums.length - 1] = nums[nums.length - 1];
        }

        return arr;
    }


    /**
     * Start with 2 int arrays, a and b, of any length. Return how many of the
     * arrays have 1 as their first element.
     *
     * @param a
     *     The first array.
     * @param b
     *     The second array.
     *
     * @return
     *     How many of the given arrays have 1 as their first element.
     */
    public static int start1(int[] a, int[] b) {
        int times = 0;

        if (a.length > 0)
            if(a[0] == 1) times++;

        if (b.length > 0)
            if(b[0] == 1) times++;

        return times;
    }


    /**
     * Given 2 int arrays, each length 2, return a new array length 4
     * containing all their elements.
     *
     * @param a
     *     The first array of length 2.
     * @param b
     *     The second array of length 2.
     *
     * @return
     *     A new array of length 4 containing all the given arrays' elements.
     */
    public static int[] plusTwo(int[] a, int[] b) {
        int[] arr = new int[4];

        if (a.length == 2 && b.length == 2) {
            for (int i = 0; i < 2; i++) {
                arr[i] = a[i];
                arr[i + 2] = b[i];
            }
        }

        return arr;
    }


    /**
     * Given an array of ints of odd length, look at the first, last, and
     * middle values in the array and return the largest. The array length
     * will be a least 1.
     *
     * @param nums
     *     The array of odd length (at least 1).
     *
     * @return
     *     The largest of the given array's first, middle or last elements.
     */
    public static int maxTriple(int[] nums) {
        int max = 0;

        if (nums.length > 0 && nums.length % 2 != 0) {
            max = nums[0];

            if (max < nums[nums.length - 1])
                max = nums[nums.length - 1];

            if (max < nums[(nums.length - 1) / 2])
                max = nums[(nums.length - 1) / 2];
        }

        return max;
    }


    /**
     * TODO: Gem
     *
     * Given 2 int arrays, a and b, return a new array length 2 containing, as
     * much as will fit, the elements from a followed by the elements from b.
     * The arrays may be any length, including 0, but there will be 2 or more
     * elements available between the 2 arrays.
     *
     * @param a
     *     The first array.
     * @param b
     *     The second array.
     *
     * @return
     *     A new array of length 2 containing as much as possible of the
     *     elements of a followed by elements of b.
     */
    public static int[] make2(int[] a, int[] b) {
        int[] arr = new int[2];

        int j = 0;
        boolean aTurn = (j == a.length ? false : true);
        for (int i = 0; i < arr.length; i++) {
            if (aTurn) {
                if (j < a.length) {
                    arr[i] = a[j];
                    j++;
                    if(j == a.length) {
                        aTurn = false;
                        j = 0;
                    }
                }
            }
            else {
                if (j < b.length) {
                    arr[i] = b[j];
                    j++;
                }
            }
        }

        return arr;
    }


    /**
     * Return an int array length 3 containing the first 3 digits of
     * pi, {3, 1, 4}.
     *
     * @return
     *     A new array of length 3 containing the first 3 digits of pi.
     */
    public static int[] makePi() {
        return new int[]{3, 1, 4};
    }


    /**
     * TODO: Gem
     *
     * Given an array of ints length 3, return an array with the elements
     * "rotated left" so {1, 2, 3} yields {2, 3, 1}.
     *
     * @param nums
     *     The array of length 3.
     *
     * @return
     *     An array with the elements rotated left.
     */
    public static int[] rotateLeft3(int[] nums) {
        int[] arr = new int[3];

        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[(i + 1) % 3];
        }

        return arr;
    }


    /**
     * Given an array of ints, return the sum of the first 2 elements in the
     * array. If the array length is less than 2, just sum up the elements that
     * exist, returning 0 if the array is length 0.
     *
     * @param nums
     *     The array.
     *
     * @return
     *     The sum of the first two elements in the array.
     */
    public static int sum2(int[] nums) {
        int sum = 0;

        if (nums.length > 1)
            sum = nums[0] + nums[1];
        else if (nums.length == 1)
            sum = nums[0];

        return sum;
    }


    /**
     * Given an int array length 2, return true if it contains a 2 or a 3.
     *
     * @param nums
     *     The array of length 2.
     *
     * @return
     *     {@code true} if the array contains a 2 or a 3. {@code false}
     *     otherwise.
     */
    public static boolean has23(int[] nums) {
        boolean is = false;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2 || nums[i] == 3) {
                is = true;
                break;
            }
        }

        return is;
    }


    /**
     * Given an int array, return true if the array contains 2 twice, or 3
     * twice. The array will be length 0, 1, or 2.
     *
     * @param nums
     *     The array.
     *
     * @return
     *     {@code true} if the array contains 2 or 3 twice; {@code false}
     *     otherwise.
     */
    public static boolean double23(int[] nums) {
        boolean is = false;
        boolean found2 = false;
        boolean found3 = false;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2) {
                if (found2) {
                    is = true;
                    break;
                }
                else {
                    found2 = true;
                }
            }
            else if (nums[i] == 3) {
                if (found3) {
                    is = true;
                    break;
                }
                else {
                    found3 = true;
                }
            }
        }

        return is;
    }


    /**
     * Given an array of ints, swap the first and last elements in the array.
     * Return the modified array. The array length will be at least 1.
     *
     * @param nums
     *     The array.
     *
     * @return
     *     The given array with the first and last elements swapped.
     */
    public static int[] swapEnds(int[] nums) {
        if (nums.length > 0) {
            int tmp = nums[nums.length - 1];
            nums[nums.length - 1] = nums[0];
            nums[0] = tmp;
        }

        return nums;
    }


    /**
     * Given an int array of any length, return a new array of its first 2
     * elements. If the array is smaller than length 2, use whatever elements
     * are present.
     *
     * @param nums
     *     The array.
     *
     * @return
     *     A new array with the given array's first 2 elements. If the given
     *     array is smaller that length 2 return the elements available.
     */
    public static int[] frontPiece(int[] nums) {
        int[] arr;

        if (nums.length > 1) {
            arr = new int[2];
            arr[0] = nums[0];
            arr[1] = nums[1];
        }
        else if (nums.length == 1) {
            arr = new int[1];
            arr[0] = nums[0];
        }
        else {
            arr = new int[0];
        }

        return arr;
    }


    /**
     * Given 2 int arrays, a and b, of any length, return a new array with the
     * first element of each array. If either array is length 0, ignore that
     * array.
     *
     * @param a
     *     The first array.
     * @param b
     *     The second array.
     *
     * @return
     *     A new array with the first elements of each of the given array.
     */
    public static int[] front11(int[] a, int[] b) {
        int[] arr;

        if(a.length > 0) {
            if (b.length > 0) {
                arr = new int[2];
                arr[0] = a[0];
                arr[1] = b[0];
            }
            else {
                arr = new int[1];
                arr[0] = a[0];
            }
        }
        else if (b.length > 0) {
            arr = new int[1];
            arr[0] = b[0];
        }
        else {
            arr = new int[0];
        }

        return arr;
    }

}
