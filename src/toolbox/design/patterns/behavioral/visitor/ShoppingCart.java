package toolbox.design.patterns.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Object structure. Can enumerate its elements by being either a composite or a
 * collection such as a list or a set. It may provide a high-level interface to
 * allow the visitor to visit its elements.
 *
 * @author billy
 *
 */
public class ShoppingCart {

    private final List<Item> items;

    public ShoppingCart() {
        items = new ArrayList<Item>();
    }

    public void addToShoppingCart(Item item) {
        items.add(item);
    }

    public void removeFromShoppingCart(Item item) {
        items.remove(item);
    }

    public double cost() {
        Amazon amazon = new Amazon();
        System.out.println(amazon.getTotal());

        for (Item item : items) {
            item.proceed(amazon);
            System.out.println(amazon.getTotal());

        }

        return amazon.getTotal();
    }
}
