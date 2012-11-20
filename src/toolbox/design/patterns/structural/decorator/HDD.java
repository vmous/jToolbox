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
public class HDD extends ProductDecorator {

	public HDD(Product decoratedProduct) {
		super(decoratedProduct);
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return super.getCost() + 79.99;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return super.getDescription() + " and a hdd";
	}

}
