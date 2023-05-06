import java.util.Scanner; //import scanner class


public class cartester
{
    public static void main(String[]args)
    {
        Scanner myObj = new Scanner(System.in); //sysetm get input //creates scanner object 
       
       /* System.out.printf("Enter brand: "); //beyond scope
        String userBrand = myObj.nextLine(); //must be done in here*/

        Car f1 = new Car("Honda", "very fast", 600, 100000.00f); //consructor //needs to match the other file name
        System.out.printf(f1.format()); //calls format class from classes file

        // Hard testing methods

        //more on this on lecture 2 slide 34 
        
        String myBrand = f1.getBrand();
        String myMake = f1.getMake();
        int myHorsePower = f1.getHorsePower();
        double myPrice = f1.getPrice();
        System.out.printf(myBrand + " " + myMake + " " + myHorsePower + " " + myPrice); //creates spaces

        f1.setBrand("mercedes");
        f1.setMake("very slow");
        f1.setHorsePower(300); 
        f1.setPrice(250000.0f);
        System.out.println(f1.format()); //format of the constr

        myBrand = f1.getBrand(); //this is hard testing the above values being inputed into the the set methods
        myMake = f1.getMake();
        myHorsePower = f1.getHorsePower();
        myPrice = f1.getPrice();
        System.out.println(myBrand + " " + myMake + " " + myHorsePower + " " + myPrice);

        //this would be used just a tester class. 
        //usually, you would have another program that would run the real classes and methods/data
    }
}