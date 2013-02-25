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

}
