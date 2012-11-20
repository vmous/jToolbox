package toolbox.design.patterns.behavioral.observer;

/**
 * Concrete observer. Implements the observer updating interface to keep its
 * state consistent with the subject's. May maintain a reference to a concrete
 * subject object and/or store state that should stay consistent with the
 * subject's.
 *
 * @author billy
 *
 */
public class Archiver implements Observer {

    public Archiver() {
    }

    @Override
    public void update(String operation, String record) {
        System.out.println("The archiver says a " + operation
                + " operation was performed on " + record + ".");
    }

}
