package edu.neu.csye6200.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SanthoshMaddi
 */
public class DayCare {
    
    private static DayCare dayCare;
    
    List<Student> studentsList;
    List<Teacher> teachersList;
    List<Classroom> classRoomsList ;
    
    
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
        
        studentsList = new ArrayList<>();
        teachersList = new ArrayList<>();
        classRoomsList = new ArrayList<>();
      
    }

    public static DayCare getDayCare() {
        return dayCare;
    }

    public static void setDayCare(DayCare dayCare) {
        DayCare.dayCare = dayCare;
    }

    public List<Student> getStudentsList() {
        return studentsList;
    }

    public void setStudentsList(List<Student> studentsList) {
        this.studentsList = studentsList;
    }

    public List<Teacher> getTeachersList() {
        return teachersList;
    }

    public void setTeachersList(List<Teacher> teachersList) {
        this.teachersList = teachersList;
    }

    public List<Classroom> getClassRoomsList() {
        return classRoomsList;
    }

    public void setClassRoomsList(List<Classroom> classRoomsList) {
        this.classRoomsList = classRoomsList;
    }
    
   
}
