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
    private double gpa;
    private String fatherName;
    private String motherName;
    private String address;
    private String phoneNumber;
    
    public Student(String firstName, String lastName,int age, double gpa, String fatherName, String motherName, String address, String phoneNumber ) {
        super(firstName,lastName, age);
        this.gpa = gpa;
        //this.parentName = parentName;
        this.fatherName = fatherName;
        this.motherName = motherName;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
        
    public Student(String data) {
        super(data);
        String[] parsedString = data.split(",");
        setGpa(Double.parseDouble(parsedString[3]));
        setFatherName(parsedString[4]);
        setMotherName(parsedString[5]);
        setAddress(parsedString[6]);
        setPhoneNumber(parsedString[7]);
    }
    
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }
    
    public void setMotherName(String motherName) {
        this.motherName = motherName;
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

    public String getFatherName() {
        return fatherName;
    }
    
    public String getMotherName() {
        return motherName;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    
    
}
