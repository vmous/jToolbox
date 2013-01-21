package toolbox.design.patterns.creational.singleton;

import java.util.UUID;

/**
 * Singleton. Defines an instance operation for creating and accessing the
 * unique instance. This variation is thread-safe.
 *
 * @author billy
 *
 */
public class SynchronizedDatabase {

    /** The unique instance. */
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
