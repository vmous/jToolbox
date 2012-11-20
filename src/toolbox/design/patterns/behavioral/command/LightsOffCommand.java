package toolbox.design.patterns.behavioral.command;

/**
 * Concrete command. Defines a binding between a receiver object and an action
 * as well as it implements the execution by invoking the corresponding
 * operation(s) on the receiver.
 *
 * @author billy
 *
 */
public class LightsOffCommand implements Command {

    private final Light light;

    public LightsOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.switchOff();
    }

}
