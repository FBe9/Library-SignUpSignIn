package models;

/**
 * The User class represents user information in the application. It has
 * differnt attributes: email, first name, last name, mobile number, address,
 * and password. Users can have different privilege defined by the 'Privilage'
 * enumeration.
 *
 * @author Nerea and Irati
 */
public class User {

    private String email;
    private String name;
    private String mobile;
    private String street;
    private String city;
    private String zip;
    private String password;
    private Privilage privilage;

    //Contructors
    /**
     * Constructs a User with the provided details.
     *
     * @param email The user's email.
     * @param name The user's name (typically first name and last name
     * combined).
     * @param mobile The user's mobile number.
     * @param street The user's street address.
     * @param city The user's city.
     * @param zip The user's zip code.
     * @param password The user's password.
     * @param privilage The user's privilege level defined by the 'Privilage'
     * enumeration.
     */
    public User(String email, String name, String mobile, String street, String city, String zip, String password, Privilage privilage) {
        this.email = email;
        this.name = name;
        this.mobile = mobile;
        this.street = street;
        this.city = city;
        this.zip = zip;
        this.password = password;
        this.privilage = privilage;
    }

    /**
     * Constructs a User with just email and password.
     *
     * @param email The user's email.
     * @param password The user's password.
     */
    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    /**
     * Default constructor for User.
     */
    public User() {
    }
    //---------------------------------------------------------------------

    //Getters and Setters
    /**
     * Get the email address of the user.
     *
     * @return The email address of the user.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Set the email address for the user.
     *
     * @param email The email address to set.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Get the full name of the user.
     *
     * @return The full name of the user.
     */
    public String getName() {
        return name;
    }

    /**
     * Set the full name for the user.
     *
     * @param name The full name to set.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get the mobile number of the user.
     *
     * @return The mobile number of the user.
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * Set the mobile number for the user.
     *
     * @param mobile The mobile number to set.
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * Get the street address of the user.
     *
     * @return The street address of the user.
     */
    public String getStreet() {
        return street;
    }

    /**
     * Set the street address for the user.
     *
     * @param street The street address to set.
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * Get the city of the user.
     *
     * @return The city of the user.
     */
    public String getCity() {
        return city;
    }

    /**
     * Set the city for the user.
     *
     * @param city The city to set.
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Get the ZIP code of the user.
     *
     * @return The ZIP code of the user.
     */
    public String getZip() {
        return zip;
    }

    /**
     * Set the ZIP code for the user.
     *
     * @param zip The ZIP code to set.
     */
    public void setZip(String zip) {
        this.zip = zip;
    }

    /**
     * Get the password of the user.
     *
     * @return The password of the user.
     */
    public String getPassword() {
        return password;
    }

    /**
     * Set the password for the user.
     *
     * @param password The password to set.
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Get the privilege level of the user.
     *
     * @return The privilege level of the user, defined by the 'Privilage'
     * enumeration.
     */
    public Privilage getPrivilage() {
        return privilage;
    }

    /**
     * Set the privilege level for the user.
     *
     * @param privilage The privilege level to set, defined by the 'Privilage'
     * enumeration.
     */
    public void setPrivilage(Privilage privilage) {
        this.privilage = privilage;
    }
    //---------------------------------------------------------------------
}
