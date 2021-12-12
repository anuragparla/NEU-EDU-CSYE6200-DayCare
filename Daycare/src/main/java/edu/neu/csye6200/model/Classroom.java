/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.neu.csye6200.model;

//import java.util.List;
import java.util.Set;
import java.util.Vector;

/**
 *
 * @author anuragparla
 */
public class Classroom {
    private Vector<Group> groups;
    private int ageLower;
    private int ageHigher;
    private int maxGroup;
    
    public Classroom( int ageLower, int ageHigher, int maxGroup) {
        Vector<Group> groups = new Vector<>();
        setGroups(groups);
        setAgeLower(ageLower);
        setAgeHigher(ageHigher);
        setMaxGroup(maxGroup);
        
        
    }

    public Vector<Group> getGroups() {
        return groups;
    }

    public void setGroups(Vector<Group> groups) {
        this.groups = groups;
    }

    public int getAgeLower() {
        return ageLower;
    }

    public void setAgeLower(int ageLower) {
        this.ageLower = ageLower;
    }

    public int getAgeHigher() {
        return ageHigher;
    }

    public void setAgeHigher(int ageHigher) {
        this.ageHigher = ageHigher;
    }

    public int getMaxGroup() {
        return maxGroup;
    }

    public void setMaxGroup(int maxGroup) {
        this.maxGroup = maxGroup;
    }
}
