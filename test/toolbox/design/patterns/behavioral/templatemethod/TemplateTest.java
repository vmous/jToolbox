package toolbox.design.patterns.behavioral.templatemethod;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for the Template Method behavioral design pattern.
 *
 * @author billy
 */
public class TemplateTest {

    private AutomotiveRobot automotiveRobot;
    private CookieRobot cookieRobot;

    @Before
    public void setUp() throws Exception {
        automotiveRobot = new AutomotiveRobot("Automotive Robot");
        cookieRobot = new CookieRobot("Cookie Robot");
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testIt() {
        assertEquals("Automotive Robot", automotiveRobot.getName());
        automotiveRobot.go();

        System.out.println();

        assertEquals("Cookie Robot", cookieRobot.getName());
        cookieRobot.go();
    }

}
