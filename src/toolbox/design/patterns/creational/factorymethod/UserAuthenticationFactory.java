package toolbox.design.patterns.creational.factorymethod;

/**
 * Creator (concrete). Declares and implements the parameterized factory method
 * which creates and returns a concrete product.
 *
 * @author billy
 *
 */
public class UserAuthenticationFactory {

    public enum AuthenticationType {
        ACTIVE_DIRECTORY, OPEN_LDAP
    }

    public UserAuthenticationFactory() {
    }

    public UserAuthentication getUserAuthenication(AuthenticationType type) {
        UserAuthentication authentication;

        switch (type) {
        case ACTIVE_DIRECTORY:
            authentication = new ActiveDirectoryUserAuthentication();
            break;
        case OPEN_LDAP:
            authentication = new OpenLdapUserAuthentication();
            break;
        default:
            authentication = new OpenLdapUserAuthentication();
        }

        return authentication;
    }

}
