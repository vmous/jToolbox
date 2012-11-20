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
public class Monitor extends ProductDecorator {

	public Monitor(Product decoratedProduct) {
		super(decoratedProduct);
	}
	
	@Override
	public double getCost() {
		return super.getCost() + 237.65;
	}
	
	@Override
	public String getDescription() {
		return super.getDescription() + " and a monitor";
	}

}
