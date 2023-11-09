package models;

/**
 * The Privilege enum defines different privilege levels that can be assigned to
 * users in the application. It includes two privilege levels: USER and ADMIN.
 *
 * @author Nerea
 * @author Irati
 */
public enum Privilege {
    /**
     * Users with 'USER' privilege have limited access.
     */
    USER,
    /**
     * Users with 'ADMIN' have all the privileges.
     */
    ADMIN
}
