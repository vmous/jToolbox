package toolbox.design.patterns.structural.adapter;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for the Adapter structural design pattern.
 *
 * @author billy
 */
public class AdapterTest {

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testClassAdapter() {
        AceToAcmeClassAdapter adapter = new AceToAcmeClassAdapter();
        adapter.setName("Vassilis Moustakas");

        assertEquals("Vassilis", adapter.getFirstName());
        assertEquals("Moustakas", adapter.getLastName());
    }

    @Test
    public void testObjectAdapter() {
        Acer aceObject = new Acer();
        aceObject.setName("Vassilis Moustakas");

        AceToAcmeObjectAdapter adapter = new AceToAcmeObjectAdapter(aceObject);

        assertEquals("Vassilis", adapter.getFirstName());
        assertEquals("Moustakas", adapter.getLastName());
    }

}
