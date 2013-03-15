package toolbox.design.patterns.structural.proxy;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for the Proxy structural design pattern.
 *
 * @author billy
 */
public class ProxyTest {

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testIt() {
		ProxyImage image1 = new ProxyImage("IMG0001.jpeg");
		ProxyImage image2 = new ProxyImage("IMG0002.jpeg");

		image1.displayImage();
        image2.displayImage();
        image1.displayImage();
	}

}
