/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.neu.csye6200.model;

/**
 *
 * @author anuragparla
 */
public class Person extends AbstractPerson {
    protected int age;
    protected String name;
    
    public Person(int age, String name) {
        this.age = age;
        this.name = name;
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
    
}
