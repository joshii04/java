/* 
making a car
*/

public class Car //good practice to have captial for a class 
{
    private String brand; //variables 
    private String make;
    private int horsePower; //instances
    private double price;

    public Car(String brand, String make, int horsePower, float price) //constructor
    {
        //here set variables of above 

        this.brand = brand; //this constructs the variables
        this.make = make;
        this.horsePower = horsePower;
        this.price = price;
    }

    public String getBrand()
    {
        return this.brand; //links the method to the constructor 
    }

    public void setBrand(String newBrand)
    {
        brand = newBrand; //this links to the variable
    }

    public String getMake()
    {
        return this.make;
    }

    public void setMake(String newMake)
    {
        make = newMake;
    }

    public int getHorsePower()
    {
        return this.horsePower;
    }

    public void setHorsePower(int newHorsePower)
    {
        horsePower = newHorsePower;
    }

    public double getPrice()
    {
        return this.price;
    }

    public void setPrice(double newprice)
    {
        price = newprice;
    }

    public String format()
    {
        String r = String.format("%12s %12s %d %.2f", //fromatting //see file for more formatting
        getBrand(), getMake(), getHorsePower(), getPrice()); //this will get from method
        
         return r;
    }
}