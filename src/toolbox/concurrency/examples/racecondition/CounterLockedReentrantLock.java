package toolbox.concurrency.examples.racecondition;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * <p>
 * The JavaSE 5 introduced {@code Lock}s, which can be used in place of
 * synchronized blocks, and offer more flexible locking scenarios (i.e.,
 * a thread can unlock multiple locks it holds in a different order than the
 * locks were obtained.
 * </p>
 *
 * <p>
 * In Java, synchronized blocks are called reentrant, because if a thread
 * obtains the lock for a synchronized block,the thread can enter other code
 * blocks synchronized on the same lock object. This implementation uses a
 * {@code ReentrantLock}. The order of the output cannot be guaranteed but the
 * numbers will always be correct.
 * </p>
 *
 * @author billy
 */
public class CounterLockedReentrantLock {

    public static class Counter {

        //shared variable or resource
        private Integer count = Integer.valueOf(0);

        private final Map<String, Integer> userToNumber = new HashMap<String, Integer>(10);

        // a lock
        private final Lock lock = new ReentrantLock();

        public void increment() {
            try {
                lock.lock();
                try {
                    // Increment the counter.
                    count = count + 1;   // operation 1
                    // To imitate other operations and to make the racing condition
                    // to occur more often for the demo.
                    Thread.sleep(50);
                    Thread thread = Thread.currentThread();
                    userToNumber.put(thread.getName(), count); // operation 2
                }
                finally {
                    // Finally is executed even if an exception is thrown.
                    lock.unlock();
                }
            }
            catch (InterruptedException ie) {
                ie.printStackTrace();
            }
        }

        public Integer getCount(String name) {
            return userToNumber.get(name);
        }

    } // class Counter


    public static class CountingTask implements Runnable {

        private final Counter counter;

        public CountingTask(Counter counter) {
            super();
            this.counter = counter;
        }

        @Override
        public void run() {
            counter.increment();
            Thread thread = Thread.currentThread();
            System.out.println(thread.getName() + " value is " + counter.getCount(thread.getName()));
        }

    } // class CountingTask

    public static void main(String[] args) {
        // Create an instance of the Counter
        Counter counter = new Counter();
        // Pass the counter to the runnable CountingTask
        CountingTask task = new CountingTask(counter);

        // Create 10 user threads (non-daemon) from the main thread that share
        // the counter object
        Thread thread1 = new Thread(task, "User-1");
        Thread thread2 = new Thread(task, "User-2");
        Thread thread3 = new Thread(task, "User-3");

        //start the threads
        thread1.start();
        thread2.start();
        thread3.start();
    }

}
