/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.neu.csye6200.util;

import java.util.HashMap;

/**
 *
 * @author SanthoshMaddi
 */
public class VaccineRules {
    

    public static HashMap<String, Integer>  getImmunizationRequirements(int age)
    {
        
        HashMap<String, Integer> map = new HashMap<>();
        if(age<2)
        {
            map.put("Hepatitis B", 3);
            map.put("Rotavirus", 3);
            map.put("Dtap", 4);
        }
        
        else if(age <5)
        {
            //preschool
           map.put("Hib", 4);
           map.put("Dtap", 4);
           map.put("Polio", 3);
           map.put("Hepatitis B", 3);
           map.put("MMR", 1);
           map.put("Varicella", 1);
           
       
        }
        else if(age < 12)
        {
           //kindegdargden
           
           map.put("Dtap", 5);
           map.put("Polio", 4);
           map.put("Hepatitis B", 3);
           map.put("MMR", 2);
           map.put("Varicella", 1);
   
        }
        
        else if(age<18)
        {
            // Grades 7 to 12
            
            map.put("Tdap", 1);
            map.put("Polio", 4);
            map.put("Hepatitis B", 3);
            map.put("MMR", 2);
            map.put("Varicella", 2);
            map.put("Meningococcal", 1);
        }
        
        else         
        {
            //College
            map.put("Tdap", 1);
            map.put("Hepatitis B", 3);
            map.put("MMR", 2);
            map.put("Varicella", 2);
            map.put("Meningococcal", 1);     
        }
        
        return map;
        
    }

    
}
