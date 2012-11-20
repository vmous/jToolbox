/**
 * 
 */
package toolbox.design.patterns.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

/**
 * Flyweight factory. Creates and manages flyweight objects. When a client
 * requests a flyweight, the flyweight factory object supplies an existing
 * instance or creates one, if none exists.
 * 
 * @author billy
 *
 */
public class CoffeeFlavourFactory {

	List<CoffeeFlavour> flavours = new ArrayList<CoffeeFlavour>();

	/**
	 * 
	 */
	public CoffeeFlavourFactory() {
		// TODO Auto-generated constructor stub
	}

	public CoffeeFlavour getCoffeeFlavour(String flavour) {
		for (CoffeeFlavour f : flavours)
			if (flavour.equals(f.getFlavour()))
				return f;

		CoffeeFlavour f = new CoffeeFlavour(flavour);
		flavours.add(f);
		return f;
	}

	public int getTotalCoffeeFlavorsMade() {
		return flavours.size();
	}
}
