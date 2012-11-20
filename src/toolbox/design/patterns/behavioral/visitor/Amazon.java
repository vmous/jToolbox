package toolbox.design.patterns.behavioral.visitor;

/**
 * Concrete visitor. Implements each operation declared by visitor. Each
 * operation implements a fragment of the algorithm defined for the
 * corresponding class of object in the structure. Concrete visitor provides the
 * context for the algorithm and stores its local state. This state often
 * accumulates results during the traversal of the structure.
 *
 * @author billy
 *
 */
public class Amazon implements Checkout {

    private double total;

    public Amazon() {
        total = 0.0;
    }

    public double getTotal() {
        return total;
    }

    @Override
    public void checkout(Book book) {
        double postage = 0.0;

        // free postage for books costing over 10
        if (book.getPrice() < 5.0)
            postage = book.getWeight() * 0.02;

        total += (book.getPrice() + postage);
    }

    @Override
    public void checkout(DVD dvd) {
        double vat = 0.12;

        // if DVD is not of region 2 then it has greater VAT
        if (dvd.getRegion() != 2)
            vat = 0.22;

        total += (dvd.getPrice() * vat);

    }

}
