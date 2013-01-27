package toolbox.design.patterns.creational.singleton;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * {@code ThreadLocal} is used to force thread-local variables. These variables
 * differ from their normal counterparts in that each thread that accesses one
 * (via its {@code get()} or {@code set()} methods) has its own, independently
 * initialized copy of the variable. ThreadLocal instances are typically private
 * static fields in classes that wish to associate state with a thread
 * (e.g., a user ID or Transaction ID).
 *
 * @author billy
 */
public class PerThreadSingleton {

    // Anonymous inner class.
    // Each thread will have its own copy of the SimpleDateFormat.
    private final static ThreadLocal<SimpleDateFormat> tl =
            new ThreadLocal<SimpleDateFormat>() {
                @Override
                protected SimpleDateFormat initialValue() {
                    return new SimpleDateFormat("dd/MM/yyyy");
                }
            };

    public String formatDate(Date input) {
        if (input == null) {
            return null;
        }

        return tl.get().format(input);
    }

}
