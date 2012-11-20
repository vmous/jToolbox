package toolbox.design.patterns.creational.builder;

/**
 * Director. Constructs a product using the builder interface.
 * 
 * @author billy
 * 
 */
public class Cooker {

    private PizzaBuilder pizzaBuilder;

    public Cooker() {
    }

    public void setPizzaBuilder(PizzaBuilder pizzaBuilder) {
        this.pizzaBuilder = pizzaBuilder;
    }

    public Pizza preparePizza() {
        pizzaBuilder.buildDough();
        pizzaBuilder.buildSouce();
        pizzaBuilder.buildTopping();

        return pizzaBuilder.getPizza();
    }

}
