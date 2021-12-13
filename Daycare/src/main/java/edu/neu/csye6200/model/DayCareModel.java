/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.neu.csye6200.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
//import java.util.Date;
import java.util.List;

/**
 *
 * @author anuragparla
 */
public class DayCareModel implements DayCareModelInterface{
    
    @Override
    public Person createPersonViaCsv(String csvData) {
        String [] temp = csvData.split(",");
        int tempAge = Integer.parseInt(temp[2]);
        PersonFactory p;
        if (tempAge >360) {
            p = PersonFactoryProvider.getFactory("Teacher");
            return p.create("Teacher", csvData);
        }
        
            p = PersonFactoryProvider.getFactory("Student");
            return p.create("Student", csvData);
        
       
    }

    @Override
    public Person createStudentViaForm(String firstName, String lastName, 
                                     int age, double gpa, String fatherName, 
                                     String motherName, String address, 
                                     String phoneNumber, Date walkInDate) {
        PersonFactory p;
        p = PersonFactoryProvider.getFactory("Student");
        return p.create(firstName,lastName, age, gpa,
                        fatherName,motherName, address, phoneNumber,walkInDate);
    }

    @Override
    public Person createTeacherViaForm(String firstName, String lastName, 
                                     int age, int credits, 
                                     Date reviewDate) {
        PersonFactory p;
        p = PersonFactoryProvider.getFactory("Teacher");
        return p.create(firstName,lastName, age, credits, reviewDate);
    }

    @Override
    public Vaccine addImmunizationRecordViaForm(String vaccineName,
                                             String vaccineDescription, 
                                             int maxDoses) {
        VaccineFactory v ;
        v = VaccineFactoryProvider.getFactory("Vaccine");
        return v.create( vaccineName, vaccineDescription, 
                                 maxDoses);
                                                 
        
        
    }

    @Override
    public Vaccine addImmunizationRecordViaCsv(String csvData) {
        VaccineFactory v;
        v = VaccineFactoryProvider.getFactory("Vaccine");
        return v.create(csvData);
    }
    
    
}
