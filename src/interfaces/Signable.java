package interfaces;

import exceptions.*;
import models.User;

/**
 *
 * @author Nerea
 */
public interface Signable {

    public User signUp(User user) throws ServerErrorException;
    
    public User signIn(User user) throws ServerErrorException, LoginCredentialException;
}
