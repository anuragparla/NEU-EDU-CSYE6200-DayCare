/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.neu.csye6200.model;

/**
 *
 * @author anuragparla
 */
public class FactoryProvider {
    public static AbstractFactory getFactory(String choice) {
        if ("Person".equalsIgnoreCase(choice)) {
            return new PersonFactory();
        }
        else {
            return null;
        }
    }
    
}
