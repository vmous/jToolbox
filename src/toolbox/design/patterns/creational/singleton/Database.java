package toolbox.design.patterns.creational.singleton;

import java.util.UUID;

/**
 * <p>
 * Singleton. Restricts the instantiation of a class to one object.
 * </p>
 *
 * <p>
 * This implementation is <emph>not</emph> thread-safe.
 * </p>
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
