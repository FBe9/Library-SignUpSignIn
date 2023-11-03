package exceptions;

/**
 * Class for the Server error exception.
 *
 * @author Nerea
 */
public class ServerErrorException extends Exception {

    /**
     * Creates a new instance of <code>ServerErrorException</code> without
     * detail message.
     */
    public ServerErrorException() {
    }

    /**
     * Constructs an instance of <code>ServerErrorException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public ServerErrorException(String msg) {
        super(msg);
    }
}
