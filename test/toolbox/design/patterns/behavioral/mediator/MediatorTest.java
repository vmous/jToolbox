package toolbox.design.patterns.behavioral.mediator;

import org.junit.After;
import org.junit.Before;

import junit.framework.TestCase;

/**
 * Unit test for the Mediator behavioral design pattern.
 *
 * @author billy
 */
public class MediatorTest extends TestCase {

    private ApplicationCommunicator communicator;

    private Application msn;

    private Application kopete;

    private Application mercury;

    /**
     * @throws java.lang.Exception
     */
    @Override
    @Before
    public void setUp() throws Exception {
        communicator = new ApplicationCommunicator();
        msn = new DesktopApplication("Live Messager", communicator);
        kopete = new DesktopApplication("Kopete", communicator);
        mercury = new MobileApplication("Mercury Mobile", communicator);
    }

    /**
     * @throws java.lang.Exception
     */
    @Override
    @After
    public void tearDown() throws Exception {
    }

    public void testIt() {
        communicator.addApplication(msn);
        communicator.addApplication(kopete);
        communicator.addApplication(mercury);

        msn.send("Hello from Live Messager");
        kopete.send("Hello from Kopete");
        mercury.send("Hello from Mercury");
    }

}
