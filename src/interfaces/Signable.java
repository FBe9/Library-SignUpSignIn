package interfaces;

import exceptions.*;
import models.User;


/**
 * The Signable interface defines methods for signUp and signIn.
 * @author Nerea and Irati
 */
public interface Signable {
    
    /**
     * Sign up a user with the provided user information.
     *
     * @param user The User object containing user details for registration.
     * @return A User object representing the registered user.
     * @throws ServerErrorException If there is a server error during the sign-up process.
     * @throws EmailExistsException If the provided email address already exists in the database.
     */
    public User signUp(User user) throws ServerErrorException, EmailExistsException;
    
    /**
     * Sign in a user with the provided user credentials.
     *
     * @param user The User object containing user credentials for sign-in.
     * @return A User object representing the signed-in user.
     * @throws ServerErrorException If there is a server error during the sign-in process.
     * @throws LoginCredentialException If the provided login credentials are invalid.
     */

    public User signIn(User user) throws ServerErrorException, LoginCredentialException;
}
