package toolbox.concurrency.examples.racecondition;

import java.util.HashMap;
import java.util.Map;

/**
 * Method level synchronization. This is the simplest. The {@code increment()}
 * method is synchronized, so that only one thread at a time can obtain its
 * lock and execute it.
 *
 * @author billy
 */
public class CounterLockedSyncMethod {

    public static class Counter {

        //shared variable or resource
        private Integer count = Integer.valueOf(0);

        private final Map<String, Integer> userToNumber = new HashMap<String, Integer>(10);

        public synchronized void increment() {
            try {
                // Increment the counter.
                count = count + 1;
                // To imitate other operations and to make the racing condition
                // to occur more often for the demo.
                Thread.sleep(50);
                Thread thread = Thread.currentThread();
                userToNumber.put(thread.getName(), count);
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
