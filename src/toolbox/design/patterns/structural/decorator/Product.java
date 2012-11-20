/**
 * 
 */
package toolbox.design.patterns.structural.decorator;

/**
 * Component. Defines the interface of objects that can have responsibilities
 * added to them dynamically.
 * 
 * @author billy
 *
 */
public interface Product {

	public abstract double getCost();
	public abstract String getDescription();

}
