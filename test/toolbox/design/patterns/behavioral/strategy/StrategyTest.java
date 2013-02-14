package toolbox.design.patterns.behavioral.strategy;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for the Strategy behavioral design pattern.
 *
 * @author billy
 */
public class StrategyTest {

    private WordRallyCar impreza;
    private FormulaOne ferrari;
    private Helicopter apache;
    private JetFighter phantom;

    @Before
    public void setUp() {
        impreza = new WordRallyCar();
        ferrari = new FormulaOne();
        apache = new Helicopter();
        phantom = new JetFighter();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testIt() {
        impreza.go();
        ferrari.go();
        apache.go();
        phantom.go();
    }

}
