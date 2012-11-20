package toolbox.design.patterns.structural.bridge;

/**
 * Implementor. Defines the interface for implementation classes. It does not
 * have to correspond exactly to abstraction's interface. Typically it provides
 * only primitive operations.
 *
 * @author billy
 *
 */
public interface Television {

    public abstract void on();

    public abstract void off();

    public abstract void tuneChannel(int channel);

}
