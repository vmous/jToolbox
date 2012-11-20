package toolbox.design.patterns.behavioral.mediator;

/**
 * Mediator. Defines an interface for communicating with colleague objects.
 *
 * @author billy
 *
 */
public interface Communicator {

    public abstract void send(String message, Application application);

}
