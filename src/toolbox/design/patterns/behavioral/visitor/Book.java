package toolbox.design.patterns.behavioral.visitor;

/**
 * Concrete element. Implements an accept operation that takes a visitor as an
 * argument.
 *
 * @author billy
 *
 */
public class Book implements Item {

    private final String title;
    private final double price;
    private final double weight;

    public Book(String title, double price, double weight) {
        this.title = title;
        this.price = price;
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public void proceed(Checkout checkout) {
        checkout.checkout(this);
    }

}
