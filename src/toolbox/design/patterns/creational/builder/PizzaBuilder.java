package toolbox.design.patterns.creational.builder;

/**
 * Abstract builder. Specifies the interface used by the director to create the
 * product.
 *
 * @author billy
 *
 */
public interface PizzaBuilder {

    public abstract void buildDough();

    public abstract void buildSouce();

    public abstract void buildTopping();

    public abstract Pizza getPizza();

}
