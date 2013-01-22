package toolbox.design.patterns.behavioral.chainofresponsibility;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;

import toolbox.design.patterns.behavioral.chainofresponsibility.Application;
import toolbox.design.patterns.behavioral.chainofresponsibility.FrontEnd;
import toolbox.design.patterns.behavioral.chainofresponsibility.IntermediateLayer;

/**
 * Unit test for the Chain of Responsibility behavioral design pattern.
 *
 * @author billy
 */
public class ChainOfResponsibilityTest extends TestCase {
	private final ByteArrayOutputStream output = new ByteArrayOutputStream();
	private final int FRONT_END_HELP = 1;
	private final int INTERMEDIATE_LAYER_HELP = 2;
	private final int GENERAL_HELP = 3;

	private Application application;
	private IntermediateLayer intermediateLayer;
	private FrontEnd frontEnd;

	@Override
    @Before
	public void setUp() throws Exception {
		System.setOut(new PrintStream(output));

		this.application = new Application(null);
		this.intermediateLayer = new IntermediateLayer(this.application);
		this.frontEnd = new FrontEnd(this.intermediateLayer);

		super.setUp();
	}

	@Override
    @After
	public void tearDown() throws Exception {
		System.setOut(null);

		super.tearDown();
	}

	public void testIt() {
        this.frontEnd.getHelp(FRONT_END_HELP);
        assertTrue(output.toString().indexOf("front end") > 0);

        this.frontEnd.getHelp(INTERMEDIATE_LAYER_HELP);
        assertTrue(output.toString().indexOf("intermediate") > 0);

		this.frontEnd.getHelp(GENERAL_HELP);
		assertTrue(output.toString().indexOf("Jazzmanian") > 0);
	}
}
