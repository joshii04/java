import java.util.*;

/*Author: Joshua Sinclair
Title: RegistryTester.java 
WorldCreated: 20//04/2023
Version: 1.0*/

public class registryTester
{
    public static void main(String[]args)
    {
        Registry register = new Registry();

        register.addStudent(new Student("Josh", "Sinclair", "SA2134", "Computer science"));//add new student via student class format
        register.addStudent(new Student("Alan", "Turing", "OX12234", "Mathematics"));
        register.addStudent(new Student("Mohatma", "Ghandi", "GH1234", "Religion"));

        System.out.println("\n");
        System.out.println("---List of students---\n");
        System.out.println(register);
        
        System.out.println("\n");
        register.deleteStudent("OX12234");//delete by ID 
        System.out.println("\n");

        System.out.println(register.format()); //print the registereed students

        System.out.println(register);//show reg with to string

    }
}