package toolbox.design.patterns.creational.singleton;

import java.util.UUID;

/**
 * <p>
 * Singleton. Restricts the instantiation of a class to one object.
 * </p>
 *
 * <p>
 * The approach used here is referred to as <emph>eager initialization</emph>
 * since the singleton instance is not created when it is first needed but is
 * left to the JVM when the class is loaded.
 * </p>
 *
 * <p>
 * This implementation is thread-safe
 * </p>
 *
 * @author billy
 *
 */
public class ElegantlySynchronizedDatabase {

    /**
     * The unique instance.
     *
     * The {@code final} keyword means that the instance cannot be redefined,
     * ensuring that one (and only one) instance ever exists.
     */
    private static final ElegantlySynchronizedDatabase instance = new ElegantlySynchronizedDatabase();

    private final UUID uuid;
    private final int record;

    /**
     * Constructor is made private.
     */
    private ElegantlySynchronizedDatabase() {
        this.uuid = UUID.randomUUID();
        this.record = 0;
    }

    /**
     * Static member method simply for accessing the unique instance in a
     * thread-safe, synchronized manner. Note, that there is no need to
     * synchronize the method, meaning all threads will see the same instance
     * and no (expensive) locking is required.
     *
     * @return The unique instance
     */
    public static ElegantlySynchronizedDatabase getInstance() {
        return instance;
    }

    public void editRecord(String operation) {
        System.out.println("Performing a " + operation + "operation on record "
                + record + " in database " + uuid.toString());
    }

    public String getDbUuid() {
        return uuid.toString();
    }

}
