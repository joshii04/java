import java.util.*;

/*Author: Joshua Sinclair
Title: RegistryCLI.java 
WorldCreated: 20//04/2023
Version: 1.0*/

public class RegistryCLI
{
    private Registry register; //allowd for this file program to use the registry file for info/data
    private Scanner scanIt;// using the scanner from the student class 


    /**
     * @param register
     * pass through the reg
     */
    public RegistryCLI(Registry register)
    {
        this.register = register; //accessing the register from registryTester
        scanIt = new Scanner(System.in);// scanner dunrtion
    }
    // Displays main menu and gets valid option from user
    public void menu()
    {
        int choice; //initialise choise

        System.out.println("\n Register Interface 2000 \n");
        System.out.println("1. Add student");
        System.out.println("2. Delete student");
        System.out.println("3. Print my register");
        System.out.println("4. Exit");

        choice = scanIt.nextInt(); //user value
        scanIt.nextLine();
        
        switch(choice) //1 2 3 or 4
        {
            case 1: //if 1 is chosen, interact with this method
                addStudent();
                break;

            case 2:
                deleteStudent();
                break;

            case 3:
                printRegistry();
                break;

            case 4:
                System.out.println("Thanks for using the Register Interface 2000");
                System.exit(0);
                break; //still need a break to jump out of the switch case

            //here is added a default case, which means that if none of these are chosen it prints the menu again

            default: 
                System.out.println("Invalid choice, please choose again");
                menu();
        }

    }
    private void addStudent()
    {
        //call add student to linked list
        //going to want to add tio each method of set/get 

        System.out.println("Enter Students' first name: ");
        String foreName = scanIt.nextLine(); //dont need to add in \n because nextLine does this already

        System.out.println("Enter Students' last name: ");
        String surName = scanIt.nextLine();

        System.out.println("Enter Students' ID: ");
        String studentID = scanIt.nextLine();

        System.out.println("Enter Students' degree scheme: ");
        String degreeScheme = scanIt.nextLine();

        Student students = new Student(foreName, surName, studentID, degreeScheme); //this is the order of the data from the constructor in the constructor

        //now we need to add the student 

        register.addStudent(students); //adds to the linked list 

        //now return back to menu 

        menu();


    }
    private void deleteStudent()
    {

        String studentID;
        //delete by ID
        System.out.println("Enter Students' ID to delete: ");
        studentID = scanIt.nextLine();
        register.deleteStudent(studentID);// match and delete

        menu(); //go back to menu once completed
        //user can also then chose to delete or add etc from here again
    }
    private void printRegistry()
    {
        //simple print

        System.out.println(register);
        menu(); //call back menu 
    }
}