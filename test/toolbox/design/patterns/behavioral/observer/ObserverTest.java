package toolbox.design.patterns.behavioral.observer;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for the Observer behavioral design pattern.
 *
 * @author billy
 */
public class ObserverTest {

	private final ByteArrayOutputStream output = new ByteArrayOutputStream();

	private Database database;
	private Archiver archiver;
	private Client client;
	private Boss boss;

    @Before
	public void setUp() {
		System.setOut(new PrintStream(output));

		this.database = new Database();

		this.archiver = new Archiver();
		this.client = new Client();
		this.boss = new Boss();

		this.database.registerObserver(archiver);
		this.database.registerObserver(client);
		this.database.registerObserver(boss);
	}

    @After
	public void tearDown() {
		System.setOut(null);
	}

    @Test
	public void testIt() {
		this.database.editRecord("delete", "record 0");

		assertTrue(output.toString().indexOf("client") > 0);
		assertTrue(output.toString().indexOf("archiver") > 0);
		assertTrue(output.toString().indexOf("boss") > 0);
	}
}
