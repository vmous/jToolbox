package toolbox.concurrency.examples.producerconsumer;

/**
 * Resolving the Producer/Consumer problem using a mutex.
 *
 * @author billy
 */
public class ProducerConsumerMutex {

    // Shared resource.
    private int count;

    public synchronized void consume() {
        while (count == 0) {
            try {
                // Wait till notified.
                wait();
            }
            catch (InterruptedException ie) {
                ie.printStackTrace();
            }
        }

        // Consume the count by decrementing it by 1.
        count--;
        System.out.println("Consumed:" + count);
        // Notify waiting threads to resume.
        notify();
    }

    public synchronized void produce() {
        while(count > 0) {
            try {
                //wait till notified.
                wait();
            }
            catch (InterruptedException ie) {
                ie.printStackTrace();
            }
        }

        // Produce the count by incrementing it by 1.
        count++;
        System.out.println("Produced: " + count);
        // Notify waiting threads to resume.
        notify();
    }

    public static void main(String[] args)  {
        // Set as final in order for inner classes to be able to access it.
        final ProducerConsumerMutex pc = new ProducerConsumerMutex();

        // Producer runnable.
        Runnable producer = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 3; i++) {
                    pc.produce();
                }
            }
        };

        // Consumer runnable.
        Runnable consumer = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 3; i++) {
                    pc.consume();
                }
            }
        };

        Thread tProd = new Thread(producer);
        Thread tCons = new Thread(consumer);

        tProd.start();
        tCons.start();
    }

}
