/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.neu.csye6200;

import java.text.ParseException;
import java.util.*;
import java.text.SimpleDateFormat;

/**
 *
 * @author santh
 */
public class DayCare {
    
    private String name;

    
    public DayCare(String name) {
        System.out.println("in constructor");
        this.name = name;
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);

        try
        {
          String dateInString = "7-Jun-2013";
        Date date = formatter.parse(dateInString);   
        }
        catch (ParseException e)
        {
            e.printStackTrace();
        }
       
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    
    
    
}
