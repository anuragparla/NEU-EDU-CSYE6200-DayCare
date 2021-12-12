
 
package edu.neu.csye6200.model;

/**

 *
 * @author anuragparla
 */
public class Person extends AbstractPerson {
    protected int age;
    protected String firstName;
    protected String lastName;
    
    public Person( String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    
    public Person(String data) {
        String[] parsedString = data.split(",");
        setFirstName(parsedString[0]);
        setLastName(parsedString[1]);
        setAge(Integer.parseInt(parsedString[2]));
                
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }
    
    
}
