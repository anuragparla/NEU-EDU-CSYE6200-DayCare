/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.neu.csye6200;

/**
 *
 * @author anuragparla
 */
public class Driver {
    
    
    public static void main(String[] args) {
        System.out.println("Hello world");
        
        DB4OUtil db4OUtil = DB4OUtil.getInstance();
        
        DayCare  dc = db4OUtil.retrieveSystem();
        System.out.println(dc.getName());
        db4OUtil.storeSystem(dc);
    }
    
}
