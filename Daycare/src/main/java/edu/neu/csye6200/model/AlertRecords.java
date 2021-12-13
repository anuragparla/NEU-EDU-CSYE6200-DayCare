/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.neu.csye6200.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 *
 * @author varun
 */
public class AlertRecords {
    private Vector<Alert> alerts = new Vector<>();
    
    private static final AlertRecords alertRecords = new AlertRecords();
    private AlertRecords(){
        
    }
    
    public static AlertRecords getInstance(){
        return alertRecords;
    }
    
    public Vector<Alert> getAlerts(){
        return alerts;
    }
    
    public void clearRecords()
    {
         alerts = new Vector<>();
    }
    
}
