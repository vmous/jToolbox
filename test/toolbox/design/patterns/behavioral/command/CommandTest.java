package toolbox.design.patterns.behavioral.command;

import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;

/**
 * Unit test for the Command behavioral design pattern.
 *
 * @author billy
 */
public class CommandTest extends TestCase {

	private Light light;
	private Command lightsOn;
	private Command lightsOff;
	private Switch switcher;

	/**
	 * @throws java.lang.Exception
	 */
	@Override
    @Before
	public void setUp() throws Exception {
		light = new Light();
		lightsOn = new LightsOnCommand(light);
		lightsOff = new LightsOffCommand(light);
		switcher = new Switch(lightsOn, lightsOff);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Override
    @After
	public void tearDown() throws Exception {
	}

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
