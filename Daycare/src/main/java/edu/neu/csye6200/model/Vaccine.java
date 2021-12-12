/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.neu.csye6200.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 
 * @author anuragparla
 */
public class Vaccine {
   
    private String vaccineName;
    private String vaccineDescription;
    private int maxDoses;
    //private Date dateAdministered;
    private LocalDate latestImmunizationDate;
    private List<Dose> doseDetails;
    //private List<ArrayList<Integer>> vaccineList = new ArrayList<ArrayList<>>>();

    public Vaccine( String vaccineName, String vaccineDescription, int maxDoses) {
        
        this.vaccineName = vaccineName;
        this.vaccineDescription = vaccineDescription;
        this.maxDoses = maxDoses;
        this.doseDetails = new ArrayList<>();
    }
    
    public Vaccine (String csvData) {
        String[] parsedVaccineData = {};
        setVaccineName(parsedVaccineData[0]);
        setVaccineDescription(parsedVaccineData[1]);
        setMaxDoses(Integer.parseInt(parsedVaccineData[2]));
        this.doseDetails = new ArrayList<>();
        
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

    public LocalDate getLatestImmunizationDate() {
        return latestImmunizationDate;
    }

    public void setLatestImmunizationDate(LocalDate latestImmunizationDate) {
        this.latestImmunizationDate = latestImmunizationDate;
    }

    public List<Dose> getDoseDetails() {
        return doseDetails;
    }

    public void setDoseDetails(List<Dose> doseDetails) {
        this.doseDetails = doseDetails;
    }
    
    public void addDose(Dose dose)
    {
        doseDetails.add(dose);
    }
}   

