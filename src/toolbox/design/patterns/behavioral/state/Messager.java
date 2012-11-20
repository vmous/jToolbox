package toolbox.design.patterns.behavioral.state;

/**
 * Context. Defines an interface of interest to clients and maintains an
 * instance of concrete state that defines the current state.
 *
 * @author billy
 *
 */
public class Messager {

    private Status status;

    public Messager() {
        status = new Offline();
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void goOnline() {
        status.connect(this);
    }

    public void goOffline() {
        status.disconnect(this);
    }

    public void sendMessage(String message) {
        status.send(message);
    }

    public String receiveMessage() {
        return status.receive();
    }

}
