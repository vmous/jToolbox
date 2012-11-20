package toolbox.design.patterns.structural.bridge;

import toolbox.util.Maths;

/**
 * Refined abstraction. Extends the abstraction's interface. Refined abstraction
 * and abstraction typically define higher-level operation based on the
 * primitives given by the implementor.
 *
 * @author billy
 *
 */
public class RemoteControl extends Controller {

    private int currentChannel;

    public RemoteControl(Television tv) {
        super(tv);
        currentChannel = 0;
    }

    public int nextChannel() {
        currentChannel++;
        setChannel(Maths.modulo(currentChannel, 50));

        return currentChannel;
    }

    public int previousChannel() {
        currentChannel--;
        setChannel(Maths.modulo(currentChannel, 50));

        return currentChannel;
    }
}
