/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.neu.csye6200.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author anuragparla
 */
public class Vaccine {
    private int studentId;
    private String vaccineName;
    private String vaccineDescription;
    private int maxDoses;
    //private Date dateAdministered;
    private Date latestImmunizationDate;
    private List<List<String>> doseDetails;
    //private List<ArrayList<Integer>> vaccineList = new ArrayList<ArrayList<>>>();

    public Vaccine(int studentId, String vaccineName, String vaccineDescription,
                    int maxDoses) {
        this.studentId = studentId;
        this.vaccineName = vaccineName;
        this.vaccineDescription = vaccineDescription;
        this.maxDoses = maxDoses;
        this.doseDetails = new ArrayList<List<String>>();
    }
    
    public Vaccine (String csvData) {
        String[] parsedVaccineData = {};
        setStudentId(Integer.parseInt(parsedVaccineData[0]));
        setVaccineName(parsedVaccineData[1]);
        setVaccineDescription(parsedVaccineData[2]);
        setMaxDoses(Integer.parseInt(parsedVaccineData[3]));
        setDoseDetails(new ArrayList<List<String>>());
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getVaccineName() {
        return vaccineName;
    }

    public void setVaccineName(String vaccineName) {
        this.vaccineName = vaccineName;
    }

    public String getVaccineDescription() {
        return vaccineDescription;
    }

    public void setVaccineDescription(String vaccineDescription) {
        this.vaccineDescription = vaccineDescription;
    }

    public int getMaxDoses() {
        return maxDoses;
    }

    public void setMaxDoses(int maxDoses) {
        this.maxDoses = maxDoses;
    }

    public Date getLatestImmunizationDate() {
        return latestImmunizationDate;
    }

    public void setLatestImmunizationDate(Date latestImmunizationDate) {
        this.latestImmunizationDate = latestImmunizationDate;
    }

    public List<List<String>> getDoseDetails() {
        return doseDetails;
    }

    public void setDoseDetails(List<List<String>> doseDetails) {
        this.doseDetails = doseDetails;
    }
    
    
    public void injectShot() {
        
    }
    
    public boolean checkDosesGiven() {
        return false;
    }
    
    
    
    
    
}   

