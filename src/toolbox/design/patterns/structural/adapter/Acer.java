/**
 * 
 */
package toolbox.design.patterns.structural.adapter;

/**
 * Concrete adaptee. Implements an existing interface that needs adapting.
 * 
 * @author billy
 *
 */
public class Acer implements Ace {

	private String name;
	
	/**
	 * 
	 */
	public Acer() {
		name = "";
	}

	/* (non-Javadoc)
	 * @see toolbox.design.patterns.structural.adapter.Ace#getName()
	 */
	@Override
	public String getName() {
		return name;
	}

	/* (non-Javadoc)
	 * @see toolbox.design.patterns.structural.adapter.Ace#setName(java.lang.String)
	 */
	@Override
	public void setName(String name) {
		this.name = name;
	}

}
