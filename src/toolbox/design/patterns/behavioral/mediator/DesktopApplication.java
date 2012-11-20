package toolbox.design.patterns.behavioral.mediator;

/**
 * Concrete colleague.
 *
 * @author billy
 *
 */
public class DesktopApplication extends Application {

    public DesktopApplication(String name, Communicator communicator) {
        super(name, communicator);
    }

    @Override
    public void receive(String message) {
        System.out.println(getName() + " received (via Ethernet): " + message);
    }

}
