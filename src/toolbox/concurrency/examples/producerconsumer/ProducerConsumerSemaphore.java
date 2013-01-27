package toolbox.concurrency.examples.producerconsumer;

import java.util.concurrent.Semaphore;

/**
 * Resolving the Producer/Consumer problem using semaphores.
 *
 * @author billy
 */
public class ProducerConsumerSemaphore {

    private int count;

    static Semaphore semCon = new Semaphore(0);
    // Start with one permit in order for the producer to produce and, thus,
    // initiate the process.
    static Semaphore semProd = new Semaphore(1);

    public  void consume() {
        try {
            // Acquire a permit before continuing...
            semCon.acquire();
        }
        catch (InterruptedException ie) {
            ie.printStackTrace();
        }

        count--;
        System.out.println("Consumed:" + count);
        // Releases the permit, returning it to the semaphore.
        semProd.release();
    }

    public void produce() {
        try {
            // Acquire a permit before continuing...
            semProd.acquire();
        }
        catch (InterruptedException ie) {
            ie.printStackTrace();
        }

        count++;
        System.out.println("Produced: " + count);
        // Releases the permit, returning it to the semaphore.
        semCon.release();
    }

    public static void main(String[] args)  {
        final ProducerConsumerSemaphore pc = new ProducerConsumerSemaphore();

        // Producer runnnable.
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
