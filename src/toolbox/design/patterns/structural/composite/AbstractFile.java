package toolbox.design.patterns.structural.composite;

/**
 * Component. Declares an interface for composition objects like accessing and
 * managing self and child components. Optionally may include an interface for
 * accessing parent components. If appropriate it implements default behaviour
 * common to all classes.
 *
 * @author billy
 *
 */
public abstract class AbstractFile {

    public static StringBuffer indent = new StringBuffer();

    public abstract void ls();

}
