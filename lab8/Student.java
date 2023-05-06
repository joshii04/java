/*Author: Joshua Sinclair
Title: Student.java 
WorldCreated: 20//04/2023
Version: 1.0*/


import java.util.*;

public class Student
{

/**
 *  @author Joshua Sinclair
 */

    private String foreName;
    private String surName;
    private String studentID;
    private String degreeScheme;


    /**
     * @param  foreName
     * fore name of the student 
     * @param  surName
     * sur name of the student 
     * @param  studentID
     *  student id of the student 
     * @param  degreeScheme
     * degree of the student 
     * 
     * This is the constructor that creates the student class
     */
    public Student(String foreName, String surName, String studentID, String degreeScheme)
    {
        this.foreName = foreName; //done
        this.surName = surName; //done
        this.studentID = studentID; //done
        this.degreeScheme = degreeScheme; //done
    }   

    /**
     * @return foreName
     * Returns foreName
     */
    public String getForeName()
    {
        return this.foreName;
    }

    /**
     * @param newFore
     * new foreName
     */
    public void setForeName(String newFore)
    {
        this.foreName = newFore;
    }

    /**
     * @return surName
     * returns the surname
     */
    public String getsurName()
    {
        return this.surName;
    }

    /**
     * @param newSur
     * new surname 
     */
    public void setSurName(String newSur)
    {
        this.surName = newSur;
    }

    /**
     * @return studentID 
     */
    public String getStudentID()
    {
        return this.studentID;
    }

    /**
     * @param newID
     * new ID
     */

    public void setStudentID(String newID)
    {
        this.studentID = newID;
    }

    /**
     * @return degreeScheme
     * return degreeScheme
     */
    public String getDegreeScheme()
    {
        return this.degreeScheme;
    }


    /**
    * @param newDegree
    * parameter for a new degree 
    */

    public void setDegreeScheme(String newDegree)
    {
        this.degreeScheme = newDegree;
    }

    /**
     * @return format
     * returns the test format of the string print
     */
    public String format()
    {
        return "\n[|| TEST || Forename: "+ getForeName()+"| Surname: "+getsurName()+"| StudentID: "+getStudentID()+ "| Degree: "+getDegreeScheme()+"]\n\n";
    }

    /**
     * @return toString
     * returns the String format for the students in reg
     */

    public String toString()
    {
        return "\n Forename: "+ getForeName()+"|| Surname: "+getsurName()+"|| StudentID: "+getStudentID()+ "|| Degree: "+getDegreeScheme()+" \n\n";
    }

}
