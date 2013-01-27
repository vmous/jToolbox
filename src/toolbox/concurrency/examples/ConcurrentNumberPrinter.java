package toolbox.concurrency.examples;

/**
 * A simple synchronization problem of printing numbers from 1 to MAX using two
 * threads; one for even and one for odd numbers.
 *
 * @author billy
 */
public class ConcurrentNumberPrinter implements Runnable {

    public static final int MAX = 10;

    // In this implementation the two variables below should be static in order
    // to be associated with both instances of the class.
    // The lock is needed by both threads in order to be able to able to
    // wait/notify on the same lock.
    public static Object lock  = new Object();
    // Also both threads should be able to spin on the same conditional variable,
    // which in this case denotes whose turn is to write to the output.
    public static boolean isEvenTurn = false;

    private final boolean amEven;
    private final String kind;

    public ConcurrentNumberPrinter(boolean amEven) {
        this.amEven = amEven;
        this.kind = this.amEven ? "Even thread" : "Odd thread";
    }

    @Override
    public void run() {
        int i = amEven ? 2 : 1;

        while (i <= MAX) {
            if (amEven) {
                printEven(i);
            }
            else {
                printOdd(i);
            }
            i = i + 2;
        }
    }

    private void printEven(int i) {
        synchronized (lock) {
            while (!isEvenTurn) {
                try {
                    lock.wait();
                }
                catch (InterruptedException ie) {
                    ie.printStackTrace();
                }
            }

            System.out.println(kind + " " + i);
            isEvenTurn = false;
            lock.notifyAll();
        }
    }

    private void printOdd(int i) {
        synchronized (lock) {
            while (isEvenTurn) {
                try {
                    lock.wait();
                }
                catch (InterruptedException ie) {
                    ie.printStackTrace();
                }
            }

            System.out.println(kind + " " + i);
            isEvenTurn = true;
            lock.notifyAll();
        }
    }

    public static void main(String[] args) {

        Thread threadEven = new Thread(new ConcurrentNumberPrinter(true));
        Thread threadOdd = new Thread(new ConcurrentNumberPrinter(false));

        threadEven.start();
        threadOdd.start();
    }
}
