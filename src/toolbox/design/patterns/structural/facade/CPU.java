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
public class CPU {

	/**
	 * 
	 */
	public CPU() {
		// TODO Auto-generated constructor stub
	}
	
	public void freeze() {
		System.out.println("Freezing CPU.");
	}

	public void jump(long position) {
		System.out.println("Jumping to position 0x" + Long.toHexString(position) + ".");
	}

	public void execute() {
		System.out.println("Executing.");
	}

}
