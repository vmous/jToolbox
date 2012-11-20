/**
 * 
 */
package toolbox.design.patterns.structural.decorator;

/**
 * Decorator. Maintains a reference to a component object and defines
 * an interface that conforms to its interface. 
 * 
 * Decorator.
 * 
 * @author billy
 *
 */
public abstract class ProductDecorator implements Product {
	protected final Product decoratedProduct;
	
	public ProductDecorator(Product decoratedProduct) {
		this.decoratedProduct = decoratedProduct;
	}
	
	@Override
	public double getCost() {
		return decoratedProduct.getCost();
	}
	
	@Override
	public String getDescription() {
		return decoratedProduct.getDescription();
	}

}
