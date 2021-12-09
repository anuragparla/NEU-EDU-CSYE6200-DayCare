/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.neu.csye6200.model;

/**
 *
 * @author anuragparla
 */
public class Teacher extends Person{
    private int credits;
    public Teacher(int age, String name, int credits) {
        super(age, name);
        this.credits = credits;
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
    
    public void setCredits(int credits) {
        this.credits = credits;
    }
    
    public int getCredits() {
        return credits;
    }
    
}
