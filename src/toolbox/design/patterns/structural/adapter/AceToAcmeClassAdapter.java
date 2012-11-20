package toolbox.design.patterns.structural.adapter;

/**
 * Class adapter. Adapts the interface of adaptee to the target interface. The
 * adapter extends the adaptee and implements the target interface.
 *
 * @author billy
 *
 */
public class AceToAcmeClassAdapter extends Acer implements Acme {

    private final String firstName;
    private final String lastName;

    public AceToAcmeClassAdapter() {
        firstName = "";
        lastName = "";
    }

    @Override
    public String getFirstName() {
        return getName().split(" ")[0];
    }

    @Override
    public String getLastName() {
        return getName().split(" ")[1];
    }

    @Override
    public void setFirstName(String firstName) {
        setName(firstName + " " + lastName);
    }

    @Override
    public void setLastName(String lastName) {
        setName(firstName + " " + lastName);
    }

}
