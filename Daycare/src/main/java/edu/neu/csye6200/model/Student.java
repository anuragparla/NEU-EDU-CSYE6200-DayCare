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
    public Student(int age, String name, double gpa ) {
        super(age,name);
        this.gpa = gpa;
        
    }

    @Override
    public void setage(int age) {
        this.age = age;
    }

    @Override
    public int getAge(int age) {
        return age;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
    
    public void setGPA() {
        this.gpa = gpa;
    }
    
    public double getGPA() {
        return gpa;
    }
}
