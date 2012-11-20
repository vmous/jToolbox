package toolbox.design.patterns.behavioral.state;

/**
 * Concrete state. Implements a behavior associated with a state of the context.
 *
 * @author billy
 *
 */
public class Online implements Status {

    public Online() {
    }

    @Override
    public void connect(Messager context) {
        System.out.println("Already connected.");
    }

    @Override
    public void disconnect(Messager context) {
        System.out.print("Disconnecting...");
        context.setStatus(new Offline());
        System.out.println("\tOK.");
    }

    @Override
    public void send(String message) {
        System.out.println("Message sent.");
    }

    @Override
    public String receive() {
        String message;
        message = "";
        System.out.println("Message received.");

        return message;
    }

}
