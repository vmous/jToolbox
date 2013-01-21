package toolbox.design.patterns.creational.singleton;

import java.util.UUID;

/**
 * <p>
 * Singleton. Defines an instance operation for creating and accessing the
 * unique instance. This variation is thread-safe and it used the
 * double-checked locking idiom.
 * </p>
 *
 * <p>
 * This idiom offers the advantage that the instance getter is far more
 * efficient since it does not need to be synchronized as a whole. The only
 * portion synchronized is the one creating the singleton object. Thus, only
 * the few threads trying to access the instance, at the beginning (when the
 * singleton needs to be created), need to be synchronized. The idiom requires
 * the instance be volatile so it is applicable only on J2SE 5.0 and above. The
 * problem with the previous versions is described in
 * <a href="http://www.cs.umd.edu/~pugh/java/memoryModel/DoubleCheckedLocking.html">
 * The "Double-Checked Locking is Broken" Declaration
 * </a>.
 * </p>
 *
 * <p>
 * In general you double-checked locking should be avoided if possible since it
 * is difficult to get it right and if you get it wrong it is difficult to find
 * the error.
 * </p>
 *
 * @author billy
 *
 */
public class DoubleCheckLockSynchronizedDatabase {

    /**
     * The unique instance.
     *
     * Do static and volatile coexist? This boils down to to the question "can
     * a field not associated with an instance of the containing class be
     * changed by another thread without warning?" The answer is yes since
     * instance association is orthogonal to concurrent modification.
     */
    private static volatile DoubleCheckLockSynchronizedDatabase instance;

//    private static class InstanceHolder {
//        public static
//    }

    private final UUID uuid;
    private final int record;

    /**
     * Constructor is made private.
     */
    private DoubleCheckLockSynchronizedDatabase() {
        this.uuid = UUID.randomUUID();
        this.record = 0;
    }

    /**
     * Static member method for creating (if necessary) and accessing the unique
     * instance using the double-checked locking idiom.
     *
     * @return the unique instance
     */
    public static DoubleCheckLockSynchronizedDatabase getInstance() {
        // Note the usage of the local variable "result" which, at first glance
        // seems unnecessary. For some versions of the JVM, this hack will make
        // the code 25% faster, while for others, it will not hurt!!
        DoubleCheckLockSynchronizedDatabase result = instance;
        if (result == null) {
            synchronized (DoubleCheckLockSynchronizedDatabase.class) {
                result = instance;
                if (result == null)
                    instance = result = new DoubleCheckLockSynchronizedDatabase();
            }
        }

        return result;
    }

    public void editRecord(String operation) {
        System.out.println("Performing a " + operation + "operation on record "
                + record + " in database " + uuid.toString());
    }

    public String getDbUuid() {
        return uuid.toString();
    }

}
