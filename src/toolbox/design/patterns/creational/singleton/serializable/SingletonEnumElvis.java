package toolbox.design.patterns.creational.singleton.serializable;

import java.util.Arrays;

/**
 * <p>
 * Singleton. Restricts the instantiation of a class to one object.
 * </p>
 *
 * <p>
 * This approach implements the singleton by taking advantage of Java's
 * guarantee that any {@code enum} value is instantiated only once in a Java
 * program. Since Java {@code enum} values are globally accessible, so is the
 * singleton. Also, the use of an {@code enum} is a very easy to implement and
 * has no drawbacks regarding serializable objects, which have to be
 * circumvented in the other ways. The drawback is that the enum type is
 * somewhat inflexible; for example, it does not allow lazy initialization.
 * </p>
 *
 * <p>
 * Joshua Bloch explained this approach in his Effective Java Reloaded talk at
 * Google I/O 2008.
 * </p>
 *
 * @author billy
 */
public enum SingletonEnumElvis {
    INSTANCE;

    private final String[] favouriteSongs =
        { "Hound Dog", "Heartbreak Hotel" };

    public void printFavourites() {
        System.out.println(Arrays.toString(favouriteSongs));
    }
}
