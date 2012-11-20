/**
 * 
 */
package toolbox.design.patterns.structural.bridge;

/**
 * Concrete implementor. Defines the concrete implementation of the interface.
 * 
 * @author billy
 *
 */
public class LG implements Television {

	/**
	 * 
	 */
	public LG() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see toolbox.design.patterns.structural.bridge.Television#on()
	 */
	@Override
	public void on() {
		System.out.println("LG specific ON operation.");

	}

	/* (non-Javadoc)
	 * @see toolbox.design.patterns.structural.bridge.Television#off()
	 */
	@Override
	public void off() {
		System.out.println("LG specific OFF operation.");

	}

	/* (non-Javadoc)
	 * @see toolbox.design.patterns.structural.bridge.Television#tuneChannel(int)
	 */
	@Override
	public void tuneChannel(int channel) {
		System.out.println("LG specific tune operation for channel " + channel + ".");
	}

}
