/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.neu.csye6200.model;

import java.time.LocalDate;
//import java.util.Date;

/**
 *
 * @author anuragparla
 */
public class Teacher extends Person{
    private int credits;
    private LocalDate reviewDate;
    private int teacherId;
    public Teacher( String firstName, String lastName, int age, int credits,
                    LocalDate reviewDate) {
        super(firstName,lastName, age);
        this.credits = credits;
        this.reviewDate = reviewDate;
    }

    public Teacher( String data) {
        super(data);
        String[] parsedTeacherData = data.split(",");
        setCredits(Integer.parseInt(parsedTeacherData[3]));
        setReviewDate(LocalDate.parse(parsedTeacherData[4]));
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public void setReviewDate(LocalDate reviewDate) {
        this.reviewDate = reviewDate;
    }
    
    public LocalDate getReviewDate() {
        return reviewDate;
    }
    
    public void setTeacherId() {
        this.teacherId = teacherId + 100;
    }
    public int getTeacherId() {
        return teacherId;
    }
}
