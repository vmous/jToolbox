package toolbox.design.patterns.behavioral.iterator;

/**
 * Iterator. Defines an interface for accessing and traversing elements.
 * 
 * @author billy
 * 
 */
public interface Iterator<T> {

    public abstract T first();

    public abstract T next();

    public abstract T currentItem();

    public abstract boolean isDone();

}
