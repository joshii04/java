/*Author: Joshua Sinclair
Title: Person.java 
WorldCreated: 02/02/2023
Version: 1.0*/

public class Person
{
    private String forename;
    private String surname; //cannot be changed
    private int age;
    private double height; //in meteres
    private String gender;

   // private int id;

    private static int personCount = 0; //counter static

    public Person(String forename, String surname, int age, double height, String gender) //this is the constructor
    {
        this.forename = forename;
        this.surname = surname;
        this.age = age;
        this.height = height;
        this.gender = gender;

        //incerement number of people that have been generated
        //also assigns id number
       // id = ++numberOfPeople;
        personCount++;
    } 
/*
    public int getid()
    {
        return id; //new method to return the id instance variable
    }
    */

    public static int getPersonCount()
    {
        return personCount;
    }

    public String getForename() //get 
    {
        return this.forename;
    }

    public void setForename(String newFname) //set
    {
        forename = newFname;
    }

    public String getSurname()
    {
        return this.surname;
    }

    public void setSurname(String newSname)
    {
        surname = newSname;
    }

    public int getAge()
    {
        return this.age;
    }

    public void setAge(int newAge)
    {
        age = newAge;
    }

    public double getHeight()
    {
        return this.height;
    }

    public void setHeight(double newHeight)
    {
        height = newHeight;
    }

    public String getGender()
    {
        return this.gender;
    }

    public void setGender(String newGender)
    {
        gender = newGender;
    }

    public String format()
    {
         String n = String.format("%-10s  %-10s  %-10s  %-10s  %-10s \n", getForename(), getSurname(), getAge(), getHeight(), getGender());//s = space

        return n;

        // - creates left align    
    }

    public String toString()
    {
         String n = "Person[foreName="+getForename()+", surName="+ getSurname()+", age="+getAge()+", height="+getHeight()+", gender="+getGender()+"]";
        return n;

    }   
}