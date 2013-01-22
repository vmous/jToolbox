package toolbox.design.patterns.behavioral.iterator;

import org.junit.After;
import org.junit.Before;

import junit.framework.TestCase;

/**
 * Unit test for the Iterator behavioral design pattern.
 *
 * @author billy
 */
public class IteratorTest extends TestCase {

    private final String[] books = {
            "Design Patterns",
            "Tractatus Logico-Philosophicus",
            "Über das Sehn und die Farben",
            "Principia Mathematica"
            };

    private Iterator<String> itr;

    private BookList bookList;

    /**
     * @throws java.lang.Exception
     */
    @Override
    @Before
    public void setUp() throws Exception {
        bookList = new BookList(books);
        itr = bookList.createIterator();
    }

    /**
     * @throws java.lang.Exception
     */
    @Override
    @After
    public void tearDown() throws Exception {
    }

    public void testIt() {
        int i = 0;

        while (!itr.isDone()) {
            assertEquals(books[i++], itr.next());
        }
    }

}
