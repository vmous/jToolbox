package toolbox.design.patterns.behavioral.strategy;

import org.junit.After;
import org.junit.Before;

import junit.framework.TestCase;

/**
 * Unit test for the Strategy behavioral design pattern.
 *
 * @author billy
 */
public class StrategyTest extends TestCase {

    private WordRallyCar impreza;

    private FormulaOne ferrari;

    private Helicopter apache;

    private JetFighter phantom;

    /**
     * @throws java.lang.Exception
     */
    @Override
    @Before
    public void setUp() throws Exception {
        impreza = new WordRallyCar();
        ferrari = new FormulaOne();
        apache = new Helicopter();
        phantom = new JetFighter();
    }

    /**
     * @throws java.lang.Exception
     */
    @Override
    @After
    public void tearDown() throws Exception {
    }

    public void testIt() {
        impreza.go();
        ferrari.go();
        apache.go();
        phantom.go();
    }

}
