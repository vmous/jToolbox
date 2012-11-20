package toolbox.design.patterns.creational.factorymethod;

/**
 * Concrete product. Implements the product interface.
 *
 * @author billy
 *
 */
public class OpenLdapUserAuthentication implements UserAuthentication {

    public OpenLdapUserAuthentication() {
    }

    @Override
    public boolean authenticate() {
        boolean success;
        // ...
        success = true;

        return success;
    }

}
