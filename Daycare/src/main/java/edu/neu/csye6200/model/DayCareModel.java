/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.neu.csye6200.model;

import java.util.Date;

/**
 *
 * @author anuragparla
 */
public class DayCareModel implements DayCareModelInterface{

    @Override
    public void createPersonViaCsv(String csvData) {
        String [] temp = csvData.split(",");
        int tempAge = Integer.parseInt(temp[2]);
        PersonFactory p;
        if (tempAge >360) {
            p = PersonFactoryProvider.getFactory("Teacher");
            p.create("Teacher", csvData);
        }
        else {
            p = PersonFactoryProvider.getFactory("Student");
        }
        
    }

    @Override
    public void createStudentViaForm(String firstName, String lastName, int age, double gpa, String fatherName, String motherName, String address, String phoneNumber, Date walkInDate) {
        
    }

    @Override
    public void createTeacherViaForm(String firstName, String lastName, int age, int credits, Date reviewDate) {
        
    }

    @Override
    public void addImmunizationRecordViaForm(int studentId, String vaccineName, String vaccineDescription, int maxDoses) {
        
    }

    @Override
    public void addImmunizationRecordViaCsv(String csvData) {
        
    }
    
}
