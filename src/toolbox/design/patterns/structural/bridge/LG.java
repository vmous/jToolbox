package toolbox.design.patterns.structural.bridge;

/**
 * Concrete implementor. Defines the concrete implementation of the interface.
 *
 * @author billy
 *
 */
public class LG implements Television {

    public LG() {
    }

    @Override
    public void on() {
        System.out.println("LG specific ON operation.");

    }

    @Override
    public void off() {
        System.out.println("LG specific OFF operation.");

    }

    @Override
    public void tuneChannel(int channel) {
        System.out.println("LG specific tune operation for channel " + channel
                + ".");
    }

}
