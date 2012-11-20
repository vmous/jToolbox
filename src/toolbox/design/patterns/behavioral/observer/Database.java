package toolbox.design.patterns.behavioral.observer;

import java.util.Vector;

/**
 * Concrete subject. Knows its observers and implements the subject interface.
 *
 * @author billy
 *
 */
public class Database implements Subject {

    private final Vector<Observer> observers;
    private String operation;
    private String record;

    public Database() {

        observers = new Vector<Observer>();

    }

    @Override
    public void registerObserver(Observer o) {

        observers.add(o);

    }

    @Override
    public void removeObserver(Observer o) {

        observers.remove(o);

    }

    @Override
    public void notifyObserver() {

        for (Observer o : observers)
            o.update(operation, record);

    }

    public void editRecord(String operation, String record) {
        this.operation = operation;
        this.record = record;
        notifyObserver();
    }

}
