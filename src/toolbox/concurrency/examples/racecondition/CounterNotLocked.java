package toolbox.concurrency.examples.racecondition;

import java.util.HashMap;
import java.util.Map;

/**
 * All three threads or users in this implementation get assigned the same
 * value of 3 due to racing conditions. We are expecting to see three
 * different count values to be assigned from 1 to 3. What happened here
 * is that when the first thread incremented the count from 0 to 1 and
 * entered into the sleep(50) block, the second and third threads incremented
 * the counts from 1 to 2 and 2 to 3 respectively. This shows that the 2
 * operations -- the operation that increments the thread and the operation
 * that stores the incremented value in a HashMap are not atomic, and
 * produces incorrect results due to racing conditions.
 *
 * @author billy
 */
public class CounterNotLocked {

    public static class Counter {

        //shared variable or resource
        private Integer count = Integer.valueOf(0);

        private final Map<String, Integer> userToNumber = new HashMap<String, Integer>(10);

        public void increment() {
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
