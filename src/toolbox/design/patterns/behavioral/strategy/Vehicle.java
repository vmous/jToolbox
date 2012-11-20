package toolbox.design.patterns.behavioral.strategy;

/**
 * Context. Maintains a reference to a strategy object. It may also define an
 * interface that lets strategy access its data.
 *
 * @author billy
 *
 */
public abstract class Vehicle {

    private GoStrategy goStrategy;

    public Vehicle() {
    }

    public void setGoStrategy(GoStrategy goStrategy) {
        this.goStrategy = goStrategy;
    }

    public void go() {
        goStrategy.go();
    }

}
