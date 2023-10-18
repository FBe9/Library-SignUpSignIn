/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
