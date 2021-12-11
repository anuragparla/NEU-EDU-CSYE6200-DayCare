/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.neu.csye6200.model;

/**
 *
 * @author anuragparla
 */
public class PersonFactory {

    
    public Person create(String type, String data) {
        if ("Student".equalsIgnoreCase(type)) {
            return new Student(data);
        }
        
        else if ("Teacher".equalsIgnoreCase(type)){
            return new Teacher(data);
        }
        return null;
    }
    
    public Person create(String firstName, String lastName, int age,
                         double gpa, String fatherName, String motherName,
                         String address, String phoneNumber) {
        
        return new Student(firstName, lastName, age, gpa, fatherName,
                            motherName, address, phoneNumber);
            
    }
    
    public Person create(String firstName, String lastName, int age,
                         int credits) {
        
        return new Teacher(firstName, lastName, age, credits);
            
    }
    
    
    

   
    
    
}
