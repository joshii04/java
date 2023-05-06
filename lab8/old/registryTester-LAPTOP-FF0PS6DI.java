public class registryTester
{
    public static void main(String[]args)
    {
        Registry register = new Registry(); //main construct with the LinkedList

        Student student1 = new Student("Joshua", "Sinclair", "CS15246", "Computer science"); //create these students using the student class
        Student student2 =  new Student("Alan", "Turing", "OX12378", "Mathematics");

        register.addStudent(student1); //add these students to the LinkedList
        register.addStudent(student2);

        System.out.println(register); //tests the array list and construct
        System.out.println("-------------------------------------------");
    
        register.deleteStudent("CS15246");//deletes function test
        
        System.out.println(register);
        System.out.println("--------------------------------------------");
        register.deleteStudent("OX12378");
        System.out.println(register);
        System.out.println("All students have been deleted here");
        System.out.println("NONE");

        System.out.println("--------------------------------------------");
        register.addStudent(student1);//test to re add
        System.out.println("adding: "+student1);

    }
}