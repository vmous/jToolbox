/**
 * 
 */
package toolbox.design.patterns.structural.bridge;

/**
 * Abstraction. Defines the abstraction's interface and maintains a
 * reference to an implementor typed object. Abstraction and refined
 * abstraction typically define higher-level operation based on the
 * primitives given by the implementor.
 * 
 * @author billy
 *
 */
public abstract class Controller {

	private Television tv;

	/**
	 * 
	 */
	public Controller(Television tv) {
		this.tv = tv;
	}

	public void turnOn() {
		tv.on();
	}
	
	public void turnOff() {
		tv.off();
	}
	
	public void setChannel(int channel) {
		tv.tuneChannel(channel);
	}
}
