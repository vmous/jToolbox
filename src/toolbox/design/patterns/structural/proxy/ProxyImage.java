package toolbox.design.patterns.structural.proxy;

/**
 * Proxy. Maintains a reference to the real subject, providing an interface
 * identical to subject's so that it can substitute a real one. It also controls
 * access to the real subject and may be responsible for creating and destroying
 * it.
 *
 * @author billy
 *
 */
public class ProxyImage extends Image {

    private RealImage image;

    public ProxyImage(String filename) {
        super.filename = filename;
    }

    @Override
    public void displayImage() {
        if (image == null)
            image = new RealImage(super.filename);
        image.displayImage();
    }
}
