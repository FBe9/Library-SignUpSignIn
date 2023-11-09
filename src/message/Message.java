package message;

/**
 * The Message enum is used for communication between the client and server in
 * the application.
 *
 * @author Irati
 */
public enum Message {
    /**
     * A message indicating a signup request.
     */
    SIGNUP,
    /**
     * A message indicating a signin request.
     */
    SIGNIN,
    /**
     * A message indicating a successful response.
     */
    RESPONSE_OK,
    /**
     * A message indicating an error related to user credentials.
     */
    CREDENTIAL_ERROR,
    /**
     * A message indicating that the email already exists.
     */
    EMAIL_EXITS_ERROR,
    /**
     * A message indicating that there is a problem with the server.
     */
    SERVER_ERROR,
    /**
     * A message indicating that the server has reached its capacity.
     */
    SERVER_CAPACITY_ERROR
}
