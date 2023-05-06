/*Author: Joshua Sinclair
Title: StudentTester.java.java 
WorldCreated: 20//04/2023
Version: 1.0*/

import java.util.*;

public class studentTester
{
    /**
     * @param args 
     * this param is not used in a function
     */
    public static void main(String[]args)
    {
        Student student1 = new Student("Joshua", "Sinclair", "CS15246", "Computer science");
        Student student2 = new Student("Alan", "Turing", "OX12378", "Mathematics");
        Student student3 = new Student("Elon", "Musk", "QS1284027", "Physics");

        System.out.println(student1);//works exactly the same as toString
        System.out.println(student2);
        System.out.println(student3);

        //testers 
        student1.setForeName("Paper");
        student1.setSurName("Tester");
        student1.setStudentID("PT2310");
        student1.setDegreeScheme("lines");
        System.out.println(student1.format());//test construct

        student2.setForeName("Lines");
        student2.setSurName("Paper");
        student2.setStudentID("LT126725");
        student2.setDegreeScheme("A4");

        System.out.println(student2.getForeName());//test set and get 
        System.out.println(student2.getsurName());
        System.out.println(student2.getStudentID());
        System.out.println(student2.getDegreeScheme());

    }   
}
