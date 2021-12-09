/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.neu.csye6200.model;

/**
 *
 * @author anuragparla
 */
public class Student extends Person {

    public Student(double gpa, String parentName, String address, String phoneNumber, int age, String name) {
        super(age, name);
        this.gpa = gpa;
        this.parentName = parentName;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public Student(double gpa, String parentName, String address, String phoneNumber, String data) {
        super(data);
        this.gpa = gpa;
        this.parentName = parentName;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
    private double gpa;
    private String parentName;
    private String address;
    private String phoneNumber;

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
        
    public double getGpa() {
        return gpa;
    }

    public String getParentName() {
        return parentName;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    
    
}
