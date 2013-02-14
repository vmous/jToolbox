package toolbox.design.patterns.behavioral.iterator;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for the Iterator behavioral design pattern.
 *
 * @author billy
 */
public class IteratorTest {

    private final String[] books = {
            "Design Patterns",
            "Tractatus Logico-Philosophicus",
            "Über das Sehn und die Farben",
            "Principia Mathematica"
            };

    private Iterator<String> itr;
    private BookList bookList;

    @Before
    public void setUp() {
        bookList = new BookList(books);
        itr = bookList.createIterator();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testIt() {
        int i = 0;

        while (!itr.isDone()) {
            assertEquals(books[i++], itr.next());
        }
    }

}
