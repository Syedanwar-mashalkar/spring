package com.contact.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
 // For handling large binary objects

import java.time.LocalDate;

@Entity
public class Contact {

	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String city;
	    private LocalDate dateOfBirth;  
	    private String email;
	    private String firstName;
	    private String gender;
	    private String lastName;
	    private String phoneNumber;
	    
	    private String state; // For storing profile photo as binary data

    // Constructors
    public Contact() {
        super();
    }

    public Contact(Long id, String firstName, String lastName, String email, String phoneNumber, LocalDate dateOfBirth, String city, String state, String gender, byte[] profilePhoto) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.dateOfBirth = dateOfBirth;
        this.city = city;
        this.state = state;
        this.gender = gender;
       
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    

    

    @Override
    public String toString() {
        return "Contact [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email +
               ", phoneNumber=" + phoneNumber + ", dateOfBirth=" + dateOfBirth + ", city=" + city + ", state=" + state +
               ", gender=" + gender + "]";
    }
}
