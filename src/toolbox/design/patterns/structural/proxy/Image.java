/**
 * 
 */
package toolbox.design.patterns.structural.proxy;

import java.util.Date;

/**
 * Subject. Defines a common interface for real subject and proxy so that
 * a proxy can be used anywhere a real subject is expected.
 * 
 * @author billy
 *
 */
public abstract class Image {

	protected String filename;

	public void displayImage() {
		System.out.println("Displaying image " + filename + " (" + new Date() + ")");
	}

}
