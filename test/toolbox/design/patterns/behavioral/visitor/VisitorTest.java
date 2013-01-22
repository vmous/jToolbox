package toolbox.design.patterns.behavioral.visitor;

import org.junit.After;
import org.junit.Before;

import junit.framework.TestCase;

/**
 * Unit test for the Visitor behavioral design pattern.
 *
 * @author billy
 */
public class VisitorTest extends TestCase {

    private ShoppingCart shoppingCart;

    private Book yalom;

    private Book socrates;

    private DVD lotr;

    private DVD pi;

    /**
     * @throws java.lang.Exception
     */
    @Override
    @Before
    public void setUp() throws Exception {
        shoppingCart = new ShoppingCart();
        yalom = new Book("The Schopenhauer Cure", 7.00, 150.0);
        socrates = new Book("Πολιτεία", 7.50, 200.0);
        lotr = new DVD("The Lord of the Rings Trilogy", 35.00, 2);
        pi = new DVD("π", 15.00, 1);
    }

    /**
     * @throws java.lang.Exception
     */
    @Override
    @After
    public void tearDown() throws Exception {
    }

    public void testIt() {
        shoppingCart.addToShoppingCart(yalom);
        shoppingCart.addToShoppingCart(socrates);
        shoppingCart.addToShoppingCart(lotr);
        shoppingCart.addToShoppingCart(pi);

        assertEquals(72.0, shoppingCart.cost());
    }

}
