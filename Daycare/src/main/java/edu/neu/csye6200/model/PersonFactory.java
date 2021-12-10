/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.neu.csye6200.model;

/**
 *
 * @author anuragparla
 */
public class PersonFactory implements AbstractFactory<Person> {

    @Override
    public Person create(String type, String data) {
        if ("Student".equalsIgnoreCase(type)) {
            return new Student(data);
        }
        else if ("Teacher".equalsIgnoreCase(type)){
            return new Teacher(data);
        }
        return null;
    }

   
    
    
}
