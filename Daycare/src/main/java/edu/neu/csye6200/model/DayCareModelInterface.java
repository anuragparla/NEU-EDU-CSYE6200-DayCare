/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.neu.csye6200.model;

//import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author anuragparla
 */
public interface DayCareModelInterface {
    Person createPersonViaCsv(String csvData);
    Person createStudentViaForm(String firstName, String lastName,int age, 
                              double gpa,String fatherName, String motherName,
                              String address,String phoneNumber, Date walkInDate);
    Person createTeacherViaForm(String firstName, String lastName, int age, 
                              int credits, Date reviewDate);
    Vaccine addImmunizationRecordViaForm( String vaccineName, 
                               String vaccineDescription,int maxDoses);
    
    Vaccine addImmunizationRecordViaCsv(String csvData);
    
    
    
    
    
    
    
}
