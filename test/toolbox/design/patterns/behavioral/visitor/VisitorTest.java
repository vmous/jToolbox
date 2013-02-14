package toolbox.design.patterns.behavioral.visitor;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for the Visitor behavioral design pattern.
 *
 * @author billy
 */
public class VisitorTest {

    private ShoppingCart shoppingCart;
    private Book yalom;
    private Book socrates;
    private DVD lotr;
    private DVD pi;

    @Before
    public void setUp() {
        shoppingCart = new ShoppingCart();
        yalom = new Book("The Schopenhauer Cure", 7.00, 150.0);
        socrates = new Book("Πολιτεία", 7.50, 200.0);
        lotr = new DVD("The Lord of the Rings Trilogy", 35.00, 2);
        pi = new DVD("π", 15.00, 1);
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testIt() {
        shoppingCart.addToShoppingCart(yalom);
        shoppingCart.addToShoppingCart(socrates);
        shoppingCart.addToShoppingCart(lotr);
        shoppingCart.addToShoppingCart(pi);

        assertEquals(new Double(72.0), new Double(shoppingCart.cost()));
    }

}
