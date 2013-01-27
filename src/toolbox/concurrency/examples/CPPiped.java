package toolbox.concurrency.examples;

import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;

/**
 * <ul>
 * A multi-threaded consumer/producer example program in which
 * <li> one thread generates odd numbers,
 * </li> another thread generates even numbers, and
 * <li/> a third thread receives the numbers from both and evaluates if the sum
 * is multiples of 5.
 * </ul>
 *
 * <p>
 * This implementation is based on pipes.
 * </p>
 *
 * @author billy
 */
public class CPPiped {
    private static final int MAX = 10;

    public static class NumberWriter implements Runnable {

        private final boolean amEven;
        private final PipedWriter writer;

        public NumberWriter(boolean amEven, PipedWriter writer) {
            this.amEven = amEven;
            this.writer = writer;
        }

        @Override
        public void run() {
            int i = 1;
            while (i <= MAX) {
                try {
                    if ( (amEven && (i % 2) == 0) || (!amEven && (i % 2) != 0) ) {
                        writer.write(i);
                    }

                    ++i;
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {

        PipedReader readOdd  = new PipedReader();
        PipedReader readEven = new PipedReader();

        PipedWriter writeOdd;
        PipedWriter writeEven;
        Thread threadOdd;
        Thread threadEven;

        try {
            writeOdd = new PipedWriter(readOdd);
            writeEven = new PipedWriter(readEven);

            threadOdd = new Thread(new NumberWriter(false, writeOdd));
            threadEven = new Thread(new NumberWriter(true, writeEven));

            threadOdd.start();
            threadEven.start();
        }
        catch (IOException ioe) {
            ioe.printStackTrace();
        }

        int odd =0;
        int even=0;

        try {
            while (odd != -1) {
                odd = readOdd.read();
                even = readEven.read();

                if ((odd + even) % 5 == 0) {
                    System.out.println("match found " + odd + " + " + even + " = " + (odd + even));
                }
            }

        } catch (IOException e) {
            System.exit(1);
        }

    }
}
