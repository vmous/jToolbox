package toolbox.concurrency.examples.producerconsumer;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;

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
 * This implementation is based on blocking queues (specifically with the
 * {@code SynchronousQueue<E> implementation).
 * </p>
 *
 * @author billy
 */
public class ProducerConsumerBlockingQueue {

    private static final int MAX = 100;

    private static  BlockingQueue<Integer> qOdd = new SynchronousQueue<Integer>();
    private static  BlockingQueue<Integer> qEven = new SynchronousQueue<Integer>();

    public static class NumberNQr implements Runnable {

        private final boolean amEven;
        private final BlockingQueue<Integer> q;

        public NumberNQr(boolean amEven, BlockingQueue<Integer> q) {
            this.amEven = amEven;
            this.q = q;
        }

        @Override
        public void run() {
            int i = 1;
            while (i <= MAX) {
                if ( (amEven && (i % 2) == 0) || (!amEven && (i % 2) != 0) ) {
                    try {
                        q.put(new Integer(i));
                    }
                    catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                ++i;
            }
        }

    } // class NumberWriter

    public static void main(String[] args) {

        Thread threadOdd = new Thread(new NumberNQr(false, qOdd));
        Thread threadEven = new Thread(new NumberNQr(true, qEven));

        threadOdd.start();
        threadEven.start();

        int odd = 0;
        int even = 0;
        while(odd != -1) {
            try {
                odd = qOdd.take();
                even = qEven.take();

                if ((odd + even) % 5 == 0) {
                    System.out.println("match found " + odd + " + " + even + " = " + (odd + even));
                }
            }
            catch (InterruptedException ie) {
                ie.printStackTrace();
            }
        }

    }

}
