package toolbox.design.patterns.creational.singleton;

import java.util.UUID;

/**
 * <p>
 * Singleton. Restricts the instantiation of a class to one object.
 * </p>
 *
 * <p>
 * The approach used here is referred to as <emph>lazy initialization</emph>
 * since the singleton instance is created the first time it is needed. Due to
 * race conditions in multi-threaded environments, the instance getter method
 * is defined as synchronized. This works fine but there are more efficient
 * variations like the one using double-checked locking.
 * </p>
 *
 * <p>
 * This implementation is thread-safe.
 * </p>
 *
 * @author billy
 *
 */
public class SynchronizedDatabase {

    /**
     * The unique instance.
     */
    private static SynchronizedDatabase instance;

    private final UUID uuid;
    private final int record;

    /**
     * Constructor is made private.
     */
    private SynchronizedDatabase() {
        this.uuid = UUID.randomUUID();
        this.record = 0;
    }

    /**
     * Static member method for creating (if necessary) and accessing the unique
     * instance in a thread-safe, synchronized manner.
     *
     * @return the unique instance
     */
    public static synchronized SynchronizedDatabase getInstance() {
        if (instance == null)
            instance = new SynchronizedDatabase();

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
