package toolbox.design.patterns.creational.builder;

/**
 * Product. Represent the complex object under construction.
 *
 * @author billy
 *
 */
public class Pizza {

    public String dough;
    public String sauce;
    public String topping;

    public Pizza() {
        dough = "";
        sauce = "";
        topping = "";
    }

    public void setDough(String dough) {
        this.dough = dough;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }

    public String getDescription() {
        return "This is a pizza with a " + dough + " dough, " + sauce
                + " sauce and " + topping + " topping.";
    }

}
