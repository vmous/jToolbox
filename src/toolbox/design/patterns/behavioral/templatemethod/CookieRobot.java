package toolbox.design.patterns.behavioral.templatemethod;

/**
 * Concrete class. Implements the primitive operations to carry out
 * subclass-specific steps of the algorithm.
 *
 * @author billy
 *
 */
public class CookieRobot extends Robot {

    private final String name;

    public CookieRobot(String name) {
        this.name = name;
    }

    @Override
    public void getParts() {
        System.out.println("Getting flour and sugar...");
    }

    @Override
    public void assemble() {
        System.out.println("Baking a cookie...");
    }

    @Override
    public void test() {
        System.out.println("Crunching a coockie...");
    }

    public String getName() {
        return name;
    }

}
