package toolbox.design.patterns.behavioral.mediator;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for the Mediator behavioral design pattern.
 *
 * @author billy
 */
public class MediatorTest {

    private ApplicationCommunicator communicator;
    private Application msn;
    private Application kopete;
    private Application mercury;

    @Before
    public void setUp() {
        communicator = new ApplicationCommunicator();
        msn = new DesktopApplication("Live Messager", communicator);
        kopete = new DesktopApplication("Kopete", communicator);
        mercury = new MobileApplication("Mercury Mobile", communicator);
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testIt() {
        communicator.addApplication(msn);
        communicator.addApplication(kopete);
        communicator.addApplication(mercury);

        msn.send("Hello from Live Messager");
        kopete.send("Hello from Kopete");
        mercury.send("Hello from Mercury");
    }

}
