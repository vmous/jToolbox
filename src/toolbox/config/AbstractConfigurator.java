package toolbox.config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * <p>
 * This abstract class acts as a skeleton for managers of application
 * configuration properties and their user-defined and default (or fall-back)
 * values.
 * </p>
 * <p>
 * The class is defined as abstract so that a concrete classes can follow the
 * Singleton design pattern to ensure exactly one object is realized.
 * </p>
 *
 * @author billy
 * @version 0.1
 *
 */
public abstract class AbstractConfigurator {

	/**
	 * The default path to the default configuration file.
	 */
	public static final String DEFAULT_CONF_FILE_PATH = "default.xml";

    /**
     * The default header for the default configuration file.
     */
    public static final String DEFAULT_CONF_FILE_HEADER = "## The default configuration file. ##";

	/**
	 * The default path to the user configuration file.
	 */
	public static final String USER_CONF_FILE_PATH = "user.xml";

	/**
	 * The default header for the user configuration file.
	 */
	public static final String USER_CONF_FILE_HEADER = "## The user configuration file. ##";

	/**
	 * The default configuration file path.
	 */
	private String defaultConfFilePath;

    /**
     * The header information in the default configuration file.
     */
    private String defaultConfFileHeader;

	/**
	 * The user configuration file path.
	 */
	private String userConfFilePath;

    /**
     * The header information in the user configuration file.
     */
    private String userConfFileHeader;

	/**
	 * The default properties.
	 */
	protected Properties defaultProperties;

	/**
	 * The user defined properties.
	 */
	protected Properties userProperties;

	/**
	 * Constructor.
	 */
	protected AbstractConfigurator() {
	    this.defaultConfFilePath = DEFAULT_CONF_FILE_PATH;
	    this.defaultConfFileHeader = DEFAULT_CONF_FILE_HEADER;

	    this.userConfFilePath = USER_CONF_FILE_PATH;
	    this.userConfFileHeader = USER_CONF_FILE_HEADER;
	}

	/**
	 * Sets the default configuration file path.
	 *
	 * @param defaultConfFilePath
	 *     The path to the default configuration file to set.
	 */
	public void setDefaultConfFilePath(String defaultConfFilePath) {
		this.defaultConfFilePath = defaultConfFilePath;
	}

	/**
	 * Gets the default configuration file path.
	 *
	 * @return The path to the default configuration file.
	 */
	public String getDefaultConfFilePath() {
		return defaultConfFilePath;
	}

    /**
     * Sets the default configuration file header.
     *
     * @param defaultConfFileHeader
     *     The default configuration file header to set.
     */
    public void setDefaultConfFileHeader(String defaultConfFileHeader) {
        this.defaultConfFileHeader = defaultConfFileHeader;
    }

    /**
     * Gets the default configuration file header.
     *
     * @return The default configuration file header.
     */
    public String getDefaultConfFileHeader() {
        return defaultConfFileHeader;
    }

    /**
     * Sets the user configuration file path.
     *
     * @param userConfFilePath
     *     The path to the user configuration file to set.
     */
    public void setUserConfFilePath(String userConfFilePath) {
        this.userConfFilePath = userConfFilePath;
    }

    /**
     * Gets the user configuration file path.
     *
     * @return The path to the user configuration file.
     */
    public String getUserConfFilePath() {
        return userConfFilePath;
    }

	/**
	 * Sets the user configuration file header.
	 *
	 * @param userConfFileHeader
	 *     The user configuration file header to set.
	 */
	public void setUserConfFileHeader(String userConfFileHeader) {
		this.userConfFileHeader = userConfFileHeader;
	}

	/**
	 * Gets the user configuration file header.
	 *
	 * @return The user configuration file header.
	 */
	public String getUserConfFileHeader() {
		return userConfFileHeader;
	}

	/**
	 * Sets all the default properties using a single a bulk operation.
	 *
	 * @param defaultProperties
	 *     The default properties to set.
	 */
	public void setDefaultProperties(Properties defaultProperties) {
		this.defaultProperties = defaultProperties;
	}

	/**
	 * Gets all the default properties.
	 *
	 * @return The default properties.
	 */
	public Properties getDefaultProperties() {
		return defaultProperties;
	}

	/**
	 * Sets all the user defined properties in a single bulk operation.
	 *
	 * @param userProperties
	 *     The user properties to set.
	 */
	public void setUserProperties(Properties userProperties) {
		this.userProperties = userProperties;
	}

	/**
	 * Gets all the user defined properties.
	 *
	 * @return The user defined properties.
	 */
	public Properties getUserProperties() {
		return userProperties;
	}

