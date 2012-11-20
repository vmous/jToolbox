package toolbox.design.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Composite. Defines behaviour for components having children, stores child
 * components and implements child-related operations.
 *
 * @author billy
 *
 */
public class Directory extends AbstractFile {

    private final String name;
    private final List<AbstractFile> components;

    public Directory(String name) {
        this.name = name;
        components = new ArrayList<AbstractFile>();
    }

    @Override
    public void ls() {
        System.out.println(indent.toString() + name);
        indent.append("   ");
        for (AbstractFile component : components) {
            component.ls();
        }
        indent.setLength(indent.length() - 3);
    }

    public void add(AbstractFile component) {
        components.add(component);
    }

    public void remove(AbstractFile component) {
        components.remove(component);
    }

    public List<AbstractFile> getComponents() {
        return components;
    }

    public AbstractFile getComponent(int index) {
        return components.get(index);
    }

}
