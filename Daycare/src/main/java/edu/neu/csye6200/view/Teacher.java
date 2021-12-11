/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.neu.csye6200.view;

/**
 *
 * @author SanthoshMaddi
 */
public class Teacher {
    
    private String firstName;
    private String lastName;
    private int age;
    private int credits;
    private String address;
    private String phoneNumber;

    
    public Teacher(String firstName, String LastName,int age, int credits, String address, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.credits = credits;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
    
    public Teacher(String csvString)
    {
        
        String[] parsedString = csvString.split(",");
        
        setFirstName(parsedString[0]);
        setLastName(parsedString[1]);
        setAge(Integer.parseInt(parsedString[2]));
        setCredits(Integer.parseInt(parsedString[3]));
        setAddress(parsedString[4]);
        setPhoneNumber(parsedString[5]);
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


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
 
}
