package toolbox.design.patterns.behavioral.mediator;

/**
 * Colleague. Each colleague class knows its mediator object and communicates
 * with it whenever it would have otherwise communicated with another colleague.
 *
 * @author billy
 *
 */
public abstract class Application {

    private final String name;
    private final Communicator communicator;

    public Application(String name, Communicator communicator) {
        this.name = name;
        this.communicator = communicator;
    }

    public String getName() {
        return name;
    }

    public Communicator getCommunicator() {
        return communicator;
    }

    public void send(String message) {
        communicator.send(message, this);
    }

    public abstract void receive(String message);

}
