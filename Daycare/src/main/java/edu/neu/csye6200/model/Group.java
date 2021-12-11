package edu.neu.csye6200.model;

import java.util.Vector;

/**
 *
 * @author hiralrnagda
 */
public class Group {
    private String groupName;
    int teacherId;
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
