package toolbox.concurrency.examples;

/**
 * A simple synchronization problem of printing numbers from 1 to MAX using two
 * threads; one for even and one for odd numbers.
 *
 * @author billy
 */
public class ConcurrentNumberPrinter implements Runnable {

    public static final int MAX = 10;
    // This should be static in order all threads to share it and thus be
    // able to wait/notify on the same lock!
    static Object lock  = new Object();

    private final boolean amEven;
    private final String kind;
    public static boolean isEvenTurn = false;

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
                catch (InterruptedException e) {
                    e.printStackTrace();
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
                catch (InterruptedException e) {
                    e.printStackTrace();
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
