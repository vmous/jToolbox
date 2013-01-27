package toolbox.design.patterns.creational.singleton.serializable;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.Arrays;

/**
 * <p>
 * Singleton. Restricts the instantiation of a class to one object.
 * </p>
 *
 * <p>
 * Through the serializable tools, someone can write a singleton instance to
 * disk, and then read it back up, effectively getting a new instance. Even
 * though the singleton pattern dictates the constructor to be private, the
 * serializable tools have special access to create instances of a class
 * regardless. Thus, in order to maintain the uniqueness of the instance, we
 * exploit a special hook serialization has; a private method on the class
 * being instantiated called {@code readResolve()}, which is meant to supply a
 * "hook" for a class developer to ensure that they have a say in what
 * object is returned by serialization. Oddly enough, readResolve() is not
 * static, but is instead invoked on the new instance just created by the
 * serialization.
 * </p>
 *
 * <p>
 * This approach has a flaw which makes it potentially non-singleton. Joshua
 * Bloch explained this problem in his Effective Java Reloaded talk at Google
 * I/O 2008. {@code SingletonReadResolveElvis} has a non-transient field
 * (namelly favouriteSongs). A cleverly crafted attack can save reference to
 * deserialized {@code SingletonReadResolveElvis} instance when this field is
 * deserialized (you can see the <i>Elvis</i> stealer). {@code readResolve()}
 * works only if all fields are transient.
 * </p>
 *
 * @author billy
 */
public class SingletonReadResolveElvis implements Serializable {
    private static final long serialVersionUID = -4947568807496632221L;

    private static final SingletonReadResolveElvis instance =
            new SingletonReadResolveElvis();

    private SingletonReadResolveElvis() {
    }

    private final String[] favouriteSongs =
        { "Hound Dog", "Heartbreak Hotel" };

    public void printFavourites() {
        System.out.println(Arrays.toString(favouriteSongs));
    }

    public static SingletonReadResolveElvis getInstance() {
        return instance;
    }

    /**
     * This method ignores the deserialized object, returning the distinguished
     * Elvis instance that was created when the class was initialized.
     * Therefore, the serialized form of an Elvis instance need not contain any
     * real data; all instance fields should be declared transient. In fact, if
     * you depend on readResolve for instance control, all instance fields with
     * object reference types must be declared transient. Otherwise, it is
     * possible for a determined attacker to secure a reference to the
     * deserialized object before its readResolve method is run, using a
     * technique that is vaguely similar to the MutablePeriod attack in Item 76
     * of Joshua Bloch's presentation in Google I/O 2008. The attack is a bit
     * complicated, but the underlying idea is simple. If a singleton contains a
     * non-transient object reference field, the contents of this field will be
     * deserialized before the singleton’s readResolve method is run.
     * This allows a carefully crafted stream to "steal" a reference to the
     * originally deserialized singleton at the time the contents of the object
     * reference field are deserialized.
     */
    private Object readResolve() throws ObjectStreamException {
        // Return the one true Elvis and let the garbage collector
        // take care of the Elvis impersonator.
        return instance;
    }
}
