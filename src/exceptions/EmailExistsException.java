package exceptions;

/**
 * Class for existing email exception.
 * @author Olivia
 */
public class EmailExistsException extends Exception{

    /**
     * Creates an empty instance of EmailExistsException.
     */
    public EmailExistsException() {
    }
    
    /**
     * Creates an instance of EmailExistsException with a detail message.
     * @param message the detail message.
     */
    public EmailExistsException(String message) {
        super(message);
    }
}
