package toolbox.design.patterns.behavioral.state;

/**
 * State. Defines the interface for encapsulating the behavior associated with a
 * particular state of the context.
 *
 * @author billy
 *
 */
public interface Status {

    public abstract void connect(Messager context);

    public abstract void disconnect(Messager context);

    public abstract void send(String message);

    public abstract String receive();

}
