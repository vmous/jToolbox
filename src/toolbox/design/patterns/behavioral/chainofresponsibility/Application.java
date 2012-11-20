package toolbox.design.patterns.behavioral.chainofresponsibility;

/**
 * Concrete handler. Handles the requests it is responsible for, otherwise it
 * forwards the request to its successor.
 * 
 * @author billy
 * 
 */
public class Application extends Help {

    public Application(Help successor) {
        super(successor);
    }

    @Override
    public void getHelp(int type) {
        System.out.println("This is the Jazzmanian application.");
    }

}
