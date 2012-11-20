package toolbox.design.patterns.behavioral.mediator;

import java.util.ArrayList;

/**
 * Concrete mediator. Maintains a list of its colleagues and implements
 * cooperative operation by coordinating these objects.
 *
 * @author billy
 *
 */
public class ApplicationCommunicator implements Communicator {

    private final ArrayList<Application> applications;

    public ApplicationCommunicator() {
        applications = new ArrayList<Application>();
    }

    @Override
    public void send(String message, Application originator) {
        for (Application application : applications)
            if (application != originator)
                application.receive(message);
    }

    public void addApplication(Application application) {
        applications.add(application);
    }

}
