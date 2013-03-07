package toolbox.brainer;

/**
 * Array brainers.
 *
 * @author billy
 */
public class Arrays {

    // -- EASY

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


    // -- MEDIUM


    /**
     * Return the number of even ints in the given array. Note: the % "mod"
     * operator computes the remainder, e.g. 5 % 2 is 1.
     *
     * @param nums
     *     The array.
     *
     * @return
     *     The number of the even numbers in the array.
     */
    public static int countEvens(int[] nums) {
        int counter = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) counter++;
        }

        return counter;
    }


    /**
     * Return the sum of the numbers in the array, returning 0 for an empty
     * array. Except the number 13 is very unlucky, so it does not count and
     * numbers that come immediately after a 13 also do not count.
     *
     * @param nums
     *     The array.
     *
     * @return
     *     The sum of the elements of the given array
     */
    public static int sum13(int[] nums) {
        int count = 0;
        boolean after13 = false;

        if (nums.length > 0) {
            for (int i = 0; i < nums.length; i++) {
                if (after13) {
                    after13 = false;
                    continue;
                }

                if (nums[i] == 13) {
                    after13 = true;
                    continue;
                }

                count += nums[i];
            }
        }

        return count;
    }


    /**
     * Given an array of ints, return true if the array contains no 1's and no
     * 3's.
     *
     * @param nums
     *     The array.
     *
     * @return
     *     {@code true} if the given array doesn't contain neither 1s nor 3s;
     *     {@code false} otherwise.
     */
    public static boolean lucky13(int[] nums) {
        boolean is = true;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1 || nums[i] == 3) {
                is = false;
                break;
            }
        }

        return is;
    }


    /**
     * Given an array of ints, return true if every element is a 1 or a 4.
     *
     * @param nums
     *     The array.
     *
     * @return
     *     {@code true} if every element of the given array are either 1 or 4;
     *     {@code false} otherwise.
     */
    public static boolean only14(int[] nums) {
        boolean is = true;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 1 && nums[i] != 4) {
                is = false;
                break;
            }
        }

        return is;
    }


    /**
     * Given an array of ints, return true if the array contains a 2 next to a
     * 2 or a 4 next to a 4, but not both.
     *
     * @param nums
     *     The array.
     *
     * @return
     *     {@code true} if there are double 2s or double 4s but not both;
     *     {@code false} otherwise.
     */
    public static boolean either24(int[] nums) {
        boolean is = false;
        boolean was2 = false;
        boolean was4 = false;
        boolean twice2 = false;
        boolean twice4 = false;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2) {
                if (was2)
                    twice2 = true;
                else
                    was2 = true;
            }
            else if (nums[i] == 4) {
                if (was4)
                    twice4 = true;
                else
                    was4 = true;
            }
            else {
                was2 = false;
                was4 = false;
            }
        }

        if (twice2 ^ twice4)
            is = true;

        return is;
    }


    /**
     * Given an array of ints, return true if there is a 1 in the array with a
     * 2 somewhere later in the array.
     *
     * @param nums
     *     The array.
     *
     * @return
     *     {@code true} if inside the given array there is 1 followed by a 2;
     *     {@code false} otherwise.
     */
    public static boolean has12(int[] nums) {
        boolean is = false;
        boolean found1 = false;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) found1 = true;

            if (nums[i] == 2 && found1) {
                is = true;
                break;
            }
        }

        return is;
    }


    /**
     * TODO: Gem
     *
     * Given an array of ints, return true if every 2 that appears in the array
     * is next to another 2.
     *
     * @param nums
     *     The array.
     *
     * @return
     *     {@code true} if every 2 that appears in the given array comes next
     *     to another 2; {@code false} otherwise.
     */
    public static boolean twoTwo(int[] nums) {
        boolean is = true;
        boolean nextIsTwo = false;
        boolean foundMate = false;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2) {
                // Found 2

                // If in previous iteration we had a two...
                if (nextIsTwo) {
                    // ... then we found some mates.
                    foundMate = true;
                }
                // set for next iteration the two
                nextIsTwo = true;
            }
            else {
                // Found some other number.

                if (nextIsTwo) {
                    // If the element next to it is a two...
                    if (foundMate) {
                        // ...either it has a mate so everything's cool and
                        // reseting flags...
                        foundMate = false;
                        nextIsTwo = false;
                    }
                    else {
                        // ...or with no mate we have a problem.
                        is = false;
                        break;
                    }
                }
            }
        }

        // Test if the last element in the array is a
        // two without a mate.
        if(nextIsTwo && !foundMate) {
            is = false;
        }

        return is;
    }


    /**
     * TODO: Gem
     *
     * Return an array that is "left shifted" by one -- so {6, 2, 5, 3} returns
     * {2, 5, 3, 6}. You may modify and return the given array, or return a new
     * array.
     *
     * @param nums
     *     The array.
     *
     * @return
     *     An array that is "left shifted" by one.
     */
    public static int[] shiftLeft(int[] nums) {
        int[] arr = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[(i + 1) % nums.length];
        }

        return arr;
    }


    /**
     * TODO: Gem
     *
     * Given a non-empty array of ints, return a new array containing the
     * elements from the original array that come after the last 4 in the
     * original array. The original array will contain at least one 4. Note
     * that it is valid in java to create an array of length 0.
     *
     * @param nums
     *     The array.
     *
     * @return
     *     A new array containing all elements from the last occurance of 4
     *     onwards.
     */
    public static int[] post4(int[] nums) {
        int[] arr;
        int pos = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 4) pos = i + 1;
        }

        arr = new int[nums.length - pos];

        for (int i = 0; i < arr.length; i++)
            arr[i] = nums[pos + i];

        return arr;
    }


    /**
     * TODO: Gem (without creating a new array)
     *
     * Return a version of the given array where all the 10's have been
     * removed. The remaining elements should shift left towards the start of
     * the array as needed, and the empty spaces a the end of the array should
     * be 0. So {1, 10, 10, 2} yields {1, 2, 0, 0}. You may modify and return
     * the given array or make a new array.
     *
     * @param nums
     *     The array.
     *
     * @return
     *
     */
    public static int[] withoutTen(int[] nums) {
        int[] arr = new int[nums.length];

        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 10) {
                arr[j] = nums[i];
                j++;
            }
        }

        for (; j < arr.length; j++) arr[j] = 0;

        return arr;
    }


    /**
     * TODO: Gem (check the initialization of max and min)
     *
     * Given an array length 1 or more of ints, return the difference between
     * the largest and smallest values in the array. Note: the built-in
     * Math.min(v1, v2) and Math.max(v1, v2) methods return the smaller or
     * larger of two values.
     *
     * @param nums
     *     The array of length 1 or more.
     *
     * @return
     *     The difference between the largest and smallest values in the array.
     */
    public static int bigDiff(int[] nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            max = Math.max(nums[i], max);
            min = Math.min(nums[i], min);
        }

        return max - min;
    }


    /**
     * Return the sum of the numbers in the array, except ignore sections of
     * numbers starting with a 6 and extending to the next 7 (every 6 will be
     * followed by at least one 7). Return 0 for no numbers.
     *
     * @param nums
     *     The array.
     *
     * @return
     *     The sum of the numbers in the given array ignoring sections 6-7.
     */
    public static int sum67(int[] nums) {
        int sum = 0;
        boolean counting = true;

        for (int i = 0; i < nums.length; i++) {
            if (counting) {
                if (nums[i] == 6) {
                    counting = false;
                    continue;
                }

                sum += nums[i];
            }
            else {
                if (nums[i] == 7) counting = true;
            }
        }

        return sum;
    }


    /**
     * Given an array of ints, return true if the sum of all the 2's in the
     * array is exactly 8.
     *
     * @param nums
     *     The array.
     *
     * @return
     *     {@code true} if the sum of all the 2's is exaxtly 8; {@code false}
     *     otherwise.
     */
    public static boolean sum28(int[] nums) {
        int sum2s = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2) sum2s += 2;
        }

        return (sum2s == 8);
    }


    /**
     * Given an array of ints, return true if it contains no 1's or it contains
     * no 4's.
     *
     * @param nums
     *     The array.
     *
     * @return
     *     {@code true} if it contains no 1s or no 4s; {@code false} otherwise.
     */
    public static boolean no14(int[] nums) {
        boolean ones = false;
        boolean fours = false;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) ones = true;
            else if (nums[i] == 4) fours = true;
        }

        return (!ones || !fours);
    }


    /**
     * Given arrays nums1 and nums2 of the same length, for every element in
     * nums1, consider the corresponding element in nums2 (at the same index).
     * Return the count of the number of times that the two elements differ by
     * 2 or less, but are not equal.
     *
     * @param nums1
     *     The first array.
     * @param nums2
     *     The second array.
     *
     * @return
     *     The number of times the two elements on the same position in each
     *     array differ by 2 or less but are not equal
     */
    public static int matchUp(int[] nums1, int[] nums2) {
        int count = 0;

        for (int i = 0; i < nums1.length; i++) {
            if (nums1[i] != nums2[i] && Math.abs(nums1[i] - nums2[i]) <= 2) {
                count++;
            }
        }

        return count;
    }


    /**
     * Given an array of ints, return true if the array contains either 3 even
     * or 3 odd values all next to each other.
     *
     * @param nums
     *     The array.
     *
     * @return
     *     {@code true} if contains 3 successive odd of even values.
     */
    public static boolean modThree(int[] nums) {
        boolean is = false;
        int countOdd = 0;
        int countEven = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0) {
                countEven = 0;
                countOdd++;
                if (countOdd == 3) {
                    is = true;
                    break;
                }
            }
            else {
                countOdd = 0;
                countEven++;
                if (countEven == 3) {
                    is = true;
                    break;
                }
            }
        }

        return is;
    }


    /**
     * TODO: Gem
     *
     * Return true if the group of N numbers at the start and end of the array
     * are the same. For example, with {5, 6, 45, 99, 13, 5, 6}, the ends are
     * the same for n=0 and n=2, and false for n=1 and n=3. You may assume that
     * n is in the range 0..nums.length inclusive.
     *
     * @param nums
     *     The array.
     * @param len
     *     The length of the group
     *
     * @return
     *     {@code true} if the the group of given length at the start and the
     *     end of the given array are the same; {@code false} otherwise.
     */
    public static boolean sameEnds(int[] nums, int len) {
        boolean is = true;

        if (len >= 0 || len <= nums.length) {
            for (int i = 0; i < len; i++) {
                if (nums[i] != nums[nums.length - len + i]) {
                    is = false;
                    break;
                }
            }

        }

        return is;
    }


    /**
     * TODO: Gem
     *
     * For each multiple of 10 in the given array, change all the values
     * following it to be that multiple of 10, until encountering another
     * multiple of 10. So {2, 10, 3, 4, 20, 5} yields
     * {2, 10, 10, 10, 20, 20}.
     *
     * @param nums
     *     The arrray.
     *
     * @return
     *     The given array with all elements following a number that is a
     *     multiple of ten, changed to that number, until the next multiple
     *     of ten is encountered.
     */
    public static int[] tenRun(int[] nums) {
        boolean isInChangeMode = false;
        int changer = 0;

        for (int i = 0; i < nums.length; i++) {
            if (isInChangeMode) {
                if (nums[i] % 10 == 0) {
                    changer = nums[i];
                }
                else {
                    nums[i] = changer;
                }
            }
            else {
                if (nums[i] % 10 == 0) {
                    isInChangeMode = true;
                    changer = nums[i];
                }
            }
        }

        return nums;
    }


    /**
     * TODO Gem
     *
     * We'll say that an element in an array is "alone" if there are values
     * before and after it, and those values are different from it. Return a
     * version of the given array where every instance of the given value which
     * is alone is replaced by whichever value to its left or right is larger.
     *
     * @param nums
     *     The array.
     * @param val
     *     The value.
     *
     * @return
     *     The given array with all the 'alone' instances of the given value in
     *     it replaced by whichever value to its left or right is larger.
     */
    public static int[] notAlone(int[] nums, int val) {
        for (int i = 1; i < nums.length - 1 ; i++) {
            if (nums[i] == val) {
                if (nums[i] != nums[i - 1] && nums[i] != nums[i + 1]) {
                    nums[i] = Math.max(nums[i - 1], nums[i + 1]);
                }
            }
        }

        return nums;
    }


    /**
     * TODO Gem
     *
     * Return a version of the given array where each zero value in the array
     * is replaced by the largest odd value to the right of the zero in the
     * array. If there is no odd value to the right of the zero, leave the
     * zero as a zero.
     *
     * @param nums
     *     The array.
     *
     * @return
     *     The version of the given array where each occurrence of a zero is
     *     replaced by the largest no odd valued to its right if available.
     */
    public static int[] zeroMax(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                int toReplace = 0;
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] % 2 != 0) {
                        toReplace = Math.max(toReplace, nums[j]);
                    }
                }
                nums[i] = toReplace;
            }
        }

        return nums;
    }

}
