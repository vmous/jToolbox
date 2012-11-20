package toolbox.design.patterns.others.dependencyinjection;

import java.math.BigDecimal;

/**
 * @author billy
 *
 */
public interface AutomatedTellerMachine {

    public abstract void deposit(BigDecimal amount);

    public abstract void withdraw(BigDecimal amount);

}
