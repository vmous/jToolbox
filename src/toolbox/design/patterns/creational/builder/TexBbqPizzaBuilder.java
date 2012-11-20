package toolbox.design.patterns.creational.builder;

/**
 * Concrete builder. Constructs, keeps track and enables the retrieval of a
 * product.
 *
 * Concrete builder.
 *
 * @author billy
 *
 */
public class TexBbqPizzaBuilder implements PizzaBuilder {

    private final Pizza pizza;

    public TexBbqPizzaBuilder() {
        pizza = new Pizza();
    }

    @Override
    public void buildDough() {
        pizza.setDough("multigrain");
    }

    @Override
    public void buildSouce() {
        pizza.setSauce("barbecue");
    }

    @Override
    public void buildTopping() {
        pizza.setTopping("chicken and gouda cheese");
    }

    @Override
    public Pizza getPizza() {
        return pizza;
    }

}
