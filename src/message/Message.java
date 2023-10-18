package message;

/**
 * The Message enum is used for communication between the client and server in the application.
 *
 * This enumeration defines the following message types:
 * - SIGNUP: A message indicating a signup request.
 * - SIGNIN: A message indicating a signin request.
 * - RESPONSE_OK: A message indicating a successful response.
 * - DATABASE_ERROR: A message indicating that there is an error in the database.
 * - CREDENTIAL_ERROR: A message indicating an error related to user credentials.
 * - EMAIL_EXISTS_ERROR: A message indicating that the email already exists.
 * - SERVER_ERROR: A message indicating that there is a problem with the server.
 * - SERVER_CAPACITY_ERROR: A message indicating that the server has reached its capacity.
 *
 * @author Irati
 */
public enum Message {
    SIGNUP,
    SIGNIN,
    RESPONSE_OK,
    DATABASE_ERROR,
    CREDENTIAL_ERROR,
    EMAIL_EXITS_ERROR,
    SERVER_ERROR,
    SERVER_CAPACITY_ERROR
}
