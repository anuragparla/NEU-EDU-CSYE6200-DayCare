/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.neu.csye6200.model;
import java.util.List;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
//import java.util.Date;

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
    private  int studentId ;
    private LocalDate walkInDate;
    private List<Vaccine> vaccineList;
    
    public Student(String firstName, String lastName,int age, double gpa, 
                   String fatherName, String motherName, String address,
                   String phoneNumber, LocalDate walkInDate ) {
        super(firstName,lastName, age);
        this.gpa = gpa;
        this.fatherName = fatherName;
        this.motherName = motherName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.walkInDate = walkInDate;
    }
        
    public Student(String data) {
        super(data);
        String[] parsedString = data.split(",");
        setGpa(Double.parseDouble(parsedString[3]));
        setFatherName(parsedString[4]);
        setMotherName(parsedString[5]);
        setAddress(parsedString[6]);
        setPhoneNumber(parsedString[7]);
        //SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        setWalkInDate(LocalDate.parse(parsedString[8]));
        //Date date = formatter.parse(dateInString);
        //setWalkInDate(LocalDate.parse(parsedString[8]));
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
    
    public void setStudentId() {
        this.studentId = studentId +1;
    }
    
    public int getStudentId() {
        return studentId;
    }
    public void addVaccine(Vaccine vaccine)
    {
        vaccineList.add(vaccine);
    }
    
    
    public void setWalkInDate(LocalDate walkInDate) {
        this.walkInDate = walkInDate;
    }
    
    public LocalDate getWalkInDate() {
        return walkInDate;
    }
}
