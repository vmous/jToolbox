package toolbox.design.patterns.structural.facade;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for the Facade structural design pattern.
 *
 * @author billy
 */
public class FacadeTest {

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testIt() {
		Computer facade = new Computer();
		facade.startComputer();
	}

}
