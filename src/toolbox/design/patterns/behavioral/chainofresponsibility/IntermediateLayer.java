package toolbox.design.patterns.behavioral.chainofresponsibility;

/**
 * Concrete handler. Handles the requests it is responsible for, otherwise it
 * forwards the request to its successor.
 * 
 * @author billy
 * 
 */
public class IntermediateLayer extends Help {

    private final int INTERMEDIATE_LAYER_HELP = 2;

    public IntermediateLayer(Help successor) {
        super(successor);
    }

    @Override
    public void getHelp(int type) {
        if (type == INTERMEDIATE_LAYER_HELP)
            System.out.println("This is the intermediate layer. Nice, eh?");
        else
            successor.getHelp(type);
    }

}
