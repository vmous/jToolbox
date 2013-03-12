package toolbox.design.patterns.structural.flyweight;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for the Flyweight structural design pattern.
 *
 * @author billy
 */
public class FlyweightTest {

    private CoffeeFlavour[] flavors;
    private CoffeeOrderContext[] tables;
    private int ordersMade;
    private CoffeeFlavourFactory flavorFactory;

    @Before
    public void setUp() {
        this.flavors = new CoffeeFlavour[100];
        this.tables = new CoffeeOrderContext[100];
        this.ordersMade = 0;
        this.flavorFactory = new CoffeeFlavourFactory();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testIt() {
        takeOrders("Cappuccino", 2);
        takeOrders("Cappuccino", 2);
        takeOrders("Frappe", 1);
        takeOrders("Frappe", 1);
        takeOrders("Xpresso", 1);
        takeOrders("Frappe", 897);
        takeOrders("Cappuccino", 97);
        takeOrders("Cappuccino", 97);
        takeOrders("Frappe", 3);
        takeOrders("Xpresso", 3);
        takeOrders("Cappuccino", 3);
        takeOrders("Xpresso", 96);
        takeOrders("Frappe", 552);
        takeOrders("Cappuccino", 121);
        takeOrders("Xpresso", 121);

        for (int i = 0; i < ordersMade; i++) {
            flavors[i].serveCoffee(tables[i]);
        }

        assertEquals(3, flavorFactory.getTotalCoffeeFlavorsMade());
    }

    private void takeOrders(String flavorIn, int table) {
		flavors[ordersMade] =
			flavorFactory.getCoffeeFlavour(flavorIn);
		tables[ordersMade++] =
			new CoffeeOrderContext(table);
	}

}
