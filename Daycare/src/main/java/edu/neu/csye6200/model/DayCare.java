package edu.neu.csye6200.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 *
 * @author SanthoshMaddi
 */
public class DayCare {
    
    private static DayCare dayCare;
    
    Vector<Student> studentsList;
    Vector<Teacher> teachersList;
    Vector<Classroom> classRoomsList ;
    
    
     public static DayCare getInstance()
     {
        if(dayCare==null)
        {
            dayCare=new DayCare();
        }
        return dayCare;
    }
     
     
    private DayCare()
    {
        
        studentsList = new Vector<>();
        teachersList = new Vector<>();
        classRoomsList = new Vector<>();
      
    }

    public static DayCare getDayCare() {
        return dayCare;
    }

    public static void setDayCare(DayCare dayCare) {
        DayCare.dayCare = dayCare;
    }

    public Vector
        <Student> getStudentsList() {
        return studentsList;
    }

    public void setStudentsList(Vector<Student> studentsList) {
        this.studentsList = studentsList;
    }

    public Vector<Teacher> getTeachersList() {
        return teachersList;
    }

    public void setTeachersList(Vector<Teacher> teachersList) {
        this.teachersList = teachersList;
    }

    public Vector<Classroom> getClassRoomsList() {
        return classRoomsList;
    }

    public void setClassRoomsList(Vector<Classroom> classRoomsList) {
        this.classRoomsList = classRoomsList;
    }
    
   
}
