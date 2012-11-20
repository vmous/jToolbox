package toolbox.design.patterns.creational.singleton;

import java.util.UUID;

/**
 * Singleton. Defines an instance operation accessing the unique instance.
 * Initialization is left to the virtual machine. This variation is thread-safe.
 *
 * @author billy
 *
 */
public class ElegantlySynchronisedDatabase {

    /** The unique instance instantiated by the virtual machine. */
    private static ElegantlySynchronisedDatabase instance = new ElegantlySynchronisedDatabase();

    private final UUID uuid;
    private final int record;

    /**
     * Constructor is made private.
     */
    private ElegantlySynchronisedDatabase() {
        this.uuid = UUID.randomUUID();
        this.record = 0;
    }

    /**
     * Static member method simply for accessing the unique instance in a
     * thread-safe, synchronized manner.
     *
     * @return the unique instance
     */
    public static synchronized ElegantlySynchronisedDatabase getInstance() {
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
