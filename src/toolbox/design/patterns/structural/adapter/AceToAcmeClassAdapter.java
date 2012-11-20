/**
 * 
 */
package toolbox.design.patterns.structural.adapter;

/**
 * Class adapter. Adapts the interface of adaptee to the target interface.
 * The adapter extends the adaptee and implements the target interface.
 * 
 * @author billy
 *
 */
public class AceToAcmeClassAdapter extends Acer implements Acme {

	private String firstName;
	private String lastName;
	
	/**
	 * 
	 */
	public AceToAcmeClassAdapter() {
		firstName = "";
		lastName = "";
	}

	/* (non-Javadoc)
	 * @see toolbox.design.patterns.structural.adapter.Acme#getFirstName()
	 */
	@Override
	public String getFirstName() {
		return getName().split(" ")[0];
	}

	/* (non-Javadoc)
	 * @see toolbox.design.patterns.structural.adapter.Acme#getLastName()
	 */
	@Override
	public String getLastName() {
		return getName().split(" ")[1];
	}

	/* (non-Javadoc)
	 * @see toolbox.design.patterns.structural.adapter.Acme#setFirstName(java.lang.String)
	 */
	@Override
	public void setFirstName(String firstName) {
		setName(firstName + " " + lastName);
	}

	/* (non-Javadoc)
	 * @see toolbox.design.patterns.structural.adapter.Acme#setLastName(java.lang.String)
	 */
	@Override
	public void setLastName(String lastName) {
		setName(firstName + " " + lastName);
	}

}
