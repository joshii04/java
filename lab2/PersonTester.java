/*Author: Joshua Sinclair
Title: Person.java 
WorldCreated: 02/02/2023
Version: 1.0*/

public class PersonTester
{
    public static void main(String[]args)//void is no return
    {
        Person person1 = new Person("smith","joe",25,1.57,"male"); //constructor
        Person person2 = new Person("davis","sian",30,1.77,"female");
        Person person3 = new Person("Travis","joel",50,1.73,"male");
        Person person4 = new Person("Sherril","sandy",60,1.43,"female");
        Person person5 = new Person("Sinclair","josh",18,1.67,"male");

        
        System.out.println(person1.format()); 
        System.out.println(person2.format()); //pulls from objects class
        System.out.println(person3.format()); 
        System.out.println(person4.format()); 
        System.out.println(person5.format()); 

        //testing

        String testForename = person1.getForename();
        String testSurname = person1.getSurname();
        int testAge = person1.getAge();
        double testHeight = person1.getHeight();
        String testGender = person1.getGender();

        person1.setSurname("SurnameTest"); //these are testers
        person1.setForename("ForenameTest");
        person1.setAge(20); //they force new data straight into the classes/objects
        person1.setHeight(1.99);
        person1.setGender("Female");
        System.out.println(person1.toString()); //format is ugly and used for testing
        //will print info above in the format class in class file

        System.out.println(Person.getPersonCount()+" People called");

    }
}