package exceptions;

/**
 * Class for the database error exception.
 * @author Olivia
 */
public class DatabaseErrorException extends Exception{

    /**
     * Creates an empty instance of DatabaseErrorException.
     */
    public DatabaseErrorException() {
    }

    /**
     * Creates an instance of DatabaseErrorException with a detail message.
     * @param message the detail message.
     */
    public DatabaseErrorException(String message) {
        super(message);
    }
}
