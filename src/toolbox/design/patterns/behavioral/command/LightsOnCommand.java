package toolbox.design.patterns.behavioral.command;

/**
 * Concrete command. Defines a binding between a receiver object and an action
 * as well as it implements the execution by invoking the corresponding
 * operation(s) on the receiver.
 *
 * @author billy
 *
 */
public class LightsOnCommand implements Command {

    private final Light light;

    public LightsOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.switchOn();
    }

}
