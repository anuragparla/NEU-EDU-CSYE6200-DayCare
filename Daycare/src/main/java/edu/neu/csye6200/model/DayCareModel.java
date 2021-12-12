/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.neu.csye6200.model;

import java.time.LocalDate;
import java.util.ArrayList;
//import java.util.Date;
import java.util.List;

/**
 *
 * @author anuragparla
 */
public class DayCareModel implements DayCareModelInterface{
    private List<Person> studentList = new ArrayList<>();
    private List<Person> teacherList = new ArrayList<>();
    private List<Vaccine> vaccineList = new ArrayList<>();
    @Override
    public void createPersonViaCsv(String csvData) {
        String [] temp = csvData.split(",");
        int tempAge = Integer.parseInt(temp[2]);
        PersonFactory p;
        if (tempAge >360) {
            p = PersonFactoryProvider.getFactory("Teacher");
            studentList.add(p.create("Teacher", csvData));
        }
        else {
            p = PersonFactoryProvider.getFactory("Student");
            teacherList.add(p.create("Student", csvData));
        }
        
    }

    @Override
    public void createStudentViaForm(String firstName, String lastName, 
                                     int age, double gpa, String fatherName, 
                                     String motherName, String address, 
                                     String phoneNumber, LocalDate walkInDate) {
        PersonFactory p;
        p = PersonFactoryProvider.getFactory("Student");
        studentList.add(p.create(firstName,lastName, age, gpa,
                        fatherName,motherName, address, phoneNumber,walkInDate));
    }

    @Override
    public void createTeacherViaForm(String firstName, String lastName, 
                                     int age, int credits, 
                                     LocalDate reviewDate) {
        PersonFactory p;
         p = PersonFactoryProvider.getFactory("Teacher");
         teacherList.add(p.create(firstName,lastName, age, credits, reviewDate));
    }

    @Override
    public void addImmunizationRecordViaForm(int studentId, String vaccineName,
                                             String vaccineDescription, 
                                             int maxDoses) {
        VaccineFactory v ;
        v = VaccineFactoryProvider.getFactory("Vaccine");
        vaccineList.add(v.create(studentId, vaccineName, vaccineDescription, 
                                 maxDoses));
                                                 
        
        
    }

    @Override
    public void addImmunizationRecordViaCsv(String csvData) {
        VaccineFactory v;
        v = VaccineFactoryProvider.getFactory("Vaccine");
        vaccineList.add(v.create(csvData));
    }
    
    
}
