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
    private Teacher teacher;
    //private int maxGroups;
    private Vector<Student> studentList;
    private int groupSize;
    //private 
    
    public Group(String groupName, Teacher teacher, Vector<Student> studentList,
                 int groupSize) {
        setGroupName(groupName);
        this.teacher = teacher;
        setStudentList(studentList);
        setGroupSize(groupSize);
        
        
    }
    
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
    
    
    public Teacher getTeacher() {
        return teacher;
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
