package toolbox.design.patterns.creational.builder;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for the Builder creational design pattern.
 *
 * @author billy
 */
public class BuilderTest {

    Cooker cooker;

    @Before
    public void setUp() {
        cooker = new Cooker();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testHamAndBaconPizza() {
        Pizza hamAndBaconPizza;
        PizzaBuilder hamAndBaconPizzaBuilder = new HamAndBaconPizzaBuilder();

        cooker.setPizzaBuilder(hamAndBaconPizzaBuilder);
        hamAndBaconPizza = cooker.preparePizza();
        assertEquals("This is a pizza with a regular dough, tomato sauce and ham and bacon topping.", hamAndBaconPizza.getDescription());
    }

    @Test
    public void testTexBbqPizza() {
        Pizza texBbqPizza;
        PizzaBuilder texBbqPizzaBuilder = new TexBbqPizzaBuilder();

        cooker.setPizzaBuilder(texBbqPizzaBuilder);
        texBbqPizza = cooker.preparePizza();
        assertEquals("This is a pizza with a multigrain dough, barbecue sauce and chicken and gouda cheese topping.", texBbqPizza.getDescription());
    }

}
