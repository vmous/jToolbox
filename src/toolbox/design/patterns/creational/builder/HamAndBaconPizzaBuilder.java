package toolbox.design.patterns.creational.builder;

/**
 * Concrete builder. Constructs, keeps track and enables the retrieval of a
 * product.
 *
 * @author billy
 *
 */
public class HamAndBaconPizzaBuilder implements PizzaBuilder {

    private final Pizza pizza;

    public HamAndBaconPizzaBuilder() {
        pizza = new Pizza();
    }

    @Override
    public void buildDough() {
        pizza.setDough("regular");
    }

    @Override
    public void buildSouce() {
        pizza.setSauce("tomato");
    }

    @Override
    public void buildTopping() {
        pizza.setTopping("ham and bacon");
    }

    @Override
    public Pizza getPizza() {
        return pizza;
    }

}
