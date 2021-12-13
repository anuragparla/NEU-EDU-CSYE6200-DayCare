/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.neu.csye6200.controller;

import edu.neu.csye6200.model.DayCare;

/**
 *
 * @author deveshi
 */
public class ConfigureDayCare 
{
    
    public static DayCare configure()
    {
        DayCare dayCare = DayCare.getInstance();
        return dayCare;
    }
    
}
