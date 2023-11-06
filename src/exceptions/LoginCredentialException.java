package exceptions;

/**
 * Class for the Login credentials exception.
 *
 * @author Nerea
 */
public class LoginCredentialException extends Exception {

    /**
     * Creates a new instance of <code>LoginCredentialException</code> without
     * detail message.
     */
    public LoginCredentialException() {
    }

    /**
     * Constructs an instance of <code>LoginCredentialException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public LoginCredentialException(String msg) {
        super(msg);
    }
}
