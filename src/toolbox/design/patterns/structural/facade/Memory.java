/**
 * 
 */
package toolbox.design.patterns.structural.facade;

/**
 * Subsystem class. Implement subsystem functionality having no knowledge
 * of the facade.
 * 
 * @author billy
 *
 */
public class Memory {

	/**
	 * 
	 */
	public Memory() {
		// TODO Auto-generated constructor stub
	}
	
	public void load(long position, byte[] data) {
		System.out.println("Loading master boot record at address 0x" + Long.toHexString(position) + ".");
	}

}
