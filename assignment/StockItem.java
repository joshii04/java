/*Author: Joshua Sinclair
Title: StockItem.java 
WorldCreated: 23/04/2023
Version: 1.0*/

import java.io.Serializable;

public class StockItem implements Serializable
{

    /**
     *  @author Joshua Sinclair
     */

    private String itemID;
    private String itemDesc;
    private double price;
    private int quantity;
    private int reOrderLevel;

    /**
     * @param  itemID
     *  item id for the item
     * @param  itemDesc
     *  description for the item
     * @param  price
     *   price for the item
     * @param  reOrderLevel
     *  re order level for the item
     * @param quantity
     * takes in the quantity value
     * 
     * This is the constructor that creates the stock item
     */

    public StockItem(String itemID, String itemDesc, double price, int quantity, int reOrderLevel)
    {
        this.itemID = itemID;
        this.itemDesc = itemDesc;
        this.price = price;
        this.quantity = quantity;
        this.reOrderLevel = reOrderLevel;
    }

    /**
     *  @return itemID
     * returns the item ID
     */

    public String getItemID()
    {
        return this.itemID;
    }

    /**
     * @return itemDesc
     * returns the item description
     */

    public String getItemDesc()
    {
        return this.itemDesc;
    }

    /**
     * @return price
     * returns the price 
     */

    public double getPrice()
    {
        return this.price;
    }

    /**
     * @param newPrice
     * new price
     */

    public void setPrice(double newPrice)
    {
        this.price = newPrice;
    }

    /**
     * @return quantity
     * returns the quantity
     */

    public int getQuantity()
    {
        return this.quantity;
    }

    /**
     * @param newQuantity
     * new quantity
     */

    public void setQuantity(int newQuantity)
    {
        this.quantity = newQuantity;
    }

    /**
     * @return reOrderLevel
     * returns the re order level
     */

    public int getReOrderLevel()
    {
        return this.reOrderLevel;
    }

    /**
     * @param newReorderLevel
     * new re order level
     */

    public void setReOrderLevel(int newReorderLevel)
    {
        this.reOrderLevel = newReorderLevel;
    }

  
    // public String toString()
    // {   
    //     return "\n [Item: "+getItemID()+ " || Description: "+getItemDesc()+" || Price: "+getPrice()+" || Quantity: "+getQuantity()+" || Re-Order Level: "+getReOrderLevel()+"]";
    // }

      /**
     * @return toString
     * returns the object as a formatted sting
     */

    public String toString()
    {   
        return " StockItem [ID: "+getItemID()+ " | DESCRIPTION: "+getItemDesc()+" | PRICE: "+getPrice()+" | QUANTITY: "+getQuantity()+" | RE-ORDER LEVEL: "+getReOrderLevel() + "]\n";
    }

      /**
     * @return format
     * returns the formatted method
     */

    public String format()
    {  
        // return String.format( "\n "+getItemID() + "\t\t" + getItemDesc()+ "\t\t" +getPrice()+ "\t\t" +getQuantity()+ "\t\t" +getReOrderLevel())
        // return String.format("%-20s %-30s %5d %14d %14d \n", getItemID(), getItemDesc(), getPrice(), getQuantity(), getReOrderLevel());
     
        return String.format("%-10s %-20s %-10.2f %-10d %-20d",
        getItemID(), getItemDesc(), getPrice(), getQuantity(), getReOrderLevel());
        
    }

}