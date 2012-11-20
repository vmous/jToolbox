/**
 * 
 */
package toolbox.design.patterns.structural.adapter;

/**
 * Target. Defines the new interface the client uses. 
 * 
 * @author billy
 *
 */
public interface Acme {

	public abstract String getFirstName();
	public abstract String getLastName();
	public abstract void setFirstName(String firstName);
	public abstract void setLastName(String lastName);

}
