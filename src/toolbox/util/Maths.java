package toolbox.util;

/**
 * A collection of utility mathematical functions for operations that
 * cannot be handled through the standard Java library.
 *
 * @author billy
 *
 */
public class Maths {

	public Maths() {
	}

	public static void main(String[] args) {
	}

	/**
	 * A simple program to show how one must be careful with the "mod"
	 * functions in some programming languages. The point here is that
	 * one expects that for any integer a, and natural number n, one will
	 * get a "remainder" r so that
	 *       a = q*n + r
	 * for appropriate q and
	 *       0 <= r < n.
	 * This works for positive values of a, but when a is negative, the
	 * equations that hold turn out to be
	 *       a = q*n + r
	 * and
	 *      -n < r <= 0.
	 *
	 * This is unsettling. In particular, the code
	 *       a%n == b%n
	 * is not always true when a is congruent to b mod n. You need to use
	 * this:
	 *       a%n == b%n || a%n == n + b%n
	 *
	 * @param i
	 * @param j
	 *
	 * @return the modulo
	 */
	public static int modulo(int i, int j) {
		return ( i % j + j ) % j;
	}

	/**
	 * A simple program to show how one must be careful with the "mod"
	 * functions in some programming languages. The point here is that
	 * one expects that for any integer a, and natural number n, one will
	 * get a "remainder" r so that
	 *       a = q*n + r
	 * for appropriate q and
	 *       0 <= r < n.
	 * This works for positive values of a, but when a is negative, the
	 * equations that hold turn out to be
	 *       a = q*n + r
	 * and
	 *      -n < r <= 0.
	 *
	 * This is unsettling. In particular, the code
	 *       a%n == b%n
	 * is not always true when a is congruent to b mod n. You need to use
	 * this:
	 *       a%n == b%n || a%n == n + b%n
	 *
	 * @param i
	 * @param j
	 *
	 * @return the modulo
	 */
	public static int modulo(double i, double j) {
		return (int)(i - Math.floor(i/j)*j);
	}
}