	/**
	 * Places a property to the user property list.
	 *
	 * @param name
	 *     The name to be placed in the property list.
	 * @param value
	 *     The value corresponding to {@code name}.
	 */
	public void assign(String name, String value) {
		userProperties.setProperty(name, value);
		silentStore();
	}

	/**
	 * Gets the user defined property value of the given property name as a
	 * {@code String} representation. In case no such user defined property
	 * exists, the search falls back to the defaults.
	 *
	 * @param name
	 *     The property name.
	 *
	 * @return The user property value of the given property name as a
	 *         {@code String} object or {@code null} if there is no such
	 *         property name.
	 *
	 * @see AbstractConfigurator#propertyBoolean(String)
	 * @see AbstractConfigurator#propertyInteger(String)
	 */
	public String property(String name) {
		return this.userProperties.getProperty(name, propertyDefault(name));
	}

	/**
	 * Gets the property value of the given property name as a {@code boolean}.
	 *
	 * @param name
	 *     The property name.
	 *
	 * @return The property value of the given property name as {@code boolean}.
	 */
	public boolean propertyBoolean(String name) {
		return Boolean.parseBoolean(this.property(name));
	}

	/**
	 * Gets the property value of the given property name as an {@code int}.
	 *
	 * @param name
	 *     The property name.
	 *
	 * @return The property value of the given property name as {@code int}.
	 */
	public int propertyInteger(String name) {
		return Integer.parseInt(this.property(name));
	}

	/**
	 * Gets the default property value of the given property name as a
	 * {@code String} representation.
	 *
	 * @param name
	 *     The property name.
	 *
	 * @return The default property value of the given property name as a
	 *         {@code String} object.
     *
     * @see AbstractConfigurator#propertyDefaultBoolean(String)
     * @see AbstractConfigurator#propertyDefaultInteger(String)
	 */
	public String propertyDefault(String name) {
		return this.defaultProperties.getProperty(name);
	}

    /**
     * Gets the default property value of the given property name as a
     * {@code boolean}.
     *
     * @param name
     *     The property name.
     *
     * @return The property value of the given property name as {@code boolean}.
     */
    public boolean propertyDefaultBoolean(String name) {
        return Boolean.parseBoolean(this.propertyDefault(name));
    }

    /**
     * Gets the default property value of the given property name as an {@code int}.
     *
     * @param name
     *     The property name.
     *
     * @return The property value of the given property name as {@code int}.
     */
    public int propertyDefaultInteger(String name) {
        return Integer.parseInt(this.propertyDefault(name));
    }

	/**
	 * Loads the user configuration properties.
	 */
	public void loadUserProperties() {
		try {
		    this.userProperties.loadFromXML(new FileInputStream(this.userConfFilePath));
		}
		catch (FileNotFoundException fnfe) {
		    System.err.println("File " + this.userConfFilePath + " not found.");
		    fnfe.printStackTrace();
		}
		catch (IOException ioe) {
            System.err.println("I/O failed for file " + this.userConfFilePath + ".");
		    ioe.printStackTrace();
		}
	}

	/**
	 * Loads the default configuration properties.
	 */
	protected void loadDefaultProperties() {
        try {
            this.defaultProperties.loadFromXML(new FileInputStream(this.defaultConfFilePath));
        }
        catch (FileNotFoundException fnfe) {
            System.err.println("File " + this.defaultConfFilePath + " not found.");
            fnfe.printStackTrace();
        }
        catch (IOException ioe) {
            System.err.println("I/O failed for file " + this.defaultConfFilePath + ".");
            ioe.printStackTrace();
        }
	}

	/**
	 * Stores the configuration file to persistent storage.
	 *
	 * @return {@code true} if the configuration has been stored successfully;
	 *         {@code false} otherwise.
	 */
	public boolean store() {
		boolean success;

		try {
		    System.out.println("Storing in " + this.userConfFilePath);
			FileOutputStream out = new FileOutputStream(this.userConfFilePath);
			this.userProperties.storeToXML(out, this.userConfFileHeader, "UTF-8");
			success = true;
		}
		catch (IOException e) {
			success = false;
		}

		return success;
	}

	/**
	 * Stores the configuration file to persistent storage without printing any
	 * message dialog.
	 *
	 * @return {@code true} if the configuration has been stored successfully;
	 *         {@code false} otherwise.
	 */
	public boolean silentStore() {
		boolean success;

		try {
			FileOutputStream out = new FileOutputStream(this.userConfFilePath);
            this.userProperties.storeToXML(out, this.userConfFileHeader, "UTF-8");
			success = true;
		}
		catch (IOException e) {
			success = false;
		}

		return success;
	}

}