package toolbox.design.patterns.structural.composite;

/**
 * Leaf. Defines behaviour for composition objects that do not have children.
 *
 * @author billy
 *
 */
public class File extends AbstractFile {

    private final String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public void ls() {
        System.out.println(indent.toString() + name);
    }

}
