/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.neu.csye6200.controller;

import edu.neu.csye6200.model.Alert;
import edu.neu.csye6200.model.AlertRecords;
import edu.neu.csye6200.model.Teacher;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.Vector;

/**
 *
 * @author varun
 */
public class AlertController {
    public static long dateOffset = (365 * 24 * 60 * 60 * 1000);
    public static void generateTeacherAlerts(List<Teacher> teachers){
        AlertRecords a = AlertRecords.getInstance();
        for(int i =0; i< teachers.size(); i++){
            Teacher t = teachers.get(i);
            if(isOneYearAgo(t.getReviewDate())){
                String des = "Teacher: "+t.getFirstName()+" "+t.getLastName()+"'s review is pending. Last Review date was on "+t.getReviewDate();
                Alert alert = new Alert(des);
                a.getAlerts().add(alert);
            }
        }
    }
    
    public static boolean isOneYearAgo(Date inputDate){
        
        Date d = new Date();// Get "now".
        long dLong = d.getTime();
        long oneYearAgo = dLong - dateOffset; 
        return inputDate.getTime() < oneYearAgo;
    }
}
