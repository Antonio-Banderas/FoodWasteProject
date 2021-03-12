package com.example.demo.models;

/**
 * @author Julius Panduro
 * Time: 09.52
 * Date: 12/03/2021
 */
public class User {
    private String firstName;
    private String lastName;
    private String address;
    private int zipCode;

    public User(String firstName, String lastName, String address, int zipCode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.zipCode = zipCode;
    }
}
