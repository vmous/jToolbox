package toolbox.design.patterns.creational.factorymethod;

/**
 * Concrete product. Implements the product interface.
 *
 * @author billy
 *
 */
public class ActiveDirectoryUserAuthentication implements UserAuthentication {

    public ActiveDirectoryUserAuthentication() {
    }

    @Override
    public boolean authenticate() {
        boolean success;
        // ...
        success = false;

        return success;
    }

}
