/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.neu.csye6200.model;

/**
 *
 * @author anuragparla
 */
public class VaccineFactory {

    public Vaccine create(String csvData) {
        return new Vaccine(csvData);
    }
    
   public Vaccine create(int studentId, String vaccineName, 
                          String vaccineDescription,int maxDoses) {
        return new Vaccine (studentId,vaccineName,vaccineDescription,maxDoses);
    }

    
}
