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
    private int doseNumber;
    private  Date date;

    public int getDoseNumber() {
        return doseNumber;
    }

    public void setDoseNumber(int doseNumber) {
        this.doseNumber = doseNumber;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
    public Dose(int doseNumber, Date date) {
        this.doseNumber = doseNumber;
        this.date = date;
    }
    
    
    
}
