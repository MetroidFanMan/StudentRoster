/**
 * Maintain a current roster of students within a given course.
 * 
 * @author Ethan Bickerstaff 
 * @date Feb. 2, 2017
 */

import java.util.*;

public class Student extends Roster
{
    private String firstName, lastName, email;
    private int studentId, age;
    private int[] grades;

    public Student(int studentId, String firstName, String lastName, String email, int age, int grade1, int grade2, int grade3)
    {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
        grades = new int[] {grade1, grade2, grade3};
    }
    
    public void setStudentId(int studentId)
    {
        this.studentId = studentId;
    }
    
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }
    
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
    
    public void setEmail(String email)
    {
        this.email = email;
    }
    
    public void setAge(int age)
    {
        this.age = age;
    }
    
    public void setGrades(int[] grades)
    {
        this.grades = grades;
    }
    
    public int getStudentId()
    {
        return studentId;
    }
    
    public String getFirstName()
    {
        return firstName;
    }
    
    public String getLastName()
    {
        return lastName;
    }
    
    public String getEmail()
    {
        return email;
    }
    
    public int getAge()
    {
        return age;
    }
    
    public int[] getGrades()
    {
       return grades;
    }
    
    public void print()
    {
        System.out.print(getStudentId() + "     " + getFirstName() + "     " + getLastName()
        + "     " + getEmail() + "     " + getAge() + "     " + Arrays.toString(grades));
    }
}
