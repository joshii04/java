/*Author: Joshua Sinclair
Title: Registry.java 
WorldCreated: 20//04/2023
Version: 1.0*/

import java.util.*;

public class Registry 
{
    LinkedList<Student> studentList = new LinkedList<Student>(); 
    Scanner myscan = new Scanner(System.in);
    private String adding;

   
    public Registry()
    {
        this.studentList = new LinkedList<Student>();
    }

    /**
     * @param aStudent
     * add new student
     */
    public void addStudent(Student aStudent)
    {
        studentList.add(aStudent);
    }

    /**
     * @param studentID
     * delete student func
     * 
     */

    public void deleteStudent(String studentID)
    {
        List<Student> removeS = new ArrayList<>(); //create temp array to add in the desired deleted Ids
        for (Student temp : studentList) //for comparrison
        {
            if (temp.getStudentID().equals(studentID))// good practice when comparing strings to use equals 
            {
                removeS.add(temp);
                System.out.println("Deleted student: " + studentID);
            }
        }

        studentList.removeAll(removeS);
        if (removeS.size() == 0)
        {
            System.out.println("Student with ID " + studentID + " not found.");
        }
    }

    /* public void deleteStudent(String studentID) sam method
    {
        for (Student temp : studentList) //for comparrison
        {
            if (temp.getStudentID().equals(studentID))// good practice when comparing strings to use equals 
            {
                studentList.remove(temp);
                System.out.println("Deleted student: " + temp);
            }
        }
    }*/



    /**
     * @return format 
     * expected format 
     */
    public String format()
    {
        String list = "---------------Expected-----------------";

        for(Student st: studentList)
        {
            list+=st.format(); 
        }

        return list; 
    }

    /**
     * @return toString 
     * actual output
     */
    public String toString()
    {
        String list = "\n---------------------------------Register------------------------------------\n";

        for(Student st: studentList)
        {
            list+=st.toString(); //populates the list
        }

        return list; 
        
    }
     

}
