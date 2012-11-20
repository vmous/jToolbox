package toolbox.design.patterns.structural.adapter;

/**
 * Concrete adaptee. Implements an existing interface that needs adapting.
 *
 * @author billy
 *
 */
public class Acer implements Ace {

    private String name;

    public Acer() {
        name = "";
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

}
