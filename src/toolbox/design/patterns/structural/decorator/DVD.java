/**
 * 
 */
package toolbox.design.patterns.structural.decorator;

/**
 * Concrete decorator. Adds responsibilities to the components.
 * 
 * @author billy
 *
 */
public class DVD extends ProductDecorator {

	public DVD(Product decoratedProduct) {
		super(decoratedProduct);
	}
	
	@Override
	public double getCost() {
		return super.getCost() + 15.50;
	}
	
	@Override
	public String getDescription() {
		return super.getDescription() + " and a dvd";
	}

}
