/**
 * 
 */
package toolbox.design.patterns.structural.flyweight;

/**
 * Context. The extrinsic state which concrete flyweight objects act upon.
 * 
 * @author billy
 *
 */
public class CoffeeOrderContext {

	private int table;

	/**
	 * 
	 */
	public CoffeeOrderContext(int table) {
		this.table = table;
	}

	/**
	 * @return the table
	 */
	public int getTable() {
		return table;
	}

}
