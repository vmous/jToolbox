package toolbox.design.patterns.structural.decorator;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import toolbox.design.patterns.structural.decorator.Computer;
import toolbox.design.patterns.structural.decorator.DVD;
import toolbox.design.patterns.structural.decorator.HDD;
import toolbox.design.patterns.structural.decorator.Monitor;

/**
 * Unit test for the Decorator structural design pattern.
 *
 * @author billy
 */
public class DecoratorTest {
	private String message;
	private Product computer;

	@Before
	public void setUp() {
		message = new String();
		computer = new Computer();
		computer = new HDD(computer);
		computer = new DVD(computer);
		computer = new Monitor(computer);
	}

	@After
	public void tearDown() {
	}

	@Test
	public void testIt() {
		message = "You're getting a " + computer.getDescription() + " for " + computer.getCost() + " Euros.";
		assertEquals("You're getting a computer and a hdd and a dvd and a monitor for 599.0 Euros.", message);
	}
}
