/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.neu.csye6200.controller;

import edu.neu.csye6200.model.Alert;
import edu.neu.csye6200.model.AlertRecords;
import edu.neu.csye6200.model.DayCare;
import edu.neu.csye6200.model.Student;
import edu.neu.csye6200.model.Teacher;
import edu.neu.csye6200.model.Vaccine;
import java.util.Date;
import java.util.Vector;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author varun
 */
public class AlertController {
    public static long dateOffset = (365 * 24 * 60 * 60 * 1000);
    public static void generateTeacherAlerts(Vector<Teacher> teachers){
        AlertRecords a = AlertRecords.getInstance();
        for(int i =0; i< teachers.size(); i++){
            Teacher t = teachers.get(i);
            if(isOneYearAgo(t.getReviewDate())){
                String des = "Teacher: "+t.getFirstName()+" "+t.getLastName()+"'s review is pending." + " Last Review date was on "+t.getReviewDate();
                Alert alert = new Alert(des);
                a.getAlerts().add(alert);
            }
        }
    }
    
    
    public static void generateStudentAlerts(Vector<Student> studentsList){
        AlertRecords a = AlertRecords.getInstance();
        
        for(int i =0; i< studentsList.size(); i++){
            Student student = studentsList.get(i);
            
            if(isOneYearAgo(student.getWalkInDate())){
                String des = "Student: "+student.getFirstName()+" "+student.getLastName()+"'s review is pending." + " Last walk in date was on "+student.getWalkInDate();
                Alert alert = new Alert(des);
                a.getAlerts().add(alert);
            }
            
            for (Vaccine vaccine :student.getVaccineList())
            {
             
                
                if(vaccine.getDoseDetails().size() < vaccine.getMaxDoses())
                {
                     Date date = vaccine.getLatestImmunizationDate();
                     if(isOneYearAgo(date))
                     {
                         String des = "Student: "+student.getFirstName()+" "+student.getLastName()+" is due for "+ vaccine.getVaccineName() +" vaccine.";
                        Alert alert = new Alert(des);
                        a.getAlerts().add(alert);
                     }
                         
                }    
            }
            
           
        }
    }
    
    public static boolean isOneYearAgo(Date inputDate){
        
        Date d = new Date();// Get "now".
        long dLong = d.getTime();
        long diffInMillies = Math.abs(d.getTime() - inputDate.getTime());
        long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
        return diff>365;
    }
    
    public static void generateAllALerts(DayCare dayCare)
    {
  
        AlertRecords a = AlertRecords.getInstance();
        a.clearRecords();
        generateTeacherAlerts(dayCare.getTeachersList());
        generateStudentAlerts(dayCare.getStudentsList());
    }
}
