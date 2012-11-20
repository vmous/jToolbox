package toolbox.design.patterns.behavioral.chainofresponsibility;

/**
 * Handler. Defines an interface for handling requests and stores the successor
 * link.
 *
 * @author billy
 *
 */
public abstract class Help {
    protected Help successor;

    public Help(Help successor) {
        this.successor = successor;
    }

    public abstract void getHelp(int type);

}
