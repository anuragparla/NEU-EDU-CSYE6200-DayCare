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

    public Teacher(int credits, int age, String name) {
        super(age, name);
        this.credits = credits;
    }

    public Teacher( String data) {
        super(data);
        String[] parsedTeacherData = data.split(",");
        setCredits(Integer.parseInt(parsedTeacherData[2]));
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

     
}
