package toolbox.design.patterns.behavioral.observer;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;

/**
 * Unit test for the Observer behavioral design pattern.
 *
 * @author billy
 */
public class ObserverTest extends TestCase {
	private final ByteArrayOutputStream output = new ByteArrayOutputStream();

	private Database database;

	private Archiver archiver;
	private Client client;
	private Boss boss;

	/**
	 * @throws java.lang.Exception
	 */
	@Override
    @Before
	public void setUp() throws Exception {
		System.setOut(new PrintStream(output));

		this.database = new Database();

		this.archiver = new Archiver();
		this.client = new Client();
		this.boss = new Boss();

		this.database.registerObserver(archiver);
		this.database.registerObserver(client);
		this.database.registerObserver(boss);

		super.setUp();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Override
    @After
	public void tearDown() throws Exception {
		System.setOut(null);

		super.tearDown();
	}

	public void testIt() {
		this.database.editRecord("delete", "record 0");

		assertTrue(output.toString().indexOf("client") > 0);
		assertTrue(output.toString().indexOf("archiver") > 0);
		assertTrue(output.toString().indexOf("boss") > 0);
	}
}
