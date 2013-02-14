package toolbox.design.patterns.behavioral.command;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for the Command behavioral design pattern.
 *
 * @author billy
 */
public class CommandTest {

	private Light light;
	private Command lightsOn;
	private Command lightsOff;
	private Switch switcher;

    @Before
	public void setUp() {
		light = new Light();
		lightsOn = new LightsOnCommand(light);
		lightsOff = new LightsOffCommand(light);
		switcher = new Switch(lightsOn, lightsOff);
	}

    @After
	public void tearDown() {
	}

    @Test
	public void testIt() {
		switcher.press();
		assertTrue(light.isOn());
		switcher.press();
		assertTrue(light.isOff());
		switcher.press();
		assertTrue(light.isOn());
		switcher.press();
		assertTrue(light.isOff());
		switcher.press();
		assertTrue(light.isOn());
		switcher.press();
		assertTrue(light.isOff());
	}

}
