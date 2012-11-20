package toolbox.design.patterns.behavioral.chainofresponsibility;

/**
 * Concrete handler. Handles the requests it is responsible for, otherwise it
 * forwards the request to its successor.
 *
 * @author billy
 *
 */
public class FrontEnd extends Help {

    private final int FRONT_END_HELP = 1;

    public FrontEnd(Help successor) {
        super(successor);
    }

    @Override
    public void getHelp(int type) {
        if (type == FRONT_END_HELP)
            System.out.println("This is the front end. Don't you like it?");
        else
            successor.getHelp(type);
    }

}
