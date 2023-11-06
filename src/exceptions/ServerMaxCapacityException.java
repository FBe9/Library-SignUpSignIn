package exceptions;

/**
 * Class for the server at max capacity exception.
 *
 * @author Olivia
 */
public class ServerMaxCapacityException extends Exception {

    /**
     * Creates an empty instance of the ServerMaxCapacityException.
     */
    public ServerMaxCapacityException() {
    }

    /**
     * Creates an instance of the ServerMaxCapacityException with a detail
     * message.
     *
     * @param message the detail message
     */
    public ServerMaxCapacityException(String message) {
        super(message);
    }
}
