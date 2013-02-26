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


    /**
     * Given a string, return a new string where "not " has been added to the
     * front. However, if the string already begins with "not", return the
     * string unchanged. Note: use .equals() to compare 2 strings.
     *
     * @param str
     *     The string to manipulate
     *
     * @return
     *     Return new string with "not" in the front unless there is already a
     *     "not" in the from, so it returns the string as is.
     */
    public static String notString(String str) {
        return ( (str.startsWith("not ") || str.startsWith("not")) ? str : ("not " + str) );
    }

    /**
     * Given a non-empty string and an int n, return a new string where the
     * char at index n has been removed. The value of n will be a valid index
     * of a char in the original string (i.e. n will be in the range
     * 0..str.length()-1 inclusive).
     *
     * @param str
     *     The string.
     * @param n
     *     The index to be removed.
     *
     * @return
     *     The string without the character in position n.
     */
    public static String missingChar(String str, int n) {
        return str.substring(0, n) + str.substring(n + 1);
    }


    /**
     * Given a string, return a new string where the first and last chars have
     * been exchanged.
     *
     * @param str
     *     The string.
     *
     * @return
     *     A new String with the first and last characters swapped.
     */
    public static String frontBack(String str) {
        char[] c = str.toCharArray();

        if (c.length == 0)
            return "";

        char tmp = c[c.length - 1];
        c[c.length - 1] = c[0];
        c[0] = tmp;

        return new String(c);
    }


    /**
     * Given a string, we'll say that the front is the first 3 chars of the
     * string. If the string length is less than 3, the front is whatever is
     * there. Return a new string which is 3 copies of the front.
     *
     * @param str
     *     The string.
     *
     * @return
     *     A string with 3 copies of the front.
     */
    public static String front3(String str) {
        String front;
        if (str.length() < 3)
            front = str;
        else
            front = str.substring(0, 3);

        return front + front + front;
    }


    /**
     * Given a string, take the last char and return a new string with the
     * last char added at the front and back, so "cat" yields "tcatt". The
     * original string will be length 1 or more.
     *
     * @param str
     *     The string.
     *
     * @return
     *     A string with the last character added to the front and back.
     */
    public static String backAround(String str) {
        String result;

        if (str.length() > 0) {
            char c = str.toCharArray()[str.length() - 1];
            result = c + str + c;
        }
        else {
            result = "";
        }

        return result;
    }


    /**
     * Given a string, take the first 2 chars and return the string with the 2
     * chars added at both the front and back, so "kitten" yields "kikittenki".
     * If the string length is less than 2, use whatever chars are there.
     *
     * @param str
     *     The string.
     *
     * @return
     *     The given string with the 2 first two chars added to the start and
     *     the end.
     */
    public static String front22(String str) {
        String result;
        String extra;
        char[] c;

        if (str.length() >= 2) {
            c = str.toCharArray();
            extra = c[0] + "" + c[1] + "";
        }
        else if (str.length() == 1) {
            c = str.toCharArray();
            extra = c[0] + "";
        }
        else {
            extra = "";
        }

        result = extra + str + extra;

        return result;
    }


    /**
     * Given a string, return true if the string starts with "hi" and
     * false otherwise.
     *
     * @param str
     *     The string.
     *
     * @return
     *     {@code true} if the string starts with "hi"; {@code false}
     *     otherwise.
     */
    public static boolean startHi(String str) {
        if (str.length() < 2) return false;

        String firstTwo = str.substring(0, 2);

        return(firstTwo.equals("hi"));

        // Or just use the library function.
//        return str.startsWith("hi");
    }


    /**
     * Given two temperatures, return true if one is less than 0 and the other
     * is greater than 100.
     *
     * @param temp1
     *     The first temperature.
     * @param temp2
     *     The second temperature.
     *
     * @return
     *     {@code true} if one is less than 0 and the other is greater than
     *     100; {@code false} otherwise.
     */
    public static boolean icyHot(int temp1, int temp2) {
        return ( (temp1 < 0 && temp2 > 100) ||  (temp1 > 100 && temp2 < 0) );
    }


    /**
     * Given 2 int values, return true if either of them is in the range 10..20 inclusive.
     *
     * @param a
     *     The first value.
     * @param b
     *     The second value.
     *
     * @return
     *     {@code true} if either of then is between 10 to 20 inclusive.
     */
    public static boolean in1020(int a, int b) {
        return ( (a >= 10 && a <= 20) || (b >= 10 && b <= 20) );
    }


    /**
     * We'll say that a number is "teen" if it is in the range 13..19
     * inclusive. Given 3 int values, return true if 1 or more of them are
     * teen.
     *
     * @param a
     *     The first age.
     * @param b
     *     The second age.
     * @param c
     *     The third age.
     *
     * @return
     *     {@code true} if one or more ages are between 13 and 19 inclusive;
     *     {@code false} otherwise.
     */
    public static boolean hasTeen(int a, int b, int c) {
        return ( (a >= 13 && a <= 19) || (b >= 13 && b <= 19) || (c >= 13 && c <= 19) );
    }


    /**
     * We'll say that a number is "teen" if it is in the range 13..19
     * inclusive. Given 2 int values, return true if one or the other is teen,
     * but not both.
     *
     * @param a
     *     The first age.
     * @param b
     *     The second age.
     *
     * @return
     *     {@code true} if one of the two ages are teen, but not both;
     */
    public static boolean loneTeen(int a, int b) {
        return ( ( (a >= 13 && a <= 19) && !(b >= 13 && b <= 19) ) || ( !(a >= 13 && a <= 19) && (b >= 13 && b <= 19) ) );
    }


    /**
     * Given a string, if the string "del" appears starting at index 1, return
     * a string where that "del" has been deleted. Otherwise, return the string
     * unchanged.
     *
     * @param str
     *     The string.
     *
     * @return
     *     The string with any "del" sequence starting at index 1 deleted.
     */
    public static String delDel(String str) {
        if ( (str.length() < 4) || !(str.substring(1, 4).equals("del")) ) {
            return str;
        }
        else {
            return str.substring(0, 1) + str.substring(4, str.length());
        }
    }


    /**
     * Return true if the given string begins with "mix", except the 'm' can be
     * anything, so "pix", "9ix" .. all count.
     *
     * @param str
     *     The string.
     *
     * @return
     *     {@code true} if the string starts with *ix.
     */
    public static boolean mixStart(String str) {
        if (str.length() < 3) {
            return false;
        }

        if (str.charAt(1) == 'i' && str.charAt(2) == 'x')
            return true;
        else
            return false;
    }

}
