/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.neu.csye6200.view;

/**
 *
 * @author varun
 */
public class Student {
    
    private String firstName;
    private String lastName;
    private int age;
    
    public Student(String fN, String lN, int age){
        this.firstName = fN;
        this.lastName= lN;
        this.age = age;
    }
    
    public String getFirstName(){
        return this.firstName;
    }
    
    public String getLastName(){
        return this.lastName;
    }
    public int getAge(){
        return this.age;
    }
    
    
}
