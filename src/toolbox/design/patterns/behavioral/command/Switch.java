package toolbox.design.patterns.behavioral.command;

/**
 * Invoker. Asks the command to carry out the request.
 * 
 * @author billy
 * 
 */
public class Switch {

    private final Command onCommand;
    private final Command offCommand;

    private Command command;

    public Switch(Command onCommand, Command offCommand) {
        this.onCommand = onCommand;
        this.offCommand = offCommand;
        command = onCommand;
    }

    public void press() {
        command.execute();
        if (command.equals(onCommand))
            command = offCommand;
        else
            command = onCommand;
    }

}
