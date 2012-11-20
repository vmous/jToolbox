package toolbox.design.patterns.behavioral.state;

/**
 * Concrete state. Implements a behavior associated with a state of the context.
 *
 * @author billy
 *
 */
public class Offline implements Status {

    public Offline() {
    }

    @Override
    public void connect(Messager context) {
        System.out.print("Connecting...");
        context.setStatus(new Online());
        System.out.println("\tOK.");
    }

    @Override
    public void disconnect(Messager context) {
        System.out.println("Already disconnected.");
    }

    @Override
    public void send(String message) {
        System.out.println("Cannot send message while offline.");
    }

    @Override
    public String receive() {
        System.out.println("Cannot receive message while offline.");
        return null;
    }

}
