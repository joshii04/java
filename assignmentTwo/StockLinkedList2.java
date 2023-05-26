package assignmentTwo;

import java.util.*;
import java.io.*;

//add the part where this class implements the interface stock list

public class StockLinkedList2 implements StockList2
{

    //create linked list

    private LinkedList<StockItem2> items; 

    //set up file read 

    File f = new File("save.dat");

    //set up the linked list as the constructor

    public StockLinkedList2() //instantiate the linked list
    {
        items = new LinkedList<>(); //items will be stored in linked list
    }

    //add item

    public void addItem(StockItem2 item) //dont forget to specify what
    {
        //StockItem2 is the class, and item is the item inside StockItem2

        //set up for loop to add stock 

        for(int i = 0; i < items.size(); i++ ) //itterate through linked list items
        {
            if(item.getItemID().equals(items.get(i).getItemID()))
            {
                //if item id is equal to the indexed item id then don't add 
                System.out.println(" [ Sorry, that item already exists ] ");
                return;
            }

            //otherwise

            items.add(item); //array then add the singular item to the items array
        }

       
    }

     //now create the delete item 

    public void deleteItem(String itemID) throws ItemNotFoundException 
    {
        //set the found to false so that you can turn it true for when you find it

        boolean itemFound = false;

        //create for loop to find the id to delete
        // comaprisson

        for(int i = 0; i < items.size(); i++)
        {
            //create a temp array to put the matched array 
            StockItem2 temp = items.get(i);

            if(temp.getItemID().equals(itemID))
            {
                items.remove(i); //remove the indexed landed on
                System.out.println("[You have deleted: "+ temp + "] ");
                //then change the boolean 
                itemFound = true;
                //break out 
                break;
            }

            //create exception if item doesn't exist

            if(itemFound)
            {
                throw new ItemNotFoundException(" [ Sorry, the item you wanted to delete doesn't exist ] \n");
            }
        }

       

      

    }

     //now update item price 

    public void updateItemPrice(String itemID, double price)
    {
        //find the item id and then update the price, so use string comparison

        for(StockItem2 item : items)
        {
            if(item.getItemID().equals(itemID))
            {
                item.setPrice(price); //update the singular item price 
            }
        }
    }

    //update quantity of the item

    public void updateItemQuantity(String itemID, int quantity)
    {
        for(StockItem2 item : items)
        {
            if(item.getItemID().equals(itemID))
            {
                item.setQuantity(quantity); //access the set and change it
                break;
            }
        }
    }
}
