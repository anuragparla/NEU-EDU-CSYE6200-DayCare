package edu.neu.csye6200.view;

/**
 *
 * @author Santhosh
 */
public class Student {
    
    private String firstName;
    private String lastName;
    private int age;
    private double gpa;
    private String parentName;
    private String address;
    private String phoneNumber;
   
    public Student(String firstName, String lastName, int age, double gpa, String parentName, String address, String phoneNumber) {
       
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gpa = gpa;
        this.parentName = parentName;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
    /*
    public Student(double gpa, String parentName, String address, String phoneNumber, String data) {
        super(data);
        this.gpa = gpa;
        this.parentName = parentName;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }*/
    
    public Student(String data) {
        
        String[] parsedString = data.split(",");
        
        setFirstName(parsedString[0]);
        setLastName(parsedString[1]);
        setAge(Integer.parseInt(parsedString[2]));
        setGpa(Double.parseDouble(parsedString[3]));
        setParentName(parsedString[4]);
        setAddress(parsedString[5]);
        setPhoneNumber(parsedString[6]);
    }
    

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
        
    public double getGpa() {
        return gpa;
    }

    public String getParentName() {
        return parentName;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    
}
