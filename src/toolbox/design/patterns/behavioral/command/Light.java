package toolbox.design.patterns.behavioral.command;

/**
 * Receiver. Knows how to perform the operations associated with carrying out a
 * request.
 * 
 * @author billy
 * 
 */
public class Light {

    private boolean on;

    public Light() {
    }

    public void switchOn() {
        on = true;
    }

    public void switchOff() {
        on = false;
    }

    public boolean isOn() {
        return on;
    }

    public boolean isOff() {
        return !on;
    }

}
