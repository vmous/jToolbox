package toolbox.design.patterns.behavioral.visitor;

/**
 * Concrete element. Implements an accept operation that takes a visitor as an
 * argument.
 *
 * @author billy
 *
 */
public class DVD implements Item {

    private final String title;
    private final double price;
    private final int region;

    public DVD(String title, double price, int region) {
        this.title = title;
        this.price = price;
        this.region = region;
    }

    public double getPrice() {
        return price;
    }

    public int getRegion() {
        return region;
    }

    @Override
    public void proceed(Checkout checkout) {
        checkout.checkout(this);
    }

}
