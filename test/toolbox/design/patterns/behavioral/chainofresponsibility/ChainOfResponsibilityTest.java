package toolbox.design.patterns.behavioral.chainofresponsibility;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for the Chain of Responsibility behavioral design pattern.
 *
 * @author billy
 */
public class ChainOfResponsibilityTest {

	private final ByteArrayOutputStream output = new ByteArrayOutputStream();
	private final int FRONT_END_HELP = 1;
	private final int INTERMEDIATE_LAYER_HELP = 2;
	private final int GENERAL_HELP = 3;

	private Application application;
	private IntermediateLayer intermediateLayer;
	private FrontEnd frontEnd;

    @Before
	public void setUp() {
		System.setOut(new PrintStream(output));

		this.application = new Application(null);
		this.intermediateLayer = new IntermediateLayer(this.application);
		this.frontEnd = new FrontEnd(this.intermediateLayer);
	}

    @After
	public void tearDown() {
		System.setOut(null);
	}

    @Test
	public void testIt() {
        this.frontEnd.getHelp(FRONT_END_HELP);
        assertTrue(output.toString().indexOf("front end") > 0);

        this.frontEnd.getHelp(INTERMEDIATE_LAYER_HELP);
        assertTrue(output.toString().indexOf("intermediate") > 0);

		this.frontEnd.getHelp(GENERAL_HELP);
		assertTrue(output.toString().indexOf("Jazzmanian") > 0);
	}

}
