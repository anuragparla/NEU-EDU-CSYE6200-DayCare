/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.neu.csye6200.model;

import java.util.Vector;

/**
 *
 * @author anuragparla
 */
public class Group {
    
    private String groupName;
    private int teacherId;
    //private int maxGroups;
    Vector<Student> studentList;
    int groupSize;

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public Vector<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(Vector<Student> studentList) {
        this.studentList = studentList;
    }

    public int getGroupSize() {
        return groupSize;
    }

    public void setGroupSize(int groupSize) {
        this.groupSize = groupSize;
    }
}
