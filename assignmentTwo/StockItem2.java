package assignmentTwo;
import java.util.*;

public class StockItem2 
{
    private String itemID;
    private String itemDesc;
    private double price;
    private int quantity;
    private int reOrderLevel;

    public StockItem2(String itemID, String itemDesc, double price, int quantity, int reOrderLevel)
    {   //this is the constructor
        //instance variable last

        this.itemID = itemID;
        this.itemDesc = itemDesc;
        this.price = price; 
        this.quantity = quantity;
        this.reOrderLevel = reOrderLevel;
    }

    //create the gets and sets 

    public String getItemID()
    {
        return this.itemID;
    }

    public String getItemDesc()
    {
        return this.itemDesc; 
    }

    public double getPrice()
    {
        return this.price;
    }

    public void setPrice(double newPrice)
    {
        // instance this. var first

        this.price = newPrice;
    }

    public int getQuantity()
    {
        return this.quantity;
    }

    public void setQuantity(int newQuantity)
    {
        this.quantity = newQuantity;
    }

    public int getReOrderLevel()   
    {
        return this.reOrderLevel;
    }

    public void setReOrderLevel(int newReOrderLevel)
    {
        this.reOrderLevel = newReOrderLevel;
    }

    public String toString()
    {   
        return "StockItem [ID: "+getItemID()+ " | DESCRIPTION: "+getItemDesc()+" | PRICE: "+getPrice()+" | QUANTITY: "+getQuantity()+" | RE-ORDER LEVEL: "+getReOrderLevel() + "]\n";
    }

    public String format()
    {
        return String.format("%-10s %-20s %-10.2f %-10d %-20d",
        this.getItemID(), this.getItemDesc(), this.getPrice(), this.getQuantity(), this.getReOrderLevel());
    }

}
