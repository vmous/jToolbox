package toolbox.design.patterns.structural.bridge;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for the Bridge structural design pattern.
 *
 * @author billy
 */
public class BridgeTest {

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testLG() {
		RemoteControl lgRemote = new RemoteControl(new LG());

		lgRemote.turnOn();
		lgRemote.nextChannel();
		lgRemote.nextChannel();
		lgRemote.nextChannel();
		lgRemote.previousChannel();
		lgRemote.turnOff();
	}

    @Test
    public void testSamsung() {
        RemoteControl samsungRemote = new RemoteControl(new Samsung());

        samsungRemote.turnOn();
        samsungRemote.previousChannel();
        samsungRemote.previousChannel();
        samsungRemote.nextChannel();
        samsungRemote.nextChannel();
        samsungRemote.nextChannel();
        samsungRemote.turnOff();
    }

}
