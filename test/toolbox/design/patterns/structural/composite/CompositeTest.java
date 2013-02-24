package toolbox.design.patterns.structural.composite;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for the Composite structural design pattern.
 *
 * @author billy
 */
public class CompositeTest {

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testIt() {
		File file1 = new File("file1");
		File file2 = new File("file2");
		File file3 = new File("file3");
		File file4 = new File("file4");
		File file5 = new File("file5");

		Directory root = new Directory("root");
		Directory directory2 = new Directory("directory1");

		root.add(file1);
		root.add(file2);
		root.add(directory2);
		root.add(file3);

		directory2.add(file4);
		directory2.add(file5);

		root.ls();
	}

}
