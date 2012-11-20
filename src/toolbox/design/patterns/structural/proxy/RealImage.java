package toolbox.design.patterns.structural.proxy;

/**
 * Real subject. Defines a real object that the proxy represents.
 *
 * @author billy
 *
 */
public class RealImage extends Image {

    public RealImage(String filename) {
        super.filename = filename;
        loadImageFromDisk();
    }

    private void loadImageFromDisk() {
        System.out.println("Loading image " + filename);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
