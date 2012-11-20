/**
 * 
 */
package toolbox.design.patterns.structural.adapter;

/**
 * Object adapter. Adapts the interface of adaptee to the target interface.
 * The adapter contains an instance of the class it wraps.
 * 
 * @author billy
 *
 */
public class AceToAcmeObjectAdapter implements Acme {

	private Acer aceObject;
	private String firstName;
	private String lastName;
	
	/**
	 * 
	 * @param aceObject
	 */
	public AceToAcmeObjectAdapter(Acer aceObject) {
		this.aceObject = aceObject;
		firstName = this.aceObject.getName().split(" ")[0];
		lastName = this.aceObject.getName().split(" ")[1];
	}
	
	/* (non-Javadoc)
	 * @see toolbox.design.patterns.structural.adapter.Acme#getFirstName()
	 */
	@Override
	public String getFirstName() {
		return firstName;
	}

	/* (non-Javadoc)
	 * @see toolbox.design.patterns.structural.adapter.Acme#getLastName()
	 */
	@Override
	public String getLastName() {
		return lastName;
	}

	/* (non-Javadoc)
	 * @see toolbox.design.patterns.structural.adapter.Acme#setFirstName(java.lang.String)
	 */
	@Override
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/* (non-Javadoc)
	 * @see toolbox.design.patterns.structural.adapter.Acme#setLastName(java.lang.String)
	 */
	@Override
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
