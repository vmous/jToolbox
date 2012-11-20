/**
 * 
 */
package toolbox.design.patterns.structural.flyweight;

/**
 * Concrete flyweight. Implements the flyweight interface and adds storage for
 * intrinsic state, if any. Such object must be sharable.
 * 
 * @author billy
 *
 */
public class CoffeeFlavour implements CoffeeOrder {

	private String flavour;

	/**
	 * 
	 */
	public CoffeeFlavour(String flavour) {
		this.flavour = flavour;
	}

	/* (non-Javadoc)
	 * @see toolbox.design.patterns.structural.flyweight.CoffeeOrder#serveCoffee(toolbox.design.patterns.structural.flyweight.CoffeeOrderContext)
	 */
	@Override
	public void serveCoffee(CoffeeOrderContext context) {
		System.out.println("Serving coffee flavour " + flavour + " to table number " + context.getTable());
	}

	/**
	 * @return the flavour
	 */
	public String getFlavour() {
		return flavour;
	}

}
