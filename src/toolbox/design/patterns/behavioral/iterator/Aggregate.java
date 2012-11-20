package toolbox.design.patterns.behavioral.iterator;

/**
 * Defines an interface for creating an iterator object.
 * 
 * @author billy
 * 
 */
public interface Aggregate<T> {

    public abstract Iterator<T> createIterator();

}
