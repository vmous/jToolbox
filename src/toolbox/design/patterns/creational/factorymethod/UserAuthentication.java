package toolbox.design.patterns.creational.factorymethod;

/**
 * Product. Defines the interface of the objects that the factory method
 * instantiates.
 *
 * @author billy
 *
 */
public interface UserAuthentication {

    /**
     * @return <code>true</code> if the user was successfully authenticated, or
     *         <code>false</code> otherwise.
     */
    public abstract boolean authenticate();

}
