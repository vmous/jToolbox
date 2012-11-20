/**
 * 
 */
package toolbox.design.patterns.structural.composite;

/**
 * Leaf. Defines behaviour for composition objects that do not have children.
 * 
 * @author billy
 *
 */
public class File extends AbstractFile {

	private String name;

	/**
	 * 
	 */
	public File(String name) {
		this.name = name;
	}

	/* (non-Javadoc)
	 * @see toolbox.design.patterns.structural.composite.AbstractFile#ls()
	 */
	@Override
	public void ls() {
		System.out.println(indent.toString() + name);
	}

}
