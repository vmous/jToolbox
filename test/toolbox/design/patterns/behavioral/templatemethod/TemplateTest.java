package toolbox.design.patterns.behavioral.templatemethod;

import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;

/**
 * Unit test for the Template Method behavioral design pattern.
 *
 * @author billy
 */
public class TemplateTest extends TestCase {

    private AutomotiveRobot automotiveRobot;

    private CookieRobot cookieRobot;

    /**
     * @throws java.lang.Exception
     */
    @Override
    @Before
    public void setUp() throws Exception {
        automotiveRobot = new AutomotiveRobot("Automotive Robot");
        cookieRobot = new CookieRobot("Cookie Robot");
    }

    /**
     * @throws java.lang.Exception
     */
    @Override
    @After
    public void tearDown() throws Exception {
    }

    public void testIt() {
        assertEquals("Automotive Robot", automotiveRobot.getName());
        automotiveRobot.go();

        System.out.println();

        assertEquals("Cookie Robot", cookieRobot.getName());
        cookieRobot.go();
    }

}
