import java.util.*;

public class StudentDemo
{
    
    public static void main(String[] args)
    {
        
        Student jSmith = new Student(1, "John", "Smith", "john1989@gmail.com", 20, 88, 79, 59);
        Student sErickson = new Student(2, "Suzan", "Erickson", "erickson_1990@gmailcom", 19, 91, 72, 85);
        Student jNapoli = new Student(3, "Jack", "Napoli", "the_lawyer99yahoo.com", 19, 85, 84, 87);
        Student eBlack = new Student(4, "Erin", "Black", "erin.black@comcast.net", 22, 91, 98, 82);
        Student eBickerstaff = new Student(5, "Ethan", "Bickerstaff", "emb1270@gmail.com", 26, 85, 93, 100);
		System.out.print(" + eBickerstaff.getGrades() + ");		
    }

	
}