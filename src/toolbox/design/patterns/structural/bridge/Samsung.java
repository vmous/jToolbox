package toolbox.design.patterns.structural.bridge;

/**
 * Concrete implementor. Defines the concrete implementation of the interface.
 *
 * @author billy
 *
 */
public class Samsung implements Television {

    public Samsung() {
        // TODO Auto-generated constructor stub
    }

    @Override
    public void on() {
        System.out.println("Samsung specific ON operation.");
    }

    @Override
    public void off() {
        System.out.println("Samsung specific OFF operation.");
    }

    @Override
    public void tuneChannel(int channel) {
        System.out.println("Samsung specific tune operation for channel "
                + channel + ".");
    }

}
