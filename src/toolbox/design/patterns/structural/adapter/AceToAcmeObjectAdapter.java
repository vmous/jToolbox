package toolbox.design.patterns.structural.adapter;

/**
 * Object adapter. Adapts the interface of adaptee to the target interface. The
 * adapter contains an instance of the class it wraps.
 *
 * @author billy
 *
 */
public class AceToAcmeObjectAdapter implements Acme {

    private final Acer aceObject;
    private String firstName;
    private String lastName;

    public AceToAcmeObjectAdapter(Acer aceObject) {
        this.aceObject = aceObject;
        firstName = this.aceObject.getName().split(" ")[0];
        lastName = this.aceObject.getName().split(" ")[1];
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}
