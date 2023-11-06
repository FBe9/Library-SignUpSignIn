package message;

import java.io.Serializable;
import models.User;

/**
 * The ResponseRequest class is responsible for handling communication between
 * the client and the server. It encapsulates information about the user and the
 * message being exchanged.
 *
 * @author Irati
 */
public class ResponseRequest implements Serializable{

    private User user;
    private Message message;

    /**
     * Default constructor for ResponseRequest.
     */
    public ResponseRequest() {
    }

    /**
     * Constructor that initialises a ResponseRequest with user and message.
     *
     * @param user The user associated with the response.
     * @param message The message being sent.
     */
    public ResponseRequest(User user, Message message) {
        this.user = user;
        this.message = message;
    }

    /**
     * Get the user associated with this ResponseRequest.
     *
     * @return The user associated with this ResponseRequest.
     */
    public User getUser() {
        return user;
    }

    /**
     * Set the user for this ResponseRequest.
     *
     * @param user The user to associate with this ResponseRequest.
     */
    public void setUser(User user) {
        this.user = user;
    }

    /**
     * Get the message contained in this ResponseRequest.
     *
     * @return The message contained in this ResponseRequest.
     */
    public Message getMessage() {
        return message;
    }

    /**
     * Set the message for this ResponseRequest.
     *
     * @param message The message to set for this ResponseRequest.
     */
    public void setMessage(Message message) {
        this.message = message;
    }

}
