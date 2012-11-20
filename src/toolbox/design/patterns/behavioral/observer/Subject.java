package toolbox.design.patterns.behavioral.observer;

/**
 * Subject. Provides an interface for attaching and detaching observer objects
 * as well as for notifying registered observer objects upon state changes.
 *
 * @author billy
 *
 */
public interface Subject {

    public abstract void registerObserver(Observer o);

    public abstract void removeObserver(Observer o);

    public abstract void notifyObserver();

}
