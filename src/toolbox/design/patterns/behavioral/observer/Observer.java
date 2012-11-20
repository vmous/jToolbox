package toolbox.design.patterns.behavioral.observer;

/**
 * Observer. Defines an updating interface for objects that should should be
 * notified of changes in a subject.
 *
 * @author billy
 *
 */
public interface Observer {

    public abstract void update(String operation, String record);

}
