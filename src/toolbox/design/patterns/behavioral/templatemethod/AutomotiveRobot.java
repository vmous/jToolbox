package toolbox.design.patterns.behavioral.templatemethod;

/**
 * Concrete class. Implements the primitive operations to carry out
 * subclass-specific steps of the algorithm.
 *
 * @author billy
 *
 */
public class AutomotiveRobot extends Robot {

    private final String name;

    public AutomotiveRobot(String name) {
        this.name = name;
    }

    @Override
    public void getParts() {
        System.out.println("Getting a carburetor...");
    }

    @Override
    public void assemble() {
        System.out.println("Installing a carburetor...");
    }

    @Override
    public void test() {
        System.out.println("Revving the engine...");
    }

    public String getName() {
        return name;
    }

}
