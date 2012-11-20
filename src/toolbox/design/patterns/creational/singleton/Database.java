package toolbox.design.patterns.creational.singleton;

import java.util.UUID;

/**
 * Singeton. Defines an instance operation for creating and accessing the unique
 * instance. This variation is not thread-safe.
 *
 * @author billy
 *
 */
public class Database {

    /** The unique instance. */
    private static Database instance;

    private final UUID uuid;
    private final int record;

    /**
     * Constructor is made private.
     */
    private Database() {
        this.uuid = UUID.randomUUID();
        this.record = 0;
    }

    /**
     * Static member method for creating (if necessary) and accessing the unique
     * instance.
     *
     * @return the unique instance
     */
    public static Database getInstance() {
        if (instance == null)
            instance = new Database();

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
