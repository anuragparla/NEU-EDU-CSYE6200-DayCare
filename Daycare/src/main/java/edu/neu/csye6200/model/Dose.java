/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.neu.csye6200.model;

import java.util.Date;

/**
 *
 * @author anuragparla
 * this class is responsible for the details related to the dose date 
 */
public class Dose {
    private boolean checkDose;
    private Date date;
    private Date doseDeadline;

    public boolean isCheckDose() {
        return checkDose;
    }

    public void setCheckDose(boolean checkDose) {
        this.checkDose = checkDose;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDoseDeadline() {
        return doseDeadline;
    }

    public void setDoseDeadline(Date doseDeadline) {
        this.doseDeadline = doseDeadline;
    }

    public Dose(boolean checkDose, Date date, Date doseDeadline) {
        this.checkDose = checkDose;
        this.date = date;
        this.doseDeadline = doseDeadline;
    }
    
    
    
}
