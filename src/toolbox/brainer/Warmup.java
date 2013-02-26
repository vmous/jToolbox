package toolbox.brainer;

/**
 * Warm-up brainers to get started.
 *
 * @author billy
 */
public class Warmup {

    /**
     * The parameter weekday is true if it is a weekday, and the parameter
     * vacation is true if we are on vacation. We sleep in if it is not a
     * weekday or we're on vacation. Return true if we sleep in.
     *
     * @param weekday
     *     Set to {@code true} to indicate a weekday; {@code false} otherwise.
     * @param vacation
     *     Set to {@code false} to indicate a vacation; {@code false} otherwise.
     *
     * @return
     *     {@code true} if we sleep; {@code false} otherwise}.
     */
    public static boolean sleepIn(boolean weekday, boolean vacation) {
        boolean sleep = false;

        if (!weekday || vacation)
            sleep = true;

        return sleep;
    }


    /**
     * We have two monkeys, a and b, and the parameters aSmile and bSmile
     * indicate if each is smiling. We are in trouble if they are both smiling
     * or if neither of them is smiling. Return true if we are in trouble.
     *
     * @param aSmile
     *     Set to {@code true} if monkey a is smiling; {@code false} otherwise;
     * @param bSmile
     *     Set to {@code true} if monkey b is smiling; {@code false} otherwise;
     *
     * @return
     *     {@code true} if we are in trouble; {@code false} otherwise.
     */
    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        return aSmile ==  bSmile;
    }


    /**
     * Given two int values, return their sum. Unless the two values are the
     * same, then return double their sum.
     *
     * @param a
     *     The first number.
     * @param b
     *     The second number.
     *
     * @return
     *     Their sum if they are not equal or double their sum if they are.
     */
    public static int sumDouble(int a, int b) {
        return (a == b ? 2 * (a + b) : a + b);
    }


    /**
     * Given an int n, return the absolute difference between n and 21, except
     * return double the absolute difference if n is over 21.
     *
     * @param n
     *     The number.
     *
     * @return
     *     The absolute difference between n and 21 if n is smaller than 21;
     *     double absolute difference otherwise.
     */
    public static int diff21(int n) {
        int result = Math.abs(n - 21);

        if (n > 21)
            result *= 2;

        return result;
    }


    /**
     * We have a loud talking parrot. The "hour" parameter is the current hour
     * time in the range 0..23. We are in trouble if the parrot is talking and
     * the hour is before 7 or after 20. Return true if we are in trouble.
     *
     * @param talking
     *     Set to {@code true} to denote the parrot is talking; {@code false}
     *     otherwise.
     *
     * @param hour
     *     The current hour time (in the range of 0..23).
     *
     * @return
     *     {@code true} if the parrot is talking before 7 or after 20;
     *     {@code false} otherwise.
     */
    public static boolean parrotTrouble(boolean talking, int hour) {
        boolean inTrouble = false;

        if (talking && (hour < 7 || hour > 20))
            inTrouble = true;

        return inTrouble;
    }


    /**
     * Given 2 ints, a and b, return true if one of them is 10 or if their sum
     * is 10.
     *
     * @param a
     *     The first number.
     * @param b
     *     The second number.
     *
     * @return
     *     {@code true} if one of them is 10 or their sum is 10; {@code false}
     *     otherwise.
     */
    public static boolean makes10(int a, int b) {
        boolean is = false;

        if (a == 10 || b == 10 || (a + b) == 10)
            is = true;

        return is;
    }


    /**
     * Given an int n, return true if it is within 10 of 100 or 200.
     * Note: Math.abs(num) computes the absolute value of a number.
     *
     * @param n
     *     The number.
     *
     * @return
     *     {@code true} if the difference of the number to 100 or 200 is
     *     smaller or equal to 10; {@code false} otherwise.
     */
    public static boolean nearHundred(int n) {
        return ( (Math.abs(100 - n) <= 10) || (Math.abs(200 - n) <= 10) );
    }


    /**
     * Given 2 int values, return true if one is negative and one is positive.
     * Except if the parameter "negative" is true, then return true only if
     * both are negative.
     *
     * @param a
     *     The first number.
     * @param b
     *     The second number.
     * @param negative
     *     Set it to {@code true} to denote negative; {@code false} otherwise.
     *
     * @return
     *     {@code true} if one of the two given numbers are negative except if
     *     the negative parameter is {@code true} then both numbers should be
     *     negative.
     */
    public static boolean posNeg(int a, int b, boolean negative) {
        return ( negative ? (a < 0 && b < 0) : ( (a < 0 && b > 0) || (a > 0 && b < 0)) );
    }

}
