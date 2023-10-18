/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author Nerea and Irati
 */
public class User {
    private String email;
    private String firstName;
    private String lastName;
    private String mobile;
    private String street;
    private String city;
    private String zip;
    private String password;
    private Privilage privilage;

    //Contructors
    public User(String email, String firstName, String lastName, String mobile, String street, String city, String zip, String password, Privilage privilage) {
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobile = mobile;
        this.street = street;
        this.city = city;
        this.zip = zip;
        this.password = password;
        this.privilage = privilage;
    }

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public User() {
    }
    //---------------------------------------------------------------------

    //Getters and Setters
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Privilage getPrivilage() {
        return privilage;
    }

    public void setPrivilage(Privilage privilage) {
        this.privilage = privilage;
    }
    //---------------------------------------------------------------------
}
