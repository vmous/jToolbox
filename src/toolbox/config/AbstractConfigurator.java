package toolbox.config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import toolbox.config.exceptions.FailToLoadConfigurationFileException;

/**
 * <p>
 * This abstract class acts as a skeleton for managers of application
 * configuration properties and their user-defined and default (or fall-back)
 * values.
 * </p>
 * <p>
 * It is recommended that extending concrete classes follow the Singleton
 * design pattern to ensure exactly one object is realized.
 * </p>
 *
 * @author billy
 * @version 0.1
 *
 */
public abstract class AbstractConfigurator {

	/**
	 * The default name for the configuration file in the file system.
	 */
	public static final String DEFAULT_CONF_FILE_NAME = "default.conf";

	/**
	 * The default header information in the configuration file.
	 */
	public static final String DEFAULT_CONF_FILE_HEADER = "## The default configuration file. ##";

	/**
	 * The name of the configuration file in the file system.
	 */
	private String confFileName;

	/**
	 * The header information in the configuration file.
	 */
	private String confFileHeader;

	/**
	 * The default properties.
	 */
	private Properties defaultProperties;

	/**
	 * The user defined properties.
	 */
	private Properties properties;

	/**
	 * Constructor.
	 *
	 * @throws FailToLoadConfigurationFileException
	 */
	protected AbstractConfigurator() {
		confFileName = DEFAULT_CONF_FILE_NAME;
		confFileHeader = DEFAULT_CONF_FILE_HEADER;

		// instantiate the default properties...
		defaultProperties = new Properties();
		// ...and load them
		loadDefaults();
		/*
		 * instantiate the user properties with the default ones as fall-back
		 * values...
		 */
		properties = new Properties(defaultProperties);

		// ... and then try to load the user defined properties
		try {
			load();
		} catch (FailToLoadConfigurationFileException flcfe) {
			flcfe.printStackTrace();
		}

		store();
	}

	/**
	 * Sets a user defined configuration file name.
	 *
	 * @param confFileName
	 *     The configuration file name to set.
	 */
	public void setConfigurationFileName(String confFileName) {
		this.confFileName = confFileName;
	}

	/**
	 * Gets the user defined configuration file name.
	 *
	 * @return The configuration file name.
	 */
	public String getConfigurationFileName() {
		return confFileName;
	}

	/**
	 * Sets a user defined configuration file header.
	 *
	 * @param confFileHeader
	 *     The configuration file header to set.
	 */
	public void setConfigurationFileHeader(String confFileHeader) {
		this.confFileHeader = confFileHeader;
	}

	/**
	 * Gets the user defined configuration file header.
	 *
	 * @return The configuration file header.
	 */
	public String getConfigurationFileHeader() {
		return confFileHeader;
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
	 * @param properties
	 *     The user properties to set.
	 */
	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	/**
	 * Gets all the user defined properties.
	 *
	 * @return The user defined properties.
	 */
	public Properties getProperties() {
		return properties;
	}

	/**
	 * Places a property to the property list.
	 *
	 * @param name
	 *     The name to be placed in the property list.
	 * @param value
	 *     The value corresponding to <code>name</code>.
	 */
	public void assign(String name, String value) {
		properties.setProperty(name, value);
		store();
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
	 * @see AbstractConfigurator#getBooleanProperty(String)
	 * @see AbstractConfigurator#getIntegerProperty(String)
	 */
	public String property(String name) {
		return properties.getProperty(name, propertyDefault(name));
	}

	/**
	 * Gets the property value of the given property name as a {@code boolean}
	 * representation.
	 *
	 * @param name
	 *     The property name.
	 *
	 * @return The property value of the given property name as {@code boolean}.
	 */
	public boolean propertyBoolean(String name) {
		return Boolean.parseBoolean(property(name));
	}

	/**
	 * Gets the property value of the given property name as an {@code integer}
	 * representation.
	 *
	 * @param name
	 *     The property name.
	 *
	 * @return The property value of the given property name as {@code integer}.
	 */
	public int propertyInteger(String name) {
		return Integer.parseInt(property(name));
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
	 */
	public String propertyDefault(String name) {
		return defaultProperties.getProperty(name);
	}

	/**
	 * Loads the user defined configuration properties.
	 *
	 * @throws FailToLoadConfigurationFileException
	 */
	public void load() throws FailToLoadConfigurationFileException {
		try {
			properties.load(new FileInputStream(confFileName));
		} catch (FileNotFoundException fnfe) {
			// throw new FailToLoadConfigurationFileException(fnfe)
		} catch (IOException ioe) {
			// throw new FailToLoadConfigurationFileException(ioe);
		}
	}

	/**
	 * <p>
	 * Loads the default configuration properties.
	 * </p>
	 * <p>
	 * Override this method in order to hardcode application specific
	 * default properties.
	 * <p>
	 */
	protected abstract void loadDefaults();

	/**
	 * Stores the configuration file to persistent storage.
	 *
	 * @return {@code true} if the configuration has been stored successfully;
	 *         {@code false} otherwise.
	 */
	public boolean store() {
		boolean success;

		try {
			FileOutputStream out = new FileOutputStream(this.confFileName);
			this.properties.store(out, this.confFileName);
			success = true;
		} catch (IOException e) {
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
			FileOutputStream out = new FileOutputStream(confFileName);
			properties.store(out, confFileName);
			success = true;
		} catch (IOException e) {
			success = false;
		}

		return success;
	}

}