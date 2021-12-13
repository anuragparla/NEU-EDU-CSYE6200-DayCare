
package edu.neu.csye6200.model;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Vector;

/**
 
 * @author anuragparla
 */
public class Vaccine {
   
    private String vaccineName;
    private String vaccineDescription;
    private int maxDoses;
    //private Date dateAdministered;
    private Date latestImmunizationDate;
    private Vector<Dose> doseDetails;
    
    public Vaccine( String vaccineName, String vaccineDescription, int maxDoses) {
        
        this.vaccineName = vaccineName;
        this.vaccineDescription = vaccineDescription;
        this.maxDoses = maxDoses;
        this.doseDetails = new Vector<>();
    }
    
    public Vaccine (String csvData) {
        String[] parsedVaccineData = csvData.split(",");
        setVaccineName(parsedVaccineData[0]);
        setVaccineDescription(parsedVaccineData[1]);
        setMaxDoses(Integer.parseInt(parsedVaccineData[2]));
        this.doseDetails = new Vector<>();
        
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

    public Vector<Dose> getDoseDetails() {
        return doseDetails;
    }

    public void setDoseDetails(Vector<Dose> doseDetails) {
        this.doseDetails = doseDetails;
    }
    
    public void addDose(Dose dose)
    {
        doseDetails.add(dose);
    }
}   

