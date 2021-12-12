/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.neu.csye6200.model;

import java.time.LocalDate;
//import java.util.Date;

/**
 *
 * @author anuragparla
 */
public interface DayCareModelInterface {
    void createPersonViaCsv(String csvData);
    void createStudentViaForm(String firstName, String lastName,int age, 
                              double gpa,String fatherName, String motherName,
                              String address,String phoneNumber, LocalDate walkInDate);
    void createTeacherViaForm(String firstName, String lastName, int age, 
                              int credits, LocalDate reviewDate);
    void addImmunizationRecordViaForm(int studentId, String vaccineName, 
                               String vaccineDescription,int maxDoses);
    
    void addImmunizationRecordViaCsv(String csvData);
    
    //void addClassroom()
    
    
    
    
    
}
