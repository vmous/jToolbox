package toolbox.design.patterns.behavioral.templatemethod;

/**
 * Abstract class. Defines abstract primitive operations that concrete
 * subclasses define to implement steps of an algorithm. It also implements a
 * template method defining the skeleton of an algorithm. The template method
 * calls primitive operations as well as operations defined in abstract class or
 * those of other objects.
 *
 * @author billy
 *
 */
public abstract class Robot {

    public Robot() {
    }

    public final void go() {
        start();
        getParts();
        assemble();
        test();
        stop();
    }

    public void start() {
        System.out.println("Starting...");
    }

    public void getParts() {
        System.out.println("Getting parts...");
    }

    public void assemble() {
        System.out.println("Assembling...");
    }

    public void test() {
        System.out.println("Testing...");
    }

    public void stop() {
        System.out.println("Stopping...");
    }

}
