package toolbox.config.exceptions;

/**
 * @author billy
 * @version 0.1
 * 
 */
public class FailToLoadConfigurationFileException extends Exception {

	/**
	 * Serial version UID
	 */
	private static final long serialVersionUID = 1575017197966484936L;

	/**
	 * 
	 */
	public FailToLoadConfigurationFileException() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 */
	public FailToLoadConfigurationFileException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param cause
	 */
	public FailToLoadConfigurationFileException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 * @param cause
	 */
	public FailToLoadConfigurationFileException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

}