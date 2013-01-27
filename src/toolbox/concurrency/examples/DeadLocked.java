package toolbox.concurrency.examples;

/**
 * An example of a deadlock situation when two threads use nested synchronized
 * blocks to lock two objects and blocks lock the same objects but in different
 * order.
 *
 * @author billy
 */
public class DeadLocked  extends Thread {

    public static Object lock1 = new Object();
    public static Object lock2 = new Object();

    public void method1() {
        synchronized (lock1) {
            delay(500);  //some <span class="IL_AD" id="IL_AD5">operation
            System.out.println("method1: " + Thread.currentThread().getName());
            synchronized (lock2) {
                System.out.println("method1 is executing .... ");
            }
        }
    }

    public void method2() {
        synchronized (lock2) {
            delay(500);   //some operation
            System.out.println("method1: " + Thread.currentThread().getName());
            synchronized (lock1) {
                System.out.println("method2 is executing .... ");
            }
        }
    }

    @Override
    public void run() {
        method1();
        method2();
    }

    public static void main(String[] args) {
        DeadLocked thread1 = new DeadLocked();
        DeadLocked thread2 = new DeadLocked();

        thread1.start();
        thread2.start();
    }

    /**
     * The delay is to simulate some real operation happening.
     * @param timeInMillis
     */
    private void delay(long timeInMillis) {
        try {
            Thread.sleep(timeInMillis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
